package com.amt.petclinic.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.amt.petclinic.domain.Appointment;
import com.amt.petclinic.domain.Owner;
import com.amt.petclinic.service.AppointmentService;
import com.amt.petclinic.service.OwnerService;

@Controller
public class AppointmentController {

	@Autowired
	private AppointmentService appointmentService;

	@Autowired
	private OwnerService ownerService;

	@RequestMapping(value = "auth/owner/appointment", method = RequestMethod.GET)
	public String appointmentPage(Model model) {
		model.addAttribute("appointmentForm", new Appointment());
		return "appointment";
	}

	@RequestMapping(value = "auth/owner/appointment", method = RequestMethod.POST)
	public String submitAppointmentForm(@ModelAttribute("appointmentForm") Appointment appointment,
			BindingResult appointmentResult) {

		User user = (User) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
		String username = user.getUsername();
		Owner owner = ownerService.findByUsername(username);

		appointment.setOwner(owner);
		appointmentService.create(appointment);
		return "redirect:/auth/owner/payment";
	}
}
