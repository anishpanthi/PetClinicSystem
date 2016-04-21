package com.amt.petclinic.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.amt.petclinic.domain.Admin;
import com.amt.petclinic.domain.Doctor;
import com.amt.petclinic.repository.AdminRepository;
import com.amt.petclinic.service.AdminService;

@Component
@Transactional
public class AdminServiceImpl implements AdminService {

	@Autowired
	private AdminRepository adminRepository;

	@Override
	public void create(Admin admin) {
		adminRepository.save(admin);
	}

	@Override
	public void update(Doctor doctor) {
		// TODO Auto-generated method stub
	}

	@Override
	public Admin findById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Admin findByUsername(String username) {
		return adminRepository.findByUserName(username);
	}
}
