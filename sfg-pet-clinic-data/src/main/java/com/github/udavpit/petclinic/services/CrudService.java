package com.github.udavpit.petclinic.services;

import java.util.Optional;
import java.util.Set;

public interface CrudService<T, ID> {

    Set<T> findAll();

    Optional<T> findById(ID id);

    Optional<T> save(T entity);

    void delete(T entity);

    void deleteById(ID id);
}
