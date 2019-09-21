package com.github.udavpit.petclinic.services;

import com.github.udavpit.petclinic.models.Owner;

import java.util.Set;

public interface OwnerService {

    Owner findById(Long id);

    Owner findByLastName(String lastName);

    Owner save(Owner owner);

    Set<Owner> findAll();
}
