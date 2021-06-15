package fr.m2i.spring.magasinspring.models;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Data
@Table(name = "order")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    @Column(name = "created_at")
    private LocalDateTime createdAt;

    @ManyToMany
    @JoinTable(
            name="order_has_product",
            joinColumns = { @JoinColumn(name="order_id", referencedColumnName = "id")},
            inverseJoinColumns = { @JoinColumn(name="product_id", referencedColumnName = "id")}
    )
    private List<Product> products;



}
