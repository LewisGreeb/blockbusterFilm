package com.sakila.lewis.blockbuster.Film;

import com.sakila.lewis.blockbuster.Actor.Actor;
import com.sakila.lewis.blockbuster.Film.Film;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/film")
public class FilmController {

    @Autowired
    private FilmRepository filmRepository;

    public FilmController(FilmRepository filmRepository){
        this.filmRepository = filmRepository;
    }

    // Create new film.
    @PostMapping("/AddNewFilm")
    public @ResponseBody String addNewFilm(@RequestParam String title, @RequestParam String description, @RequestParam int release_year,
                                           @RequestParam int language_id, @RequestParam int rental_duration, @RequestParam double rental_rate,
                                           @RequestParam int length, @RequestParam double replacement_cost, @RequestParam String rating,
                                           @RequestParam String special_features){
        Film a = new Film(title, description, release_year, language_id, rental_duration, rental_rate, length, replacement_cost, rating, special_features);
        System.out.println(title + ": " + description);
        filmRepository.save(a);
        return "success";
    }

    // Get films.
    @GetMapping("/AllFilms")
    public @ResponseBody Iterable<Film>getAllFilms(){
        return filmRepository.findAll();
    }

    // Get films and find by name.
    @GetMapping("/GetFilmByTitle")
    public @ResponseBody List<Film> getFilmByTitle(@RequestParam String title) {
        return filmRepository.findByTitle(title);
    }

    // Get films and find by name.
    @GetMapping("/GetFilmByPartialTitle")
    public @ResponseBody List<Film> getFilmByPartialTitle(@RequestParam String title) {
        return filmRepository.findByTitleContains(title);
    }

    // Get film by ID.
    @GetMapping("/GetFilmByID")
    public @ResponseBody Optional<Film> getFilmById(@RequestParam int id){
        return filmRepository.findById(id);
    }

    // Delete film by ID.
    @DeleteMapping("/DeleteFilmByID")
    public @ResponseBody String deleteFilmById(@RequestParam int id){
        filmRepository.deleteById(id);
        return "success";
    }

    // Update film title.
    @PatchMapping("/UpdateFilmTitleByID")
    public @ResponseBody Film updateFilmTitleById(@RequestParam int id, @RequestParam String title) {
        Film actor = filmRepository
                .findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "No actor exists with that id."));
        actor.setTitle(title);
        return filmRepository.save(actor);
    }

    // Update film description.
    @PatchMapping("/UpdateFilmDescriptionByID")
    public @ResponseBody Film updateFilmDescriptionById(@RequestParam int id, @RequestParam String desc) {
        Film actor = filmRepository
                .findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "No actor exists with that id."));
        actor.setDescription(desc);
        return filmRepository.save(actor);
    }

    // Update film runtime.
    @PatchMapping("/UpdateFilmRuntimeByID")
    public @ResponseBody Film updateFilmRuntimeById(@RequestParam int id, @RequestParam int runtime) {
        Film film = filmRepository
                .findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "No actor exists with that id."));
        film.setLength(runtime);
        return filmRepository.save(film);
    }

}
