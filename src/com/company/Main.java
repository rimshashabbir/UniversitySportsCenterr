package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t=============================================");
        System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t==================***********================");
        System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\tWelcome to University Sports Center!!");
        System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t==================***********================");
        System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t=============================================");
        Booking[] booking = new Booking[16];
        booking[0] = new Booking("25 April 2020", "Saturday", "Yoga", "Zumba", "HipHop",10, 11, 12, "April");
        booking[1] = new Booking("26 April 2020", "Sunday", "Zumba", "Aquacise", "Yoga",11, 13, 10, "April");
        booking[2] = new Booking("2 May 2020", "Saturday", "HipHop", "Zumba", "Aquacise",12, 11, 13, "May");
        booking[3] = new Booking("3 May 2020", "Sunday", "Yoga", "Zumba", "Aquacise",10, 11, 13, "May");
        booking[4] = new Booking("9 May 2020", "Saturday", "Zumba", "Aquacise", "Yoga",11, 13, 10, "May");
        booking[5] = new Booking("10 May 2020", "Sunday", "Yoga", "Zumba", "Aquacise",10, 11, 13, "May");
        booking[6] = new Booking("16 May 2020", "Saturday", "Aquacise", "Zumba", "Yoga",13, 11, 10, "May");
        booking[7] = new Booking("17 May 2020", "Sunday", "Yoga", "HipHop", "Aquacise",10, 12, 13, "May");
        booking[8] = new Booking("23 May 2020", "Saturday", "HipHop", "Yoga", "Aquacise",12, 10, 13, "May");
        booking[9] = new Booking("24 May 2020", "Sunday", "Zumba", "Aquacise", "Yoga",11, 13, 10, "May");
        booking[10] = new Booking("30 May 2020", "Saturday", "Yoga", "Zumba", "HipHop",10, 11, 12, "May");
        booking[11] = new Booking("31 May 2020", "Sunday", "HipHop", "Zumba", "Yoga",12, 11, 10, "May");
        booking[12] = new Booking("6 June 2020", "Saturday", "HipHop", "Zumba", "Aquacise",12, 11, 13, "June");
        booking[13] = new Booking("7 June 2020", "Sunday", "Aquacise", "Zumba", "Yoga",13, 11, 10, "June");
        booking[14] = new Booking("13 June 2020", "Saturday", "Zumba", "Aquacise", "Yoga",11, 13, 10, "June");
        booking[15] = new Booking("14 June 2020", "Sunday", "Zumba", "Aquacise", "Yoga",11, 13, 10, "June");
        mainMethod(booking);
    }

}
