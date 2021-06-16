package fr.m2i.spring.magasinspring.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetClientDto {

    private String firstName;
    private String lastName;

}
