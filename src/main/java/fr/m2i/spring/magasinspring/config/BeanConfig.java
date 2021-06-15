package fr.m2i.spring.magasinspring.config;

import com.fasterxml.jackson.databind.ObjectMapper;
import fr.m2i.spring.magasinspring.repositories.CategoryRepository;
import fr.m2i.spring.magasinspring.repositories.ClientRepository;
import fr.m2i.spring.magasinspring.repositories.OrderRepository;
import fr.m2i.spring.magasinspring.repositories.ProductRepository;
import fr.m2i.spring.magasinspring.services.CategoryService;
import fr.m2i.spring.magasinspring.services.ClientService;
import fr.m2i.spring.magasinspring.services.OrderService;
import fr.m2i.spring.magasinspring.services.ProductService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfig {

    @Bean
    public CategoryService categoryService(ObjectMapper mapper, CategoryRepository categoryRepository) {
        return new CategoryService(mapper, categoryRepository);
    }

    @Bean
    public ClientService clientService(ObjectMapper mapper, ClientRepository clientRepository) {
        return new ClientService(mapper, clientRepository);
    }

    @Bean
    public OrderService orderService(ObjectMapper mapper, OrderRepository orderRepository) {
        return new OrderService(mapper, orderRepository);
    }

    @Bean
    public ProductService productService(ObjectMapper mapper, ProductRepository productRepository) {
        return new ProductService(mapper, productRepository);
    }

}
