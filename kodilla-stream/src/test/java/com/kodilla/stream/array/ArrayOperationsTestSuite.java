package com.kodilla.stream.array;

import org.junit.Assert;
import org.junit.Test;

public class ArrayOperationsTestSuite {

    @Test
    public void testGetAverage() {
        //Given
        int[] array = new int[] { 2, 55, 31, 22, 16, 14, 88, 23, 56, 72, 62,
                33, 84, 90, 12, 45, 56, 31, 74, 19 };
        double expected = 44.25;
        //When
        double actual = ArrayOperations.getAverage(array);
        //Than
        Assert.assertEquals(expected, actual,1e-2);
    }

}
