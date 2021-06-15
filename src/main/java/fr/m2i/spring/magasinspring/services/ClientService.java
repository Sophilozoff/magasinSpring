package fr.m2i.spring.magasinspring.services;

import com.fasterxml.jackson.databind.ObjectMapper;
import fr.m2i.spring.magasinspring.dtos.GetClientDto;
import fr.m2i.spring.magasinspring.models.Client;
import fr.m2i.spring.magasinspring.repositories.ClientRepository;

import java.util.ArrayList;
import java.util.List;

public class ClientService {

    ObjectMapper mapper;
    ClientRepository repository;

    public ClientService(ObjectMapper mapper, ClientRepository repository) {
        this.mapper = mapper;
        this.repository = repository;
    }


    public List<GetClientDto> findAll() {
        List<Client> categories = this.repository.findAll();
        List<GetClientDto> getClientDtos = new ArrayList<>();
        categories.forEach(category -> {
            getClientDtos.add(
                    this.mapper.convertValue(category, GetClientDto.class)
            );
        });
        return getClientDtos;
    }

    public GetClientDto findById(String id) {
        return mapper.convertValue(this.repository.findById(id).get(), GetClientDto.class);
    }

    public Client save(Client client) {
        return this.repository.save(client);
    }

    public Client update(Client client) {
        return this.repository.save(client);
    }

    public void delete(Client client) {
        this.repository.delete(client);
    }
}
