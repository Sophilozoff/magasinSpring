package fr.m2i.spring.magasinspring.services;

import com.fasterxml.jackson.databind.ObjectMapper;
import fr.m2i.spring.magasinspring.dtos.GetCategoryDto;
import fr.m2i.spring.magasinspring.models.Category;
import fr.m2i.spring.magasinspring.repositories.CategoryRepository;

import java.util.ArrayList;
import java.util.List;

public class CategoryService {

    ObjectMapper mapper;
    CategoryRepository repository;

    public CategoryService(ObjectMapper mapper, CategoryRepository repository) {
        this.repository = repository;
        this.mapper = mapper;
    }

    public List<GetCategoryDto> findAll() {
        List<Category> categories = this.repository.findAll();
        List<GetCategoryDto> getCategoriesDtos = new ArrayList<>();
        categories.forEach(category -> {
            getCategoriesDtos.add(
                    this.mapper.convertValue(category, GetCategoryDto.class)
            );
        });
        return getCategoriesDtos;
    }

    public GetCategoryDto findById(String id) {
        return mapper.convertValue(this.repository.findById(id).get(), GetCategoryDto.class);
    }

    public Category save(Category category) {
        return this.repository.save(category);
    }

    public Category update(Category category) {
        return this.repository.save(category);
    }

    public void delete(String id) {
        this.repository.deleteById(id);
    }
}
