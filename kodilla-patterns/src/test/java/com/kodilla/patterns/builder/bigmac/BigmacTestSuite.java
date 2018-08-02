package com.kodilla.patterns.builder.bigmac;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class BigmacTestSuite {

    @Test
    public void testGetComponentFromEnumComponents() {
        //Given
        String expected = "With sesame";
        //When
        String actual = Components.BUN_WITH_SESAME.getComponent();
        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testBigmacBuldierWithAllIngredients() {
        //Given
        List<Components> chosenIngredientsForActual = Arrays.asList(Components.LETTUCE, Components.ONION,Components.BACON,
                Components.PICKLE, Components.CHILLI,  Components.MUSHROOMS, Components.SHRIMPS, Components.CHEESE);
        List<String> chosenIngredientsForExpected = Arrays.asList("Lettuce", "Onion", "Bacon", "Pickle", "Chilli",
                   "Mushrooms", "Shrimps", "Cheese");
        Bigmac expected = new Bigmac("With sesame", 2, "Barbecue", chosenIngredientsForExpected);
        //When
        Bigmac actual = new Bigmac.BigmacBuldier()
                    .bun(Components.BUN_WITH_SESAME)
                    .burgers(2)
                    .sauce(Components.BARBECUE_SAUCE)
                    .ingredients(chosenIngredientsForActual)
                    .build();
        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testDeflautBigmacBuldier() {
        //Given
        List<String> chosenIngredientsForExpected = Collections.singletonList(Components.CHEESE.getComponent());
        List<Components> chosenIngredientsForActual = Collections.singletonList(Components.BUN_WITHOUT_SESAME);
        Bigmac expected = new Bigmac(Components.BUN_WITHOUT_SESAME.getComponent(), 0,
                Components.STANDARD_SAUCE.getComponent(), chosenIngredientsForExpected);
        //When
        Bigmac actual = new Bigmac.BigmacBuldier()
                .bun(Components.BARBECUE_SAUCE)
                .burgers(-3)
                .sauce(Components.ONION)
                .ingredients(chosenIngredientsForActual)
                .build();
        //Then
        Assert.assertEquals(expected, actual);
    }

}
