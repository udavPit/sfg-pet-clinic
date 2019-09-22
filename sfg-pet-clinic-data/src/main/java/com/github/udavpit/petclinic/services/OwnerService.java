package com.github.udavpit.petclinic.services;

import com.github.udavpit.petclinic.models.Owner;

import java.util.Optional;

public interface OwnerService extends CrudService<Owner, Long> {

    Optional<Owner> findByLastName(String lastName);
}
