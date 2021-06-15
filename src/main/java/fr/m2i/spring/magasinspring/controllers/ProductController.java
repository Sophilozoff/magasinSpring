package fr.m2i.spring.magasinspring.controllers;

import fr.m2i.spring.magasinspring.dtos.GetProductDto;
import fr.m2i.spring.magasinspring.models.Product;
import fr.m2i.spring.magasinspring.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("products")
@CrossOrigin
public class ProductController {

    @Autowired
    ProductService service;

    @GetMapping("")
    public List<GetProductDto> findAll() {
        return this.service.findAll();
    }

    @GetMapping("{id}")
    public GetProductDto findById(@PathVariable String id) {
        return this.service.findById(id);
    }

    @PostMapping("")
    public Product save(@RequestBody Product product) {
        return this.service.save(product);
    }

    @PutMapping("")
    public Product update(@RequestBody Product product) {
        return this.service.update(product);
    }

    @DeleteMapping("{id}")
    public void delete(@PathVariable String id) {
        this.service.delete(id);
    }

}
