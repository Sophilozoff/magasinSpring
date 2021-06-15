package fr.m2i.spring.magasinspring.repositories;

import fr.m2i.spring.magasinspring.models.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, String> {
}
