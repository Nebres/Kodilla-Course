package com.kodilla.patterns.builder.bigmac;

public enum SauceType {

    STANDARD_SAUCE("Standard"),
    THOUSAND_ISLAND_SAUCE("Thousand Island"),
    BARBECUE_SAUCE("Barbecue");

    private final String description;

    SauceType(String sauceType) {
        this.description = sauceType;
    }

    public String getDescription() {
        return description;
    }

}
