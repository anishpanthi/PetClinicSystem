package com.amt.petclinic.service;

import com.amt.petclinic.domain.Admin;
import com.amt.petclinic.domain.Doctor;

public interface AdminService {

	public void create(Admin admin);

	public void update(Doctor doctor);

	public Admin findById(int id);
	
	public Admin findByUsername(String username);

}
