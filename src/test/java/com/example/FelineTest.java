package com.example;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;



public class FelineTest {
    @Test
    public void checkEatMeatReturnsNotAnEmptyListOfFood() throws Exception {
        Feline feline = new Feline();
        List<String> actual = feline.eatMeat();
        assertFalse(actual.isEmpty());
    }

    @Test
    public void checkGetFamilyReturnsCorrectFamilyType() throws Exception {
        Feline feline = new Feline();
        String expectedFamilyType = "Кошачьи";
        String actualFamilyType  = feline.getFamily();

        assertEquals(expectedFamilyType, actualFamilyType);
    }


    @Test
    public void checkGetKittensReturnValidNumbers() throws Exception {
        Feline feline = new Feline();
        int kittensCount = 4;
        int actualKittens = feline.getKittens(kittensCount);
        int expectedKittens = kittensCount;


        assertEquals(expectedKittens, actualKittens);
    }


    @Test
    public void checkGetKittensReturnSetNumber() throws Exception {
        Feline feline = new Feline();
        int actualKittens = feline.getKittens();
        int expectedKittens = 1;
        assertEquals(expectedKittens, actualKittens);
    }
}