package com.sakila.lewis.blockbuster.actor;

import org.springframework.data.repository.CrudRepository;

public interface ActorRepository extends CrudRepository<Actor, Integer> {
    Actor findByFirstNameAndLastName(String firstName, String lastName);
}
