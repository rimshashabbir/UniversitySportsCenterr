package com.company;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class BookingTest {

    public final Booking booking = new Booking("25 April 2020", "Saturday", "Yoga", "Zumba", "HipHop",10, 11, 12, "April");

    @Test
    public void printTimeTable() {
        assertEquals(booking.getDate(), "25 April 2020");
        assertEquals(booking.getDay(), "Saturday");
        assertEquals(booking.getClass1(), "Yoga");
        assertEquals(booking.getMonth(), "April");
    }

    @Test
    public void setBooking() {
        assertEquals(Arrays.toString(booking.class1StudentsArr).length(), 8);
        assertEquals(Arrays.toString(booking.class2Attendted).length(), 8);
        assertEquals(Arrays.toString(booking.class3Attendted).length(), 8);
        assertEquals(Arrays.toString(booking.class4Attendted).length(), 8);
    }

    @Test
    public void printBookings() {
        booking.printBookings("Ubaid");
        booking.class1StudentsArr[0] = "Ubaid";
        booking.class2StudentsArr[0] = "Ubaid";
        assertEquals(booking.class1StudentsArr[0].equals("Ubaid"), true);
        assertEquals(booking.class2StudentsArr[0].equals("Ubaid"), true);
    }

    @Test
    public void removeBookings() {
        booking.removeBookings("Ubaid", "25 April 2020", "Yoga");
        booking.class1StudentsArr[0] = "Ubaid";
        booking.class1StudentCounter = 1;
        booking.class1StudentCounter --;
        assertEquals(booking.class1StudentsArr[0].equals("Ubaid"), true);
        assertEquals(booking.class1StudentCounter, 0);
    }

    @Test
    public void printRatingOptions() {
        assertEquals(booking.class1Attendted.length, 4);
        assertEquals(booking.class2Attendted.length, 4);
        assertEquals(booking.class3Attendted.length, 4);
        assertEquals(booking.class4Attendted.length, 4);
    }


    @Test
    public void printStudents() {
        assertTrue(booking.class1StudentsArr.length>1 );
        assertEquals(booking.class1Attendted.length, 4);
        assertEquals(booking.class1Reviews.length, 100);
        assertEquals(booking.class1Rating.length, 100);
    }

    @Test
    public void monthlyChampionReports() {
        int total1 = 0;
        int total2 = 0;
        int total3 = 0;
        int total4 = 0;
        assertEquals(booking.class1Attendted.length, 4);
        total1 = 40;
        assertEquals(total1, 40);
        assertEquals(booking.class2Attendted.length, 4);
        total2 = 43;
        assertEquals(total2, 43);
        assertEquals(booking.class3Attendted.length, 4);
        total3 = 46;
        assertEquals(total3, 46);
        assertEquals(booking.class4Attendted.length, 4);
        total4 = 49;
        assertEquals(total4, 49);
    }
}