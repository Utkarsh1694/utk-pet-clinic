package guru.springframework.utkpetclinic.services;


import guru.springframework.utkpetclinic.model.Pet;

import java.util.Set;

public interface PetService {

    Pet findById(Long id);

    Pet save(Pet owner);

    Set<Pet> findAll();
}
