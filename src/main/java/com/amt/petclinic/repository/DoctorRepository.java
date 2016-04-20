package com.amt.petclinic.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.amt.petclinic.domain.Doctor;

public interface DoctorRepository extends JpaRepository<Doctor, Integer>{

}
