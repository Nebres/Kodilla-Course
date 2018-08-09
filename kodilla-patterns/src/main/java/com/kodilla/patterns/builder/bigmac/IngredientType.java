package com.kodilla.patterns.builder.bigmac;

public enum IngredientType {

    LETTUCE("Lettuce"),
    ONION("Onion"),
    BACON("Bacon"),
    PICKLE("Pickle"),
    CHILLI("Chilli"),
    MUSHROOMS("Mushrooms"),
    SHRIMPS("Shrimps"),
    CHEESE("Cheese");

    private final String description;

    IngredientType(String ingredient) {
        this.description = ingredient;
    }

    public String getDescryption() {
        return description;
    }

}
