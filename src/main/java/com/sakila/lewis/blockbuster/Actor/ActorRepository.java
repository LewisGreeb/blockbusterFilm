package com.sakila.lewis.blockbuster.Actor;

import com.sakila.lewis.blockbuster.Language.Language;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ActorRepository extends CrudRepository<Actor, Integer> {
    List<Actor> findByFirstNameAndLastName(String first_name, String last_name);
}
