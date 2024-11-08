package com.sandy.base_domains.dto;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class order {
    private String orderId;
    private String name;
    private int qty;
    private double price;
}
