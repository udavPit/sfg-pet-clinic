package com.github.udavpit.petclinic.services;

import com.github.udavpit.petclinic.models.Owner;

public interface OwnerService extends CrudService<Owner, Long> {

    Owner findByLastName(String lastName);
}
