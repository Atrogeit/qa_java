package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)

public class CatTest {

    @Mock
    private Feline predator;

    @Test
    public void checkCatSoundIsMeow() throws Exception {
        Cat cat = new Cat(predator);
        String expectedSound = "Мяу";
        String actualSound = cat.getSound();
        assertEquals(expectedSound, actualSound);
    }

    @Test
    public void checkCatFoodReturnNotAnEmptyList() throws Exception {
        Cat cat = new Cat(predator);

        List<String> expectedFoodList = List.of("Курочка", "Говяжка");

        Mockito.when(predator.eatMeat()).thenReturn(expectedFoodList);
        List<String> actualFood = cat.getFood();
        assertEquals(expectedFoodList, actualFood);


    }

}