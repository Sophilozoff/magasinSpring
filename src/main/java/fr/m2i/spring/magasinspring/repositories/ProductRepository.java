package fr.m2i.spring.magasinspring.repositories;

import fr.m2i.spring.magasinspring.models.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, String> {
}
