package com.amt.petclinic.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.amt.petclinic.domain.Owner;
import com.amt.petclinic.domain.Payment;
import com.amt.petclinic.service.OwnerService;
import com.amt.petclinic.service.PaymentService;

@Controller
public class PaymentController {

	@Autowired
	private PaymentService paymentService;

	@Autowired
	private OwnerService ownerService;

	@RequestMapping(value = "auth/owner/payment", method = RequestMethod.GET)
	public String paymentPage(Model model) {
		User user = (User) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
		String username = user.getUsername();
		Owner owner = ownerService.findByUsername(username);
		model.addAttribute("owner", owner);

		List<String> paymentModes = new ArrayList<String>();
		paymentModes.add("VISA");
		paymentModes.add("CREDIT");
		paymentModes.add("MASTERCARD");
		model.addAttribute("modes", paymentModes);
		model.addAttribute("paymentForm", new Payment());
		return "payment";
	}

	@RequestMapping(value = "auth/owner/payment", method = RequestMethod.POST)
	public String submitpayment(@ModelAttribute("paymentForm") Payment payment, BindingResult paymentResult,
			@ModelAttribute("owner") Owner owner, BindingResult ownerResult) {
		User user = (User) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
		String username = user.getUsername();
		Owner finalOwner = ownerService.findByUsername(username);

		payment.setOwner(finalOwner);
		paymentService.create(payment);

		return "redirect:/auth/owner";
	}

	@RequestMapping(value = "/listpayments", method = RequestMethod.GET)
	public String listAllPayments(Model model) {
		model.addAttribute("payments", paymentService.findAll());
		return "listpayments";
	}

}
