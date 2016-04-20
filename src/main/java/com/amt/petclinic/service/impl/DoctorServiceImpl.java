package com.amt.petclinic.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.amt.petclinic.domain.Doctor;
import com.amt.petclinic.repository.DoctorRepository;
import com.amt.petclinic.service.DoctorService;

@Component
@Transactional
public class DoctorServiceImpl implements DoctorService{
	
	@Autowired
	private DoctorRepository doctorRepository;

	@Override
	public void create(Doctor doctor) {
		doctorRepository.save(doctor);
	}

	@Override
	public List<Doctor> findAll() {
		return doctorRepository.findAll();
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(Doctor doctor) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Doctor findById(int id) {
		// TODO Auto-generated method stub
		return null;
	}
}
