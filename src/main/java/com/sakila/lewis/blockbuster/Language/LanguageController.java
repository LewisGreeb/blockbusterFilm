package com.sakila.lewis.blockbuster.Language;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.Optional;

@CrossOrigin(origins= {"*"}, maxAge = 4800, allowCredentials = "false" )
@RestController
@RequestMapping("/language")
public class LanguageController {

    @Autowired
    private LanguageRepository languageRepository;

    public LanguageController(LanguageRepository languageRepository){
        this.languageRepository = languageRepository;
    }

    // Create new language.
    @PostMapping
    public @ResponseBody String addNewLanguage(@RequestParam String name){
        Language lang = new Language(name);
        System.out.println(name);
        languageRepository.save(lang);
        return "success";
    }

    // Get language.
    @GetMapping("/AllLanguages")
    public @ResponseBody Iterable<Language>getAllLanguages(){
        return languageRepository.findAll();
    }

    // Get language.
    @GetMapping("/GetLanguage")
    public @ResponseBody Optional<Language> getLanguage(@RequestParam int id){
        return languageRepository.findById(id);
    }

    // Delete language.
    @DeleteMapping("/DeleteLanguageByID")
    public @ResponseBody String deleteLanguageById(@RequestParam int id){
        languageRepository.deleteById(id);
        return "success";
    }

    // Update language name.
    @PatchMapping("/UpdateLanguageNameByID")
    public @ResponseBody Language updateLanguageNameById(@RequestParam int id, @RequestParam String name) {
        Language lang = languageRepository
                .findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "No actor exists with that id."));
        lang.setName(name);
        return languageRepository.save(lang);
    }
}
