package com.kodilla.patterns.builder.bigmac;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class BigmacTestSuite {

    @Test
    public void testGetStringFromEnum() {
        //Given
        String expected = "With sesame";
        //When
        String actual = BunType.BUN_WITH_SESAME.getBunType();
        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testBigmacBuldierWithAllIngredients() {
        //Given
        List<IngredientType> chosenIngredientsForActual = Arrays.asList(IngredientType.LETTUCE, IngredientType.ONION,
                IngredientType.BACON, IngredientType.PICKLE, IngredientType.CHILLI, IngredientType.MUSHROOMS,
                IngredientType.SHRIMPS, IngredientType.CHEESE);
        List<String> chosenIngredientsForExpected = Arrays.asList("Lettuce", "Onion", "Bacon", "Pickle", "Chilli",
                   "Mushrooms", "Shrimps", "Cheese");
        Bigmac expected = new Bigmac("Without sesame", 2, "Barbecue", chosenIngredientsForExpected);
        //When
        Bigmac actual = new Bigmac.BigmacBuldier()
                    .bun(BunType.BUN_WITHOUT_SESAME)
                    .burgers(2)
                    .sauce(SauceType.BARBECUE_SAUCE)
                    .ingredients(chosenIngredientsForActual)
                    .build();
        //Then
        Assert.assertEquals(expected, actual);
    }

}
