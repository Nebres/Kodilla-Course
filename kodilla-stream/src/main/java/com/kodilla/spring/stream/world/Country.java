package com.kodilla.spring.stream.world;

import java.math.BigDecimal;
import java.util.Objects;

public final class Country {

    private final String countryName;
    private final BigDecimal quantityOfPeople;

    public Country(String countryName, BigDecimal quantityOfPeople) {
        this.countryName = countryName;
        this.quantityOfPeople = quantityOfPeople;
    }

    public String getCountryName() {
        return countryName;
    }

    public BigDecimal getPeopleQuantity() {
        return quantityOfPeople;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Country)) return false;
        Country country = (Country) o;
        return quantityOfPeople == country.quantityOfPeople &&
                Objects.equals(getCountryName(), country.getCountryName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getCountryName(), quantityOfPeople);
    }

}
