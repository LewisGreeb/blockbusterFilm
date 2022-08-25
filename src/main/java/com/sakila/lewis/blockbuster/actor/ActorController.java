package com.sakila.lewis.blockbuster.actor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

@CrossOrigin(origins= {"http://localhost:4200/"}, maxAge = 4800, allowCredentials = "false" )
@RestController
@RequestMapping("/actor")
public class ActorController {

    @Autowired
    ActorRepository actorRepository;

    public ActorController(ActorRepository actorRepository){
        this.actorRepository = actorRepository;
    }

    // Add new actor.
    @PostMapping("/AddActor")
    public @ResponseBody String addActor(@RequestParam String firstName, @RequestParam String lastName){
        Actor a = new Actor(firstName, lastName);
        actorRepository.save(a);
        return "success";
    }

    // Get all actors.
    @GetMapping("/AllActors")
    public @ResponseBody Iterable<Actor>getAllActors(){
        return actorRepository.findAll();
    }

    // Get actors by name.
    @GetMapping("/GetActorByFirstNameLastName")
    public @ResponseBody Actor getActorByFirstNameLastName(@RequestParam String firstName, @RequestParam String lastName) {
        return actorRepository.findByFirstNameAndLastName(firstName, lastName);
    }

    // Update actor.
    @PatchMapping("/UpdateActorNameByID")
    public @ResponseBody Actor updateActorNameById(@RequestParam int id, @RequestParam String firstName, @RequestParam String lastName) {
        Actor actor = actorRepository
                .findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "No actor exists with that id."));
        actor.setFirstName(firstName);
        actor.setLastName(lastName);
        return actorRepository.save(actor);
    }

    // Delete actor.
    @DeleteMapping("/DeleteActorByID")
    public @ResponseBody String deleteActorById(@RequestParam int id){
        actorRepository.deleteById(id);
        return "success";
    }

}
