package com.kodilla.good.patterns.challenges.secondChallenge;

public class SecondChallengesMain {

    private static void initRepository(ProductRepository productRepository) {
        productRepository.add(new Item("TV"), 4);
        productRepository.add(new Item("Fan"), 21);
        productRepository.add(new Item("T-Shirt"), 56);
    }

    public static void main(String[] args) {

        ProductRepository productRepository = new ProductRepository();
        initRepository(productRepository);
        InformationService informationService = new InformationService();
        OrderService orderService = new OrderService(productRepository);
        OrderProcessor orderProcessor = new OrderProcessor(orderService, informationService);
        Buyer buyer = new Buyer("Jan89", "Janusz Korczak", "Warszawa 02-200");
        Order order = new Order(new Item("TV"), buyer, 2);
        Order order1 = new Order(new Item ("Fan"), buyer, 21);

        orderProcessor.process(order);
        orderProcessor.process(order);
        orderProcessor.process(order);
        orderProcessor.process(order1);
    }

}