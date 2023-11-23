package org.example.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class OrderItem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name= "item_id")
    private Item item;
    @ManyToOne
    @JoinColumn(name= "order_id")
    private Order order;

    private int orderPrice;

    private int count;
}
