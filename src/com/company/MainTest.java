package com.company;

import org.junit.Test;

import java.util.Scanner;

import static org.junit.Assert.*;

public class MainTest {

    public final Main mainTest = new Main();

    @Test
    public void showMontlyClassReport() {
        Booking[] booking = new Booking[1];
        booking[0] = new Booking("25 April 2020", "Saturday", "Yoga", "Zumba", "HipHop",10, 11, 12, "April");
        String month = "April";
        assertEquals(month, "April");
        assertEquals(booking[0].class1Attendted.length, 4);
        booking[0].class1AttentedCounter = 1;
        assertEquals(booking[0].class1AttentedCounter, 1);
        int total1 = (int) booking[0].getPrice1();
        assertEquals(total1, 10);
    }

    @Test
    public void printCalender() {
        Booking[] booking = new Booking[1];
        booking[0] = new Booking("25 April 2020", "Saturday", "Yoga", "Zumba", "HipHop",10, 11, 12, "April");
        assertEquals(booking.length, 1);
        assertEquals(booking[0].getDay(), "Saturday");
        assertEquals(booking[0].getDate(), "25 April 2020");
        assertEquals(booking[0].getClass1(), "Yoga");
        assertEquals(booking[0].getClass2(), "Zumba");
        assertEquals(booking[0].getClass3(), "HipHop");
    }

    @Test
    public void changeBooking() {
        Booking[] booking = new Booking[1];
        booking[0] = new Booking("25 April 2020", "Saturday", "Yoga", "Zumba", "HipHop",10, 11, 12, "April");
        booking[0].class1AttentedCounter = 1;
        String name = "Ubaid";
        assertEquals(name, "Ubaid");
        booking[0].class1AttentedCounter--;
        assertEquals(booking[0].class1AttentedCounter, 0);
    }
}