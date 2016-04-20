package com.amt.petclinic.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.amt.petclinic.domain.Doctor;
import com.amt.petclinic.domain.User;
import com.amt.petclinic.service.DoctorService;

@Controller
public class DoctorController {
	@Autowired
	private DoctorService doctorService;

	// map the request if it is coming from get method through doctor , retrun
	// doctor page
	@RequestMapping(value = "/doctor", method = RequestMethod.GET)
	public String doctorPage(Model model) {
		model.addAttribute("doctorForm", new Doctor());
		model.addAttribute("userForm", new User());
		return "doctor";
	}

	// if request is coming from POST method through feedback return the list of
	// doctors page
	@RequestMapping(value = "/doctor", method = RequestMethod.POST)
	public String submitForm(@ModelAttribute("doctorForm") @Valid Doctor doctor, BindingResult doctorResult,
			@ModelAttribute("userForm") User user) {

		String view = "redirect:/login";
		if (!doctorResult.hasErrors()) {
			user.setUserrole("ROLE_DOCTOR");
			doctor.setUserName(user.getUsername());
			doctor.setUser(user);
			doctorService.create(doctor);
		} else {
			view = "doctor";
		}
		return view;
	}

	@RequestMapping(value = "/listDoctors", method = RequestMethod.GET)
	public String listAllDoctors(Model model) {
		model.addAttribute("doctors", doctorService.findAll());
		return "listDoctors";
	}

}
