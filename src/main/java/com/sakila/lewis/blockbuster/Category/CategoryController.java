package com.sakila.lewis.blockbuster.Category;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.Optional;

@CrossOrigin(origins= {"*"}, maxAge = 4800, allowCredentials = "false" )
@RestController
@RequestMapping("/category")
public class CategoryController {

    @Autowired
    CategoryRepository categoryRepository;

    public CategoryController(CategoryRepository categoryRepository){
        this.categoryRepository = categoryRepository;
    }

    // Add category.
    @PostMapping("/AddCategory")
    public @ResponseBody String addCategory(@RequestParam String name){
        Category category = new Category(name);
        categoryRepository.save(category);
        return "success";
    }

    // Get all categories.
    @GetMapping("/AllCategories")
    public @ResponseBody Iterable<Category>getAllCategories(){
        return categoryRepository.findAll();
    }

    // Get category by ID.
    @GetMapping("/GetCategoryByID")
    public @ResponseBody Optional<Category> getCategoryById(@RequestParam int id){
        return categoryRepository.findById(id);
    }

    // Get category by name.
    @GetMapping("/GetCategoryByName")
    public @ResponseBody List<Category> getCategoryByName(@RequestParam String name){
        return categoryRepository.findByName(name);
    }

    // Delete category by ID.
    @DeleteMapping("DeleteCategoryByID")
    public @ResponseBody String deleteCategoryById(@RequestParam int id){
        categoryRepository.deleteById(id);
        return "success";
    }

    // Update category name by ID.
    @PatchMapping("UpdateNameByID")
    public @ResponseBody Category updateCategoryNameById(@RequestParam int id, @RequestParam String name){
        Category category = categoryRepository
                .findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "No category exists with that id."));
        category.setName(name);
        return categoryRepository.save(category);
    }

}
