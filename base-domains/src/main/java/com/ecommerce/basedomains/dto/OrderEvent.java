package com.ecommerce.basedomains.dto;

import lombok.*;
@Data
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class OrderEvent {
    private String message;
    private String status;
    private Order order;

    public String toString(){
        return "message: " + message + ", status: " + status + ", " + order.toString();
    }
}
