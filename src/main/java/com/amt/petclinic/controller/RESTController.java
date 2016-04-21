package com.amt.petclinic.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.amt.petclinic.domain.Doctor;
import com.amt.petclinic.domain.Feedback;
import com.amt.petclinic.domain.Owner;
import com.amt.petclinic.service.DoctorService;
import com.amt.petclinic.service.FeedbackService;
import com.amt.petclinic.service.OwnerService;
import com.amt.petclinic.test.Country;

@Component
@RestController
public class RESTController {

	@Autowired
	private FeedbackService feedbackService;

	@Autowired
	private DoctorService doctorService;

	@Autowired
	OwnerService ownerService;

	@RequestMapping(value = "/api/getAllComments", method = RequestMethod.GET, headers = "Accept=application/json")
	public List<Feedback> getAllFeedbacks() {
		return feedbackService.findAll();
	}

	@RequestMapping(value = "/api/getAllDoctors", method = RequestMethod.GET, headers = "Accept=application/json")
	public List<Doctor> getAllDoctors() {
		return doctorService.findAll();
	}

	@RequestMapping(value = "/api/getAllOwners", method = RequestMethod.GET, headers = "Accept=application/json")
	public List<Owner> getAllOwners() {
		return ownerService.findAll();
	}
}
