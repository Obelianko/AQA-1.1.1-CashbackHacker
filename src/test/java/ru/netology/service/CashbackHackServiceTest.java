package ru.netology.service;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CashbackHackServiceTest {
    CashbackHackService service = new CashbackHackService();

    @Test
    public void shouldCalculateIfLess1() {
        int amount = 900;
        int actual = service.remain(amount);
        int expected = 100;

        assertEquals(expected, actual);
    }

    @Test
    public void shouldCalculateIfLess2() {
        int amount = 687;
        int actual = service.remain(amount);
        int expected = 313;

        assertEquals(expected, actual);
    }

    @Test
    public void shouldCalculateIf1000() {
        int amount = 1000;
        int actual = service.remain(amount);
        int expected = 0;

        assertEquals(expected, actual);
    }

    @Test
    public void shouldCalculateIfMore1() {
        int amount = 2500;
        int actual = service.remain(amount);
        int expected = 500;

        assertEquals(expected, actual);
    }

    @Test
    public void shouldCalculateIfMore2() {
        int amount = 10356;
        int actual = service.remain(amount);
        int expected = 644;

        assertEquals(expected, actual);
    }
}

