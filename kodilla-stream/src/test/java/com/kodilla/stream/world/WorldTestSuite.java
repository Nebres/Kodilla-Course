package com.kodilla.stream.world;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class WorldTestSuite {

    @Test
    public void testGetPeopleQuantity() {
        //Given
        List<Country> europeCountryList = new ArrayList<>();
        List<Country> asiaCountryList = new ArrayList<>();
        List<Country> northAmericaCountryList = new ArrayList<>();
        List<Country> southAmericaCountryList = new ArrayList<>();
        List<Country> australiaCountryList = new ArrayList<>();
        europeCountryList.add(new Country("Poland" , new BigDecimal(38500000)));
        europeCountryList.add(new Country("Greek" , new BigDecimal(10750000)));
        europeCountryList.add(new Country("Ireland" , new BigDecimal(4775000)));
        asiaCountryList.add(new Country("Japan" , new BigDecimal(126450000)));
        asiaCountryList.add(new Country("India" , new BigDecimal(1281900000)));
        asiaCountryList.add(new Country("China" , new BigDecimal(1379300000)));
        northAmericaCountryList.add(new Country("Canada" , new BigDecimal(35620000)));
        northAmericaCountryList.add(new Country("USA" , new BigDecimal(326625000)));
        northAmericaCountryList.add(new Country("Mexico" , new BigDecimal(124574000)));
        southAmericaCountryList.add(new Country("Brazil" , new BigDecimal(260580000)));
        southAmericaCountryList.add(new Country("Chile" , new BigDecimal(17789000)));
        southAmericaCountryList.add(new Country("Argentina" , new BigDecimal(44293000)));
        australiaCountryList.add(new Country("Australia" , new BigDecimal(23232000)));
        australiaCountryList.add(new Country("New Zealand" , new BigDecimal(4510000)));
        australiaCountryList.add(new Country("Nauru" , new BigDecimal(10000)));
        List<Continent> continentList = new ArrayList<>();
        Continent europa = new Continent(europeCountryList);
        Continent asia = new Continent(asiaCountryList);
        Continent northAmerica = new Continent(northAmericaCountryList);
        Continent southAmerica = new Continent(southAmericaCountryList);
        Continent australia = new Continent(australiaCountryList);
        continentList.add(europa);
        continentList.add(asia);
        continentList.add(northAmerica);
        continentList.add(southAmerica);
        continentList.add(australia);
        World world = new World(continentList);
        BigDecimal expected = new BigDecimal("3678908000");
        //When
        BigDecimal actual = world.getPeopleQuantity();
        //Then
        Assert.assertEquals(expected,actual);
    }

}
