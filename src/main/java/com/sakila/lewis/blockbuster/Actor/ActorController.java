package com.sakila.lewis.blockbuster.Actor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

@CrossOrigin(origins= {"*"}, maxAge = 4800, allowCredentials = "false" )
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
    public @ResponseBody String addActor(@RequestParam String first_name, @RequestParam String last_name){
        Actor a = new Actor(first_name, last_name);
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
    public @ResponseBody Actor getActorByFirstNameLastName(@RequestParam String first_name, @RequestParam String last_name) {
        return actorRepository.findByFirstNameAndLastName(first_name, last_name);
    }

    // Update actor.
    @PatchMapping("/UpdateActorNameByID")
    public @ResponseBody Actor updateActorNameById(@RequestParam int id, @RequestParam String first_name, @RequestParam String last_name) {
        Actor actor = actorRepository
                .findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "No actor exists with that id."));
        actor.setFirstName(first_name);
        actor.setLastName(last_name);
        return actorRepository.save(actor);
    }

    // Delete actor.
    @DeleteMapping("/DeleteActorByID")
    public @ResponseBody String deleteActorById(@RequestParam int id){
        actorRepository.deleteById(id);
        return "success";
    }

}
