package com.desire.spring.sfgpetclinic.services;

import com.desire.spring.sfgpetclinic.model.Owner;
import com.desire.spring.sfgpetclinic.model.Vet;

import java.util.Set;

public interface VetService {
    Vet findById(Long id);

    Vet save(Vet vet);

    Set<Vet> findAll();
}
