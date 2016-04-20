package com.amt.petclinic.service;

import java.util.List;

import com.amt.petclinic.domain.Pet;

public interface PetService {

	public void create(Pet pet);

	public void delete(int id);

	public List<Pet> findAll();

	public void update(Pet pet);

	public Pet findById(int id);

}
