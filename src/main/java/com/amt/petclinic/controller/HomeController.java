package com.amt.petclinic.controller;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.amt.petclinic.dao.FeedbackDAO;
import com.amt.petclinic.domain.Feedback;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {

	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);

	@Resource
	private FeedbackDAO feedbackDAO;

	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
//	public ModelAndView home(Locale locale, Model model) {
		public ModelAndView home() {
		// logger.info("Welcome home! The client locale is {}.", locale);
		// Date date = new Date();
		// DateFormat dateFormat =
		// DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG,
		// locale);
		// String formattedDate = dateFormat.format(date);
		// model.addAttribute("serverTime", formattedDate);
		
		ModelAndView model = new ModelAndView();
		model.addObject("title", "Spring Security Hello World");
		model.addObject("message", "This is welcome page!");
		model.setViewName("home");
		return model;
		
//		return "home";
	}
	
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String loginPage(Model model) {
		return "login";
	}

	@RequestMapping(value = "/feedback", method = RequestMethod.GET)
	public String openAddMoviePage(Model model) {
		model.addAttribute("feedback", new Feedback());
		return "feedback";
	}

	@RequestMapping(value = "/feedback", method = RequestMethod.POST)
	public String submitForm(@ModelAttribute("feedback") Feedback feedback, BindingResult resultFeedback, ModelMap m) {
		feedbackDAO.create(feedback);
		return "redirect:/listFeedbacks";
	}

	@RequestMapping(value = "/listFeedbacks", method = RequestMethod.GET)
	public String listAllFeedbacks(Model model) {
		model.addAttribute("feedbacks", feedbackDAO.findAll());
		return "listFeedbacks";
	}

	@RequestMapping(value = "/admin**", method = RequestMethod.GET)
	public ModelAndView adminPage() {
		ModelAndView model = new ModelAndView();
		model.addObject("title", "Spring Security Hello World");
		model.addObject("message", "This is protected page - Admin Page!");
		model.setViewName("admin");
		return model;
	}

	@RequestMapping(value = "/dba**", method = RequestMethod.GET)
	public ModelAndView dbaPage() {
		ModelAndView model = new ModelAndView();
		model.addObject("title", "Spring Security Hello World");
		model.addObject("message", "This is protected page - Database Page!");
		model.setViewName("admin");
		return model;
	}
}
