package com.amt.petclinic.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.amt.petclinic.domain.Pet;

public interface PetRepository extends JpaRepository<Pet, Integer>{

}
