package fr.m2i.spring.magasinspring.services;

import com.fasterxml.jackson.databind.ObjectMapper;
import fr.m2i.spring.magasinspring.dtos.GetProductDto;
import fr.m2i.spring.magasinspring.models.Product;
import fr.m2i.spring.magasinspring.repositories.ProductRepository;

import java.util.ArrayList;
import java.util.List;

public class ProductService {

    ObjectMapper mapper;
    ProductRepository repository;

    public ProductService(ObjectMapper mapper, ProductRepository repository) {
        this.mapper = mapper;
        this.repository = repository;
    }

    public List<GetProductDto> findAll() {
        List<Product> products = this.repository.findAll();
        List<GetProductDto> getProductDtos = new ArrayList<>();
        products.forEach(product -> {
            getProductDtos.add(
                    this.mapper.convertValue(product, GetProductDto.class)
            );
        });
        return getProductDtos;
    }

    public GetProductDto findById(String id) {
        return mapper.convertValue(this.repository.findById(id).get(), GetProductDto.class);
    }

    public Product save(Product product) {
        return this.repository.save(product);
    }

    public Product update(Product product) {
        return this.repository.save(product);
    }

    public void delete(Product product) {
        this.repository.delete(product);
    }

}
