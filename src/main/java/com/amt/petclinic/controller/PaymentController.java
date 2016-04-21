package com.amt.petclinic.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.amt.petclinic.domain.Payment;
import com.amt.petclinic.service.PaymentService;

@Controller
public class PaymentController {

	@Autowired
	private PaymentService paymentService;

	@RequestMapping(value = "auth/owner/payment", method = RequestMethod.GET)
	public String paymentPage(Model model) {
		List<String> paymentModes = new ArrayList<String>();
		paymentModes.add("VISA");
		paymentModes.add("CREDIT");
		paymentModes.add("PAYPAL");
		paymentModes.add("MASTERCARD");
		model.addAttribute("modes", paymentModes);
		model.addAttribute("paymentForm", new Payment());
		// model.addAttribute("userForm", new User());
		return "payment";
	}

	@RequestMapping(value = "auth/owner/payment", method = RequestMethod.POST)
	public String submitpayment(@ModelAttribute("paymentForm") Payment payment, BindingResult paymentResult) {
		// @ModelAttribute("userForm") User user) {
		// user.setUserrole("ROLE_DOCTOR");
		// payment.setUser(user);

		paymentService.create(payment);

		return "redirect:/listpayments";
	}

	@RequestMapping(value = "/listpayments", method = RequestMethod.GET)
	public String listAllPayments(Model model) {
		model.addAttribute("payments", paymentService.findAll());
		return "listpayments";
	}

}
