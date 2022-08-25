package com.sakila.lewis.blockbuster.film;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.Optional;

@CrossOrigin(origins= {"*"}, maxAge = 4800, allowCredentials = "false" )
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
    public @ResponseBody String addNewFilm(@RequestBody FilmDTO filmDTO){
        Film a = new Film(filmDTO);
        System.out.println(filmDTO.getTitle() + ": " + filmDTO.getDescription());
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

    // Delete film by title.
    @DeleteMapping("/DeleteFilmByTitle")
    public @ResponseBody String deleteFilmByTitle(@RequestParam String title){
        List<Film> films = filmRepository.findByTitle(title);
        if(films.size() > 0){
            filmRepository.deleteById(films.get(0).getId());
        }
        return "success";
    }

    // Update film with filmDTO content.
    @PatchMapping("/UpdateFilmByID")
    public @ResponseBody Film updateFilmById(@RequestParam int id, @RequestBody FilmDTO filmDTO) {
        Film film = filmRepository
                .findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "No actor exists with that id."));
        film.dtoConversion(filmDTO);
        return filmRepository.save(film);
    }

    // Update film found by title with filmDTO content.
    @PatchMapping("/UpdateFilmByTitle")
    public @ResponseBody Film updateFilmByTitle(@RequestParam String title, @RequestBody FilmDTO filmDTO) {
        List<Film> films = filmRepository.findByTitle(title);
        films.get(0).dtoConversion(filmDTO);
        return filmRepository.save(films.get(0));
    }

}