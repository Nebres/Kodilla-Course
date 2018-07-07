package com.kodilla.good.patterns.challenges.thirdChallenge;

import java.util.HashMap;
import java.util.Map;

public class SuplliersDataBase {

    public Supplier initializeExtraFoodShop() {

        Map<String,Double> extraFoodShopProducts = new HashMap<>();

        extraFoodShopProducts.put("BIO Carrot", 67.42);
        extraFoodShopProducts.put("Natural Apple", 21.21);
        extraFoodShopProducts.put("Bonny clabber", 120.00);

        return new Supplier("Extra Food Shop", "Klewki, ul. Wiejska 17", "739739739",extraFoodShopProducts );
    }

    public Supplier initializeHealthyShop() {

        Map<String,Double> healthyShopProducts = new HashMap<>();

        healthyShopProducts.put("Eco Tea", 11.42);
        healthyShopProducts.put("Tofu", 21.21);
        healthyShopProducts.put("Soybean", 22.00);

        return new Supplier("Healthy Shop", "Warszawa, ul. Ekologów 12", "123439739",healthyShopProducts );
    }

    public Supplier initializeGlutenFreeShop() {

        Map<String,Double> glutenFreeShopProducts = new HashMap<>();

        glutenFreeShopProducts.put("Grande", 21.22);
        glutenFreeShopProducts.put("Bread", 12.00);
        glutenFreeShopProducts.put("Soybean Milk", 10.00);

        return new Supplier("Gluten Free Shop", "Pcimć Dolny, ul. Rolna 12", "743453219",glutenFreeShopProducts );
    }

}
