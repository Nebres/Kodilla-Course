package com.kodilla.spring.stream.world;

import java.math.BigDecimal;
import java.util.List;

public class World {

   private final List<Continent> continentList;

    public World(List<Continent> continentList) {
        this.continentList = continentList;
    }

    public BigDecimal getPeopleQuantity() {
        return continentList.stream()
                .flatMap (continent -> continent.getCountryList().stream())
                .map (quantityOfPeople -> quantityOfPeople.getPeopleQuantity())
                .reduce(BigDecimal.ZERO, (sum, country) -> sum = sum.add(country));
    }

}
