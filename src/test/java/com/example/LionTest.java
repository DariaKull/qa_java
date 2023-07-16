package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Spy;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class LionTest {
    @Spy
    private Feline feline;

    @Test
    public void getKittensMale() throws Exception {
        Lion lion = new Lion("Самец", feline);
        assertEquals(1, feline.getKittens());
    }
    @Test
    public void getKittensFemail() throws Exception {
        Lion lion = new Lion("Самка", feline);
        assertEquals(1, feline.getKittens());
    }

    @Test
    public void doesHaveManeMale() throws Exception {
        Lion lion = new Lion("Самец", feline);
        assertEquals(true, lion.doesHaveMane());
    }

    @Test
    public void doesHaveManeFemale() throws Exception {
        Lion lion = new Lion("Самка", feline);
        assertEquals(false, lion.doesHaveMane());
    }

    @Test
    public void getFoodMale() throws Exception{
        Lion lion = new Lion("Самец", feline);
        assertEquals(List.of("Животные", "Птицы", "Рыба"), feline.getFood("Хищник"));
    }
    @Test
    public void getFoodFemale() throws Exception{
        Lion lion = new Lion("Самка", feline);
        assertEquals(List.of("Животные", "Птицы", "Рыба"), feline.getFood("Хищник"));
    }
}