package com.github.udavpit.petclinic.services.map;

import com.github.udavpit.petclinic.models.Owner;
import com.github.udavpit.petclinic.services.OwnerService;

import java.util.Optional;

public class OwnerServiceMap extends AbstractMapService<Owner> implements OwnerService {

    @Override
    public Optional<Owner> findByLastName(String lastName) {
        return map.values().stream()
                .filter(owner -> lastName.equals(owner.getLastName()))
                .findAny();
    }
}
