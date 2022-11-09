package com.bmayes.ecommerce.service;

import com.bmayes.ecommerce.dto.Purchase;
import com.bmayes.ecommerce.dto.PurchaseResponse;

public interface CheckoutService {

    PurchaseResponse placeOrder(Purchase purchase);
}
