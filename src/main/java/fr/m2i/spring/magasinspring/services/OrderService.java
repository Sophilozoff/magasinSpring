package fr.m2i.spring.magasinspring.services;

import com.fasterxml.jackson.databind.ObjectMapper;
import fr.m2i.spring.magasinspring.dtos.GetOrderDto;
import fr.m2i.spring.magasinspring.models.Order;
import fr.m2i.spring.magasinspring.repositories.OrderRepository;

import java.util.ArrayList;
import java.util.List;

public class OrderService {

    ObjectMapper mapper;
    OrderRepository repository;

    public OrderService(ObjectMapper mapper, OrderRepository repository) {
        this.mapper = mapper;
        this.repository = repository;
    }

    public List<GetOrderDto> findAll() {
        List<Order> orders = this.repository.findAll();
        List<GetOrderDto> getOrderDtos = new ArrayList<>();
        orders.forEach(order -> {
            getOrderDtos.add(
                    this.mapper.convertValue(order, GetOrderDto.class)
            );
        });
        return getOrderDtos;
    }

    public GetOrderDto findById(String id) {
        return mapper.convertValue(this.repository.findById(id).get(), GetOrderDto.class);
    }

    public Order save(Order order) {
        return this.repository.save(order);
    }

    public Order update(Order order) {
        return this.repository.save(order);
    }

    public void delete(Order order) {
        this.repository.delete(order);
    }

}
