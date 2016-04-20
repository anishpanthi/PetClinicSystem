package com.amt.petclinic.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.amt.petclinic.domain.Owner;

public interface OwnerRepository extends JpaRepository<Owner, Integer>{

}
