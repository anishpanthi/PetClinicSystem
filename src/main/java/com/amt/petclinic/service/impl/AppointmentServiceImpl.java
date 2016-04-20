package com.amt.petclinic.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.amt.petclinic.domain.Appointment;
import com.amt.petclinic.repository.AppointmentRepository;
import com.amt.petclinic.service.AppointmentService;

@Component
@Transactional
public class AppointmentServiceImpl implements AppointmentService {

	@Autowired
	private AppointmentRepository appointmentRepository;

	@Override
	public void create(Appointment appointment) {
		appointmentRepository.save(appointment);
	}

	@Override
	public List<Appointment> findAll() {
		return appointmentRepository.findAll();
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub

	}

	@Override
	public void update(Appointment appointment) {
		// TODO Auto-generated method stub

	}

	@Override
	public Appointment findById(int id) {
		// TODO Auto-generated method stub
		return null;
	}
}
