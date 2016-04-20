package com.amt.petclinic.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.amt.petclinic.domain.Owner;
import com.amt.petclinic.repository.OwnerRepository;
import com.amt.petclinic.service.OwnerService;

@Component
@Transactional
public class OwnerServiceImpl implements OwnerService {

	@Autowired
	private OwnerRepository ownerRepository;

	@Override
	public void create(Owner owner) {
		ownerRepository.save(owner);
	}

	@Override
	public List<Owner> findAll() {
		return ownerRepository.findAll();
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub

	}

	@Override
	public void update(Owner owner) {
		// TODO Auto-generated method stub

	}

	@Override
	public Owner findById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Owner findByUsername(String username) {
		return ownerRepository.findByUserName(username);
	}
}
