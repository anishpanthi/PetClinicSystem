package com.amt.petclinic.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.amt.petclinic.domain.Appointment;
import com.amt.petclinic.domain.Owner;
import com.amt.petclinic.service.AppointmentService;

@Controller
public class AppointmentController {

	@Autowired
	private AppointmentService appointmentService;

	@RequestMapping(value = "auth/owner/appointment", method = RequestMethod.GET)
	public String appointmentPage(Model model) {
		model.addAttribute("appointmentForm", new Appointment());
		model.addAttribute("ownerForm", new Owner());
		return "appointment";
	}

	@RequestMapping(value = "auth/owner/appointment", method = RequestMethod.POST)
	public String submitAppointmentForm(@ModelAttribute("appointmentForm") Appointment appointment,
			@ModelAttribute("ownerForm") Owner owner, BindingResult appointmentResult) {

		appointment.setOwnerid(owner);
		System.out.println("apointment id before:: " + appointment.getId());
		appointmentService.create(appointment);
		System.out.println("apointment id after:: " + appointment.getId());
		return "redirect:/listAppointment";
	}

	@RequestMapping(value = "/listAppointment")
	public String appointmentList(Model model) {

		model.addAttribute("appointments", appointmentService.findAll());
		return "listAppointment";

	}

}
