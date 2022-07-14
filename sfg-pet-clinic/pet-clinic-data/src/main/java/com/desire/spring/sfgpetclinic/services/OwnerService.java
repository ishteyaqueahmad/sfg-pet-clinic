package com.desire.spring.sfgpetclinic.services;

import com.desire.spring.sfgpetclinic.model.Owner;


public interface OwnerService extends CrudService<Owner, Long> {

    Owner findByLastName(String lastName);

}
