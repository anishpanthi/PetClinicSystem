package com.amt.petclinic.service;

import java.util.List;

import com.amt.petclinic.domain.Appointment;

public interface AppointmentService {

	public void create(Appointment appointment);

	public void delete(int id);

	public List<Appointment> findAll();

	public void update(Appointment appointment);

	public Appointment findById(int id);

}
