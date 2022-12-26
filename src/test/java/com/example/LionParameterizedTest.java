package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class LionParameterizedTest {

    private String sex;
    private boolean isMane;
    private Feline feline;

    public LionParameterizedTest(String sex, boolean isMane) {
        this.sex = sex;
        this.isMane = isMane;
    }


    @Parameterized.Parameters (name = "Test data: {0}, {1}")
    public static Collection lionsDataSet() {
        return Arrays.asList(new Object[][] {
                { "Самец", true},
                { "Самка", false}
        });
    }
    @Test
    public void checkDoesHaveManeReturnsCorrectValue() throws Exception {
        Lion lion = new Lion(sex, feline);
        boolean expected = isMane;
        boolean actual = lion.doesHaveMane();
        assertEquals(expected, actual);
    }
}
