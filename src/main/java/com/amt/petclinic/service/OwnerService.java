package com.amt.petclinic.service;

import java.util.List;

import com.amt.petclinic.domain.Owner;

public interface OwnerService {

	public void create(Owner owner);

	public void delete(int id);

	public List<Owner> findAll();

	public void update(int id, Owner owner);

	public Owner findById(int id);
	
	public Owner findByUsername(String username);

}
