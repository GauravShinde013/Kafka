package com.ecommerce.basedomains.dto;

import lombok.*;
@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Order {
    private String orderId;
    private String name;
    private int qty;
    private double price;

    public String toString(){
        return "Order [orderId=" + orderId + ", name=" + name + "]";
    }
}
