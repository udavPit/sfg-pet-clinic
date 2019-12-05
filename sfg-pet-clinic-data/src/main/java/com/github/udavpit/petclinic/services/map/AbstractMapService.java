package com.github.udavpit.petclinic.services.map;

import com.github.udavpit.petclinic.models.BaseEntity;
import com.github.udavpit.petclinic.services.CrudService;

import java.util.*;

public abstract class AbstractMapService<T extends BaseEntity> implements CrudService<T, Long> {

    protected Map<Long, T> map = new HashMap<>();

    @Override
    public Set<T> findAll() {
        return new HashSet<>(map.values());
    }

    @Override
    public Optional<T> findById(Long id) {
        T entity =  map.get(id);
        return Optional.ofNullable(entity);
    }

    @Override
    public Optional<T> save(T entity) {
        T saved = map.put(entity.getId(), entity);
        return Optional.ofNullable(saved);
    }

    @Override
    public void delete(T entity) {
        map.remove(entity.getId());
    }

    @Override
    public void deleteById(Long id) {
        map.remove(id);
    }
}
