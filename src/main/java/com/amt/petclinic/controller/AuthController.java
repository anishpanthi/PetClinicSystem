package com.amt.petclinic.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.amt.petclinic.service.AppointmentService;

@Controller
public class AuthController {
	
	@Autowired
	private AppointmentService appointmentService;
	
	@RequestMapping(value = "/auth/admin/listAppointments", method = RequestMethod.GET)
	public String fromAdminListAllAppointments(Model model) {
		model.addAttribute("appointments", appointmentService.findAll());
		return "listAppointments";
	}
	
	@RequestMapping(value = "/auth/doctor/listAppointments", method = RequestMethod.GET)
	public String fromDoctorListAllAppointments(Model model) {
		model.addAttribute("appointments", appointmentService.findAll());
		return "listAppointments";
	}

}
