package com.desire.spring.sfgpetclinic.services;

import com.desire.spring.sfgpetclinic.model.Owner;
import com.desire.spring.sfgpetclinic.model.Pet;

import java.util.Set;

public interface PetService {

    Pet findById(Long id);

    Pet save(Pet pet);

    Set<Pet> findAll();
}
