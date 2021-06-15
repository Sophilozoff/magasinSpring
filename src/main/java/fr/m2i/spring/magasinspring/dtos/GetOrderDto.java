package fr.m2i.spring.magasinspring.dtos;

import fr.m2i.spring.magasinspring.models.Product;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetOrderDto {

    private LocalDateTime createdAt;
    private List<Product> products;

}
