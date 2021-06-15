package fr.m2i.spring.magasinspring.repositories;

import fr.m2i.spring.magasinspring.models.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client, String> {
}
