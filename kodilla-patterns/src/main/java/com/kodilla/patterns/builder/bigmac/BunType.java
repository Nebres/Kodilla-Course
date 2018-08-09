package com.kodilla.patterns.builder.bigmac;

public enum BunType {

    BUN_WITH_SESAME("With sesame"),
    BUN_WITHOUT_SESAME("Without sesame");

    private final String description;

    BunType (String bunType) {
        this.description = bunType;
    }

    public String getDescription() {
        return description;
    }

}
