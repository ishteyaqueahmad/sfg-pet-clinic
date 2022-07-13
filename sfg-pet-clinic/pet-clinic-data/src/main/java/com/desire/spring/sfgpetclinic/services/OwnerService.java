package com.desire.spring.sfgpetclinic.services;

import com.desire.spring.sfgpetclinic.model.Owner;

import java.util.Set;

public interface OwnerService extends CrudService<Owner, Long> {

    Owner findByLastName(String lastName);

}
