package com.amt.petclinic.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.amt.petclinic.service.AppointmentService;
import com.amt.petclinic.service.DoctorService;
import com.amt.petclinic.service.FeedbackService;
import com.amt.petclinic.service.OwnerService;

@Controller
public class AuthController {
	
//	@Autowired
//	private FeedbackService feedbackService;
	
	@Autowired
	private DoctorService doctorService;
	
	@Autowired
	private OwnerService ownerService;
	
	@Autowired
	private AppointmentService appointmentService;
	
	@RequestMapping(value = "/auth/admin/listDoctors", method = RequestMethod.GET)
	public String fromAdminListAllDoctors(Model model) {
		model.addAttribute("doctors", doctorService.findAll());
		return "listDoctors";
	}
	
	@RequestMapping(value = "/auth/admin/listOwners", method = RequestMethod.GET)
	public String fromAdminListAllOwners(Model model) {
		model.addAttribute("owners", ownerService.findAll());
		return "listOwners";
	}
	
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
