package com.desire.spring.sfgpetclinic.services.map;

import com.desire.spring.sfgpetclinic.model.Vet;
import com.desire.spring.sfgpetclinic.services.CrudService;

import java.util.Set;

public class VetServiceMap extends AbstractMapService<Vet,Long> implements CrudService<Vet,Long> {
    @Override
    public Set<Vet> findAll() {
        return super.findAll();
    }

    @Override
    public void delete(Vet object) {
        super.delete(object);
    }

    @Override
    public Vet save(Vet object) {
        return super.save(object.getId(),object);
    }

    @Override
    public void deleteById(Long id) {
        super.deletById(id);
    }

    @Override
    public Vet findById(Long id) {
        return super.findById(id);
    }
}
