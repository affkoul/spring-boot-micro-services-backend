package com.bmayes.ecommerce.dto;

import com.bmayes.ecommerce.entity.Address;
import com.bmayes.ecommerce.entity.Customer;
import com.bmayes.ecommerce.entity.Order;
import com.bmayes.ecommerce.entity.OrderItem;
import lombok.Data;

import java.util.Set;

@Data
public class Purchase {

    private Customer customer;
    private Address shippingAddress;
    private Address billingAddress;
    private Order order;
    private Set<OrderItem> orderItems;
}
