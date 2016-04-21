package com.amt.petclinic.controller;

import java.util.Arrays;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.amt.petclinic.domain.Owner;
import com.amt.petclinic.domain.Pet;
import com.amt.petclinic.domain.User;
import com.amt.petclinic.service.OwnerService;
import com.amt.petclinic.service.PetService;

@Controller
public class OwnerController {

	@Autowired
	private OwnerService ownerService;
	@Autowired
	private PetService petService;

	@RequestMapping(value = "/ownerRegistration", method = RequestMethod.GET)
	public String ownerPage(Model model, Owner owner) {
		model.addAttribute("ownerForm", new Owner());
		model.addAttribute("userForm", new User());
		model.addAttribute("petForm", new Pet());
		return "ownerRegistration";
	}

	@RequestMapping(value = "/ownerRegistration", method = RequestMethod.POST)
	public String submitForm(@ModelAttribute("ownerForm") @Valid Owner owner, BindingResult resultOwner,
			@ModelAttribute("userForm") @Valid User user, BindingResult resultUser,
			@ModelAttribute("petForm") @Valid Pet pet, BindingResult resultPet) {

		String view = "redirect:/login";
		if (!resultOwner.hasErrors() && !resultUser.hasErrors() && !resultPet.hasErrors()) {
			owner.setPetList(Arrays.asList(pet));
			user.setUserrole("ROLE_OWNER");
			owner.setUserName(user.getUsername());

			owner.setUser(user);
			petService.create(pet);
			ownerService.create(owner);
		} else {
			view = "ownerRegistration";
		}
		return view;
	}

	@RequestMapping(value = "/listOwner")
	public String owner(Model model) {
		model.addAttribute("models", ownerService.findAll());
		return "listOwner";

	}

	// For the Admin User
	@RequestMapping(value = "/auth/admin/listOwners/edit/{id}", method = RequestMethod.GET)
		public String editOwnersByAdmin(@PathVariable("id") int id, Model model) {
			model.addAttribute("editOwner", ownerService.findById(id));
			return "editOwner";
		}

	// For the Admin User
	@RequestMapping(value = "/auth/admin/listOwners/edit/{id}", method = RequestMethod.POST)
	public String saveOwnersByAdmin(@PathVariable("id") int id, @ModelAttribute("editOwner") Owner owner,
			BindingResult resultMovie, ModelMap m) {
		ownerService.update(id, owner);
		return "redirect:/auth/admin/listOwners";
	}

	@RequestMapping(value = "/auth/admin/listOwners", method = RequestMethod.GET)
	public String fromAdminListAllDoctors(Model model) {
		model.addAttribute("owners", ownerService.findAll());
		return "listOwners";
	}

	@RequestMapping(value = "/auth/admin/listOwners/delete/{id}", method = RequestMethod.GET)
	public String delete(@PathVariable("id") int id) {
		ownerService.delete(id);
		return "redirect:/auth/admin/listOwners";
	}
}
