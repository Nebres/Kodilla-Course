package com.kodilla.good.patterns.challenges.thirdChallenge;

import java.util.Map;
import java.util.Objects;

public class FoodProducer {

    private final String name;
    private final String address;
    private final String companyNIP;
    private final Map<String, Double> productsList;

    public FoodProducer(String name, String address, String companyNIP, Map<String, Double> productsList) {
        this.name = name;
        this.address = address;
        this.companyNIP = companyNIP;
        this.productsList = productsList;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getCompanyNIP() {
        return companyNIP;
    }

    public Map<String, Double> getProductsList() {
        return productsList;
    }

    public String printProductsList() {

        String result = ShopCommunicates.EMPTY_MARK;

        for (Map.Entry<String, Double> entry : productsList.entrySet()) {
           result = result
                   .concat(entry.getKey())
                   .concat(ShopCommunicates.SEPARATOR)
                   .concat(entry.getValue().toString()).concat(ShopCommunicates.NEW_LINE);
        }
        return result;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof FoodProducer)) return false;
        FoodProducer that = (FoodProducer) o;
        return Objects.equals(getName(), that.getName()) &&
                Objects.equals(getAddress(), that.getAddress()) &&
                Objects.equals(getCompanyNIP(), that.getCompanyNIP());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getAddress(), getCompanyNIP());
    }

    @Override
    public String toString() {
        return "FoodProducer{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", companyNIP='" + companyNIP + '\'' +
                ", productsList=" + productsList +
                '}';
    }

}
