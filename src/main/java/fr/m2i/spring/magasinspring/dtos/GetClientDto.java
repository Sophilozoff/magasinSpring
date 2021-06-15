package fr.m2i.spring.magasinspring.dtos;

import fr.m2i.spring.magasinspring.models.Order;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class GetClientDto {

    private String firstName;
    private String lastName;
    private List<Order> orders;

}
