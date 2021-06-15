package fr.m2i.spring.magasinspring.controllers;

import fr.m2i.spring.magasinspring.dtos.GetCategoryDto;
import fr.m2i.spring.magasinspring.models.Category;
import fr.m2i.spring.magasinspring.services.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("categories")
@CrossOrigin
public class CategoryController {

    @Autowired
    CategoryService service;

    @GetMapping("")
    public List<GetCategoryDto> findAll() {
        return this.service.findAll();
    }

    @GetMapping("{id}")
    public GetCategoryDto findById(@PathVariable String id) {
        return this.service.findById(id);
    }

    @PostMapping("")
    public Category save(@RequestBody Category category) {
        return this.service.save(category);
    }

    @PutMapping("")
    public Category update(@RequestBody Category category) {
        return this.service.update(category);
    }

    @DeleteMapping("")
    public void delete(@RequestBody Category category) {
        this.service.delete(category);
    }

}
