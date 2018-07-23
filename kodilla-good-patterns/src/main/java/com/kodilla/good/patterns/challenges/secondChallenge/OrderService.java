package com.kodilla.good.patterns.challenges.secondChallenge;

public class OrderService {

    private ProductRepository productRepository;

    public OrderService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public boolean order(Order order) {
       if (productRepository.check(order.getItem(), order.getQuantity())) {
           productRepository.replace(order.getItem(), order.getQuantity());
           return true;
       } else {
           return false;
       }
    }

}

