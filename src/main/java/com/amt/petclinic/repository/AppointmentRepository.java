package com.amt.petclinic.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.amt.petclinic.domain.Appointment;

public interface AppointmentRepository extends JpaRepository<Appointment, Integer>{

}
