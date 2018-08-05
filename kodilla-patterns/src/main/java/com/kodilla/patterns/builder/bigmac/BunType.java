package com.kodilla.patterns.builder.bigmac;

public enum BunType {

    BUN_WITH_SESAME("With sesame"),
    BUN_WITHOUT_SESAME("Without sesame");

    private final String bunType;

    BunType (String bunType) {
        this.bunType = bunType;
    }

    public String getBunType() {
        return bunType;
    }

}
