package com.ecommerce.orderservice.controller;

import com.ecommerce.basedomains.dto.Order;
import com.ecommerce.basedomains.dto.OrderEvent;
import com.ecommerce.orderservice.kafka.OrderProducer;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
@RequestMapping("/api/v1")
public class OrderController {

    private OrderProducer orderProducer;

    public OrderController(OrderProducer orderProducer) {
        this.orderProducer = orderProducer;
    }

    @PostMapping("/orders")
    public String placeOrder(@RequestBody Order order){
        order.setOrderId(UUID.randomUUID().toString());

        OrderEvent orderEvent = new OrderEvent();
        orderEvent.setOrder(order);
        orderEvent.setStatus("PENDING");
        orderEvent.setMessage("Order status is PENDING");

        orderProducer.sendMessage(orderEvent);

        return "Order placed for " + order.getName() + " with order id " + order.getOrderId();
    }

}
