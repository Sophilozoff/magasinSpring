package fr.m2i.spring.magasinspring.controllers;

import fr.m2i.spring.magasinspring.dtos.GetOrderDto;
import fr.m2i.spring.magasinspring.models.Order;
import fr.m2i.spring.magasinspring.services.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("orders")
@CrossOrigin
public class OrderController {

    @Autowired
    OrderService service;

    @GetMapping("")
    public List<GetOrderDto> findAll() {
        return this.service.findAll();
    }

    @GetMapping("{id}")
    public GetOrderDto findById(@PathVariable String id) {
        return this.service.findById(id);
    }

    @PostMapping("")
    public Order save(@RequestBody Order order) {
        return this.service.save(order);
    }

    @PutMapping("")
    public Order update(@RequestBody Order order) {
        return this.service.update(order);
    }

    @DeleteMapping("{id}")
    public void delete(@PathVariable String id) {
        this.service.delete(id);
    }
}
