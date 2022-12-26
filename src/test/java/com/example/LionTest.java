package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

@RunWith(MockitoJUnitRunner.class)

public class LionTest {

@Mock
    private Feline feline;

@Test
    public void checkGetKittensReturnValidNumbers() throws Exception {
    Lion lion = new Lion("Самка", feline);
    Mockito.when(feline.getKittens()).thenReturn(4);

    int expectedNumberOfKittens = 4;
    int actualNumberOfKittens = lion.getKittens();
    assertEquals(expectedNumberOfKittens, actualNumberOfKittens);


}

    @Test
    public void checkGetFoodReturnsCorrectListOfFood() throws Exception {
        Lion lion = new Lion("Самец", feline);
        List<String> expectedFoodList = List.of("Животные","Птицы", "Рыба");
        Mockito.when(feline.getFood("Хищник")).thenReturn(expectedFoodList);


        List<String> actualFoodList = lion.getFood();

        assertEquals(expectedFoodList, actualFoodList);
    }

    @Test
    public void checkForUnindentifiedExeptionsThrown() {
        Exception actualException = assertThrows(Exception.class, () -> new Lion("unknown", feline));
        String expectedException = "Используйте допустимые значения пола животного - самец или самка";
        assertEquals(expectedException, actualException.getMessage());
    }

}

