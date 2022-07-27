package com.sakila.lewis.blockbuster;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@SpringBootApplication
@RestController
@RequestMapping("/Sakila")
public class BlockbusterFilmApplication {

	@Autowired
	private FilmRepository filmRepository;

	public static void main(String[] args) {
		SpringApplication.run(BlockbusterFilmApplication.class, args);
	}

	public BlockbusterFilmApplication(FilmRepository filmRepository){
		this.filmRepository = filmRepository;
	}

	// Create new film.
	@PostMapping("/AddNewFilm")
	public @ResponseBody String addNewFilm(@RequestParam String title, @RequestParam String description, @RequestParam int release_year,
											@RequestParam int language_id, @RequestParam int rental_duration, @RequestParam double rental_rate,
											@RequestParam int length, @RequestParam double replacement_cost, @RequestParam String last_update,
										    @RequestParam String rating, @RequestParam String special_features){
		Film a = new Film(title, description, release_year, language_id, rental_duration, rental_rate, length, replacement_cost, rating, special_features, last_update);
		System.out.println(title + ": " + description);
		filmRepository.save(a);
		return "success";
	}

	// Get films.
	@GetMapping("/AllFilms")
	public @ResponseBody Iterable<Film>getAllActors(){
		return filmRepository.findAll();
	}

	// Get films.
	@GetMapping("/GetFilm")
	public @ResponseBody Optional<Film> getFilm(@RequestParam int id){
		return filmRepository.findById(id);
	}


	// Delete film.
	@DeleteMapping("/DeleteFilmByID")
	public @ResponseBody String deleteFilmById(@RequestParam int id){
		filmRepository.deleteById(id);
		return "success";
	}

}
