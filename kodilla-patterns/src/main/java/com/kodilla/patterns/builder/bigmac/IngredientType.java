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

    private final String ingredient;

    IngredientType(String ingredient) {
        this.ingredient = ingredient;
    }

    public String getIngredient() {
        return ingredient;
    }

}
