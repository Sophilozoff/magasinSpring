package fr.m2i.spring.magasinspring.controllers;

import fr.m2i.spring.magasinspring.dtos.GetClientDto;
import fr.m2i.spring.magasinspring.models.Client;
import fr.m2i.spring.magasinspring.services.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("clients")
@CrossOrigin
public class ClientController {

    @Autowired
    ClientService service;

    @GetMapping("")
    public List<GetClientDto> findAll() {
        return this.service.findAll();
    }

    @GetMapping("{id}")
    public GetClientDto findById(@PathVariable String id) {
        return this.service.findById(id);
    }

    @PostMapping("")
    public Client save(@RequestBody Client client) {
        return this.service.save(client);
    }

    @PutMapping("")
    public Client update(@RequestBody Client client) {
        return this.service.update(client);
    }

    @DeleteMapping("")
    public void delete(@RequestBody Client client) {
        this.service.delete(client);
    }
}
