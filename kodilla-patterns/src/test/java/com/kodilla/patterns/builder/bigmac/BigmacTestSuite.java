package com.kodilla.patterns.builder.bigmac;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class BigmacTestSuite {

    @Test
    public void testBigmacBuldierwithAllIngredients() {
        //Given
        List<Integer> chosenIngredientsForActual = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);
        List<String> chosenIngredientsForExpected = Arrays.asList("Lettuce", "Onion", "Bacon", "Pickle", "Chilli",
                   "Mushrooms", "Shrimps", "Cheese");
        Bigmac expected = new Bigmac("With sesame", 2, "Barbecue", chosenIngredientsForExpected);
        //When
        Bigmac actual = new Bigmac.BigmacBuldier()
                    .bun(1)
                    .burgers(2)
                    .sauce(3)
                    .ingredients(chosenIngredientsForActual)
                    .build();
        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testBigmacBuldierWithNull() {
        //Given
        List<String> chosenIngredientsForExpected = Arrays.asList(null, null);
        List<Integer> chosenIngredientsForActual = Arrays.asList(0, 12);
        Bigmac expected = new Bigmac(null, 0, null, chosenIngredientsForExpected);
        //When
        Bigmac actual = new Bigmac.BigmacBuldier()
                .bun(3)
                .burgers(-3)
                .sauce(9)
                .ingredients(chosenIngredientsForActual)
                .build();
        //Then
        Assert.assertEquals(expected, actual);
    }

}
