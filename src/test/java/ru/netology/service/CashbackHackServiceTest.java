package ru.netology.service;

import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;


public class CashbackHackServiceTest {

    @Test
    public void shouldCashbackHackServiceBefore() {
        CashbackHackService service = new CashbackHackService();
        int amount = 900;

        int actual = service.remain(amount);
        int expected = 100;

        assertEquals(actual, expected);

    }


    @Test
    public void shouldCashbackHackServiceThousand() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1000;

        int actual = service.remain(amount);
        int expected = 0;

        assertEquals(actual, expected);
    }

    @Test
    public void shouldCashbackHackServiceAfter() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1100;

        int actual = service.remain(amount);
        int expected = 900;

        assertEquals(actual, expected);
    }

}