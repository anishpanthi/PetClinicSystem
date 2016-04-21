package com.amt.petclinic.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
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

	// For the Admin User
	@RequestMapping(value = "/auth/admin/listDoctors/edit/{id}", method = RequestMethod.GET)
	public String editDoctorsByAdmin(@PathVariable("id") int id, Model model) {
		model.addAttribute("editDoctor", doctorService.findById(id));
		model.addAttribute("editUser",doc)
		return "editDoctor";
	}

	// For the Admin User
	@RequestMapping(value = "/auth/admin/listDoctors/edit/{id}", method = RequestMethod.POST)
	public String saveDoctorsByAdmin(@PathVariable("id") int id, @ModelAttribute("editDoctor") Doctor doctor,
			BindingResult resultMovie, ModelMap m) {
		System.out.println("This is the test print.");
		doctorService.update(id, doctor);
		return "redirect:/auth/admin/listDoctors";
	}

	@RequestMapping(value = "/auth/admin/listDoctors", method = RequestMethod.GET)
	public String fromAdminListAllDoctors(Model model) {
		model.addAttribute("doctors", doctorService.findAll());
		return "listDoctors";
	}
	
	@RequestMapping(value = "/auth/admin/listDoctors/delete/{id}", method = RequestMethod.GET)
	public String delete(@PathVariable("id") int id) {
		doctorService.delete(id);
		return "redirect:/auth/admin/listDoctors";
	}
}
