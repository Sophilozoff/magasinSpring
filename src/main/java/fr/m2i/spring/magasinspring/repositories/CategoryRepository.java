package fr.m2i.spring.magasinspring.repositories;

import fr.m2i.spring.magasinspring.models.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, String> {
}
