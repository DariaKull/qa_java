package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Spy;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class FelineTest {
  @Spy
  private Feline feline;

  @Test
    public void eatMeat() throws Exception{
    when(feline.getFood("Хищник")).thenReturn(List.of("Животные", "Птицы", "Рыба"));
    assertEquals(List.of("Животные", "Птицы", "Рыба"), feline.eatMeat());
    }

    @Test
    public void getFamily() {
      assertEquals("Кошачьи", feline.getFamily());
    }

    @Test
    public void getKittens() {
      assertEquals(1, feline.getKittens());
    }

}