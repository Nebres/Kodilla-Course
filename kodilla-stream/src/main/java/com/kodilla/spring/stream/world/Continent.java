package com.kodilla.spring.stream.world;

import java.util.List;
import java.util.Objects;

public final class Continent {

    private final List<Country> countryList;

    public Continent(List<Country> countryList) {
        this.countryList = countryList;
    }

    public List<Country> getCountryList() {
        return countryList;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Continent)) return false;
        Continent continent = (Continent) o;
        return Objects.equals(getCountryList(), continent.getCountryList());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getCountryList());
    }

}
