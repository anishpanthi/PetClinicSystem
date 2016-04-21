package com.amt.petclinic.controller;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.amt.petclinic.domain.Admin;
import com.amt.petclinic.domain.Doctor;
import com.amt.petclinic.domain.Feedback;
import com.amt.petclinic.domain.Owner;
import com.amt.petclinic.service.AdminService;
import com.amt.petclinic.service.DoctorService;
import com.amt.petclinic.service.FeedbackService;
import com.amt.petclinic.service.OwnerService;

@Controller
public class HomeController {

	@Autowired
	private FeedbackService feedbackService;

	@Autowired
	private DoctorService doctorService;

	@Autowired
	private OwnerService ownerService;

	@Autowired
	private AdminService adminService;

	HttpSession session = null;

	@RequestMapping(value = { "/", "/welcome**" }, method = RequestMethod.GET)
	public ModelAndView home(Locale locale) {
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		String formattedDate = dateFormat.format(date);

		Admin adminExists = adminService.findByUsername("admin");
		if (adminExists == null) {
			com.amt.petclinic.domain.User user = new com.amt.petclinic.domain.User();
			user.setUsername("admin");
			user.setPassword("admin");
			user.setUserrole("ROLE_ADMIN");

			Admin admin = new Admin("admin@gmail.com", "Pramila", "Bhandari", user.getUsername(), "9851177720",
					"Bhairahawa", "10", "Region-5", "234", "32600", user);
			admin.setUser(user);
			adminService.create(admin);
		}

		ModelAndView model = new ModelAndView();
		model.addObject("serverTime", formattedDate);
		model.setViewName("home");
		return model;
	}

	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public ModelAndView login(@RequestParam(value = "authFailed", required = false) String authFailed,
			@RequestParam(value = "logout", required = false) String logout) {

		ModelAndView model = new ModelAndView();
		if (authFailed != null) {
			model.addObject("authFailed", "Invalid username and password!");
		}

		if (logout != null) {
			model.addObject("msg", "You've been logged out successfully.");
		}
		model.setViewName("login");

		return model;
	}

	@RequestMapping(value = "/feedback", method = RequestMethod.GET)
	public String openAddMoviePage(Model model) {
		model.addAttribute("feedback", new Feedback());
		return "feedback";
	}

	@RequestMapping(value = "/feedback", method = RequestMethod.POST)
	public String submitForm(@ModelAttribute("feedback") @Valid Feedback feedback, BindingResult resultFeedback,
			ModelMap m) {
		String view = "redirect:/listFeedbacks";
		if (!resultFeedback.hasErrors()) {
			feedbackService.create(feedback);
		} else {
			view = "feedback";
		}
		return view;
	}

	@RequestMapping(value = "/listFeedbacks", method = RequestMethod.GET)
	public String listAllFeedbacks(Model model) {
		model.addAttribute("feedbacks", feedbackService.findAll());
		return "listFeedbacks";
	}

	@RequestMapping(value = "/auth", method = RequestMethod.GET)
	public String afterLoginPage() {
		return "auth";
	}

	@RequestMapping(value = "/auth/admin", method = RequestMethod.GET)
	public String afterAuthAdminPage(Model model) {
		User user = (User) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
		String username = user.getUsername();
		Admin admin = adminService.findByUsername(username);
		model.addAttribute("admin", admin);
		return "adminAuth";
	}

	@RequestMapping(value = "/auth/doctor", method = RequestMethod.GET)
	public String afterAuthDoctorPage(Model model) {
		User user = (User) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
		String username = user.getUsername();
		Doctor doctor = doctorService.findByUsername(username);
		model.addAttribute("doctor", doctor);
		return "doctorAuth";
	}

	@RequestMapping(value = "/auth/owner", method = RequestMethod.GET)
	public String afterAuthOwnerPage(Model model) {
		User user = (User) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
		String username = user.getUsername();
		Owner owner = ownerService.findByUsername(username);
		model.addAttribute("owner", owner);
		return "ownerAuth";
	}

	@RequestMapping(value = "/403", method = RequestMethod.GET)
	public String get403denied() {
		return "redirect:/login?authFailed";
	}
}
