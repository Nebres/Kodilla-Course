package com.kodilla.patterns.builder.bigmac;

public enum SauceType {

    STANDARD_SAUCE("Standard"),
    THOUSAND_ISLAND_SAUCE("Thousand Island"),
    BARBECUE_SAUCE("Barbecue");

    private final String sauceType;

    SauceType(String sauceType) {
        this.sauceType = sauceType;
    }

    public String getSauceType() {
        return sauceType;
    }

}
