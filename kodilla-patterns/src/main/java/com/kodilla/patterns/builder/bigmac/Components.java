package com.kodilla.patterns.builder.bigmac;

public enum Components {

    BUN_WITH_SESAME("With sesame"),
    BUN_WITHOUT_SESAME("Without sesame"),
    STANDARD_SAUCE("Standard"),
    THOUSAND_ISLAND_SAUCE("Thousand Island"),
    BARBECUE_SAUCE("Barbecue"),
    LETTUCE("Lettuce"),
    ONION("Onion"),
    BACON("Bacon"),
    PICKLE("Pickle"),
    CHILLI("Chilli"),
    MUSHROOMS("Mushrooms"),
    SHRIMPS("Shrimps"),
    CHEESE("Cheese");

    private final String component;

    Components(String component) {
        this.component = component;
    }

    public String getComponent() {
        return component;
    }

}
