package com.github.udavpit.petclinic.services;

import com.github.udavpit.petclinic.models.Pet;

import java.util.Set;

public interface PetService {

    Pet findById(Long id);

    Pet save(Pet pet);

    Set<Pet> findAll();
}
