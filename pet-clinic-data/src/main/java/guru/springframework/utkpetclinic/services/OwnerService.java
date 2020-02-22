package guru.springframework.utkpetclinic.services;


import guru.springframework.utkpetclinic.model.Owner;

import java.util.Set;

public interface OwnerService extends CrudService<Owner, Long> {

    Owner findByLastName(String lastName);

}
