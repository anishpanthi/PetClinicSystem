package com.amt.petclinic.service;

import java.util.List;

import com.amt.petclinic.domain.Doctor;

public interface DoctorService {

	public void create(Doctor doctor);

	public void delete(int id);

	public List<Doctor> findAll();

	public void update(int id, Doctor doctor);

	public Doctor findById(int id);
	
	public Doctor findByUsername(String username);

}
