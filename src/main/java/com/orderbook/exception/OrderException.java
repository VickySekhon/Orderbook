package com.orderbook.exception;

/**
 * Generic Exception class for {@link com.orderbook.domain.Order}
 */
public class OrderException extends Exception{
    public OrderException(String message) {
        super(message);
    }
}
