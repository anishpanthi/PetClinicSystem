package com.amt.petclinic.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.amt.petclinic.domain.Pet;
import com.amt.petclinic.repository.PetRepository;
import com.amt.petclinic.service.PetService;

@Component
@Transactional
public class PetServiceImpl implements PetService{
	
	@Autowired
	private PetRepository petRepository;

	@Override
	public void create(Pet pet) {
		petRepository.save(pet);
	}

	@Override
	public List<Pet> findAll() {
		return petRepository.findAll();
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(Pet pet) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Pet findById(int id) {
		// TODO Auto-generated method stub
		return null;
	}
}
