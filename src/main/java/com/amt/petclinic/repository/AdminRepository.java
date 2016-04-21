package com.amt.petclinic.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.amt.petclinic.domain.Admin;

public interface AdminRepository extends JpaRepository<Admin, Integer>{

	Admin findByUserName(String username);
}