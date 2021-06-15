package fr.m2i.spring.magasinspring.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class GetProductDto {

    private String name;
    private Double price;
}
