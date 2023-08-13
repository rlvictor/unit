package ru.netology.service;


//import org.junit.Test;

import static org.junit.Assert.assertEquals;
import org.junit.jupiter.api.Test;

import org.junit.jupiter.api.Assertions;

public class CashbackHackServiceTest {

   @Test
  public void shouldCashbackHackServiceBefore() {
        CashbackHackService service = new CashbackHackService();
        int amount = 900;

        int actual = service.remain(amount);
        int expected = 100;

        assertEquals(expected, actual);
    }


    @Test
    public void shouldCashbackHackServiceThousand() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1000;

        int actual = service.remain(amount);
        int expected = 0;

        assertEquals(expected, actual);
    }

    @Test
    public void shouldCashbackHackServiceAfter() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1100;

        int actual = service.remain(amount);
        int expected = 900;

        assertEquals(actual, expected);
    }

    @Test
    public void shouldCashbackHackServiceBeforeJupiter() {
        CashbackHackService service = new CashbackHackService();
        int amount = 900;

        int actual = service.remain(amount);
        int expected = 100;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldCashbackHackServiceThousandJupiter() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1000;

        int actual = service.remain(amount);
        int expected = 0;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldCashbackHackServiceAfterJupiter() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1100;

        int actual = service.remain(amount);
        int expected = 900;

        Assertions.assertEquals(expected, actual);
    }

}