package com.sandy.base_domains.dto;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Order {
    private String orderId;
    private String name;
    private int qty;
    private double price;
}
