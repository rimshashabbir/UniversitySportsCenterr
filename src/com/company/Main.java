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

    // Function for booking class
    public static void bookClass(Booking[] booking){
        String exercise;
        boolean searchedByClass = false;
        System.out.println("Welcome User, please book a class");
        System.out.println("Enter date(i.e 25 April 2020) or exercise name");
        Scanner exerciseScanner = new Scanner(System.in);
        exercise = exerciseScanner.nextLine();
        System.out.println("Searching data....");

        for(int i = 0; i<booking.length; i++){
            if(booking[i].getDate().equals(exercise.toString()) || booking[i].getClass1().equals(exercise.toString()) || booking[i].getClass2().equals(exercise.toString()) || booking[i].getClass3().equals(exercise.toString())){
                if(booking[i].getDate().equals(exercise.toString())){
                    booking[i].printTimeTable();
                    System.out.println("Choose Class: ");
                    String className = exerciseScanner.nextLine();
                    if(booking[i].getClass1().equals(className.toString()) || booking[i].getClass2().equals(className.toString()) || booking[i].getClass3().equals(className.toString())){
                        System.out.println("Enter your name: ");
                        String studentName = exerciseScanner.nextLine().toLowerCase();
                        System.out.println("Do you want to confirm your booking? Type Yes or No!");
                        String stringConfirm = exerciseScanner.nextLine().toLowerCase();
                        if(stringConfirm.equals("yes")){
                            booking[i].setBooking(className, studentName);
                            System.out.println("Enter Back to book another class or Main to go to main menu");
                            String menu = exerciseScanner.nextLine().toLowerCase();
                            if(menu.equals("back")){
                                bookClass(booking);
                            }else if(menu.equals("main")){
                                mainMethod(booking);
                            }else{
                                mainMethod(booking);
                            }
                        }else{
                            System.out.println("You are redirected to main menu");
                            mainMethod(booking);
                        }
                    }else {
                        System.out.println("This class is not a part of this schedule");
                        System.out.println("Enter Back to book another class or Main to go to main menu");
                        String menu = exerciseScanner.nextLine().toLowerCase();
                        if(menu.equals("back")){
                            bookClass(booking);
                        }else if(menu.equals("main")){
                            mainMethod(booking);
                        }else{
                            mainMethod(booking);
                        }
                    }
                }else{
                    System.out.println(booking[i].getDate());
                    searchedByClass = true;
                }
            }
        }
        if(searchedByClass==true){
            System.out.println("lalalalal");
            for(int i =0; i<booking.length; i++){
                System.out.println("Enter the date(i.e 25 April 2020) in which you want to attend " + exercise.toString());
                String date = exerciseScanner.nextLine();
                if(booking[i].getDate().equals(date.toString())) {
                    booking[i].printTimeTable();
                    if(booking[i].getClass1().equals(exercise.toString()) || booking[i].getClass2().equals(exercise.toString()) || booking[i].getClass3().equals(exercise.toString())) {
                        System.out.println("Enter your name: ");
                        String studentName = exerciseScanner.nextLine().toLowerCase();
                        System.out.println("Do you want to confirm your booking? Type Yes or No!");
                        String stringConfirm = exerciseScanner.nextLine().toLowerCase();
                        if (stringConfirm.equals("yes")) {
                            booking[i].setBooking(exercise.toString(), studentName);
                            System.out.println("Enter Back to book another class or Main to go to main menu");
                            String menu = exerciseScanner.nextLine().toLowerCase();
                            if (menu.equals("back")) {
                                bookClass(booking);
                            } else if (menu.equals("main")) {
                                mainMethod(booking);
                            } else {
                                mainMethod(booking);
                            }
                        } else {
                            System.out.println("You are redirected to main menu");
                            mainMethod(booking);
                        }
                    }else {
                        System.out.println("This class is not a part of this schedule");
                        System.out.println("Enter Back to book another class or Main to go to main menu");
                        String menu = exerciseScanner.nextLine().toLowerCase();
                        if(menu.equals("back")){
                            bookClass(booking);
                        }else if(menu.equals("main")){
                            mainMethod(booking);
                        }else{
                            mainMethod(booking);
                        }
                    }
                }
            }
        }
    }
    // Function for booking class end here..

    //Function to update bookings
    public static void changeBookings(Booking[] booking){
        boolean  bookingExists = false;
        System.out.println("Welcome User, Type your name to search your bookings or Main to go back to main menu");
        Scanner changeScanner = new Scanner(System.in);
        String name = changeScanner.nextLine().toLowerCase();
        if(name.equals("main")){
            mainMethod(booking);
        }
        for(int i = 0; i < booking.length; i++){
            booking[i].printBookings(name);
        }
        System.out.println("Enter date for the booking to be changed or Main to go back to main menu");
        String date =  changeScanner.nextLine();
        if(date.toLowerCase().equals("main")){
            mainMethod(booking);
        }
        System.out.println("Enter class name for the booking or Main to go back to main menu");
        String className = changeScanner.nextLine();
        if(className.toLowerCase().equals("main")){
            mainMethod(booking);
        }
        for(int i = 0; i < booking.length; i++){
            booking[i].removeBookings(name, date, className);
        }
        System.out.println("Enter Main to go to main menu, New to make a new booking or Main to go back to main menu");
        String menu = changeScanner.nextLine().toLowerCase();
        if(menu.equals("main")){
            mainMethod(booking);
        }
        if(menu.equals("new")){
            bookClass(booking);
        }
    }
    //End here

    //Function to attend a class
    public static void attendClass(Booking[] booking){
        System.out.println("Welcome User, please type your name to view your bookings");
        Scanner attendScanner = new Scanner(System.in);
        String name = attendScanner.nextLine().toLowerCase();
        for(int i = 0; i < booking.length; i++){
            booking[i].printBookings(name);
        }
        System.out.println("Enter date to attend booking or Main to go back to main menu");
        String date =  attendScanner.nextLine();
        if(date.toLowerCase().equals("main")){
            mainMethod(booking);
        }
        System.out.println("Enter class name for the booking or Main to go back to main menu");
        String className = attendScanner.nextLine();
        if(className.toLowerCase().equals("main")){
            mainMethod(booking);
        }
        for(int i = 0; i < booking.length; i++){
            booking[i].attendAndRate(name, date, className);
        }
        System.out.println("Enter Main to go to main menu, New to make a new booking or Main to go back to main menu");
        String menu = attendScanner.nextLine().toLowerCase();
        if(menu.equals("main")){
            mainMethod(booking);
        }
        if(menu.equals("new")){
            bookClass(booking);
        }
    }

    public static void showMontlyClassReport(Booking [] bookings ){
        Scanner reportScanner = new Scanner(System.in);
        System.out.println("Please enter the number for month to view the report i.e \"4\" for April");
        int monthNumber = reportScanner.nextInt();
        String monthName = reportScanner.nextLine();
        if(monthNumber==1){
            monthName = "January";
        } else if(monthNumber==2){
            monthName = "Feburary";
        } else if(monthNumber==3){
            monthName = "March";
        } else if(monthNumber==4){
            monthName = "April";
        } else if(monthNumber==5){
            monthName = "May";
        } else if(monthNumber==6){
            monthName = "June";
        } else if(monthNumber==7){
            monthName = "July";
        } else if(monthNumber==8){
            monthName = "August";
        } else if(monthNumber==9){
            monthName = "September";
        } else if(monthNumber==10){
            monthName = "October";
        } else if(monthNumber==11){
            monthName = "November";
        }else if(monthNumber==12){
            monthName = "December";
        }else{
            mainMethod(bookings);
        }
        for(int i = 0; i<bookings.length; i++){
            if(bookings[i].getMonth().equals(monthName.toString()) ){
                bookings[i].printStudents();
            }
        }
        System.out.println("Enter Main to go to main menu, New to make a new booking or Main to go back to main menu");
        String menu = reportScanner.nextLine().toLowerCase();
        if(menu.equals("main")){
            mainMethod(bookings);
        }
        if(menu.equals("new")){
            bookClass(bookings);
        }
    }

    public static void showMonthlyChampionReport(Booking[] bookings){
        Scanner reportScanner = new Scanner(System.in);
        System.out.println("Please enter the number for month to view the report i.e \"4\" for April");
        int monthNumber = reportScanner.nextInt();
        String monthName = reportScanner.nextLine();
        if(monthNumber==1){
            monthName = "January";
        } else if(monthNumber==2){
            monthName = "Feburary";
        } else if(monthNumber==3){
            monthName = "March";
        } else if(monthNumber==4){
            monthName = "April";
        } else if(monthNumber==5){
            monthName = "May";
        } else if(monthNumber==6){
            monthName = "June";
        } else if(monthNumber==7){
            monthName = "July";
        } else if(monthNumber==8){
            monthName = "August";
        } else if(monthNumber==9){
            monthName = "September";
        } else if(monthNumber==10){
            monthName = "October";
        } else if(monthNumber==11){
            monthName = "November";
        }else if(monthNumber==12){
            monthName = "December";
        }else{
            mainMethod(bookings);
        }
        for(int i = 0; i<bookings.length; i++){
            if(bookings[i].getMonth().equals(monthName.toString()) ){
                bookings[i].monthlyChampionReports();
            }
        }
        System.out.println("Enter Main to go to main menu, New to make a new booking");
        String menu = reportScanner.nextLine().toLowerCase();
        if(menu.equals("main")){
            mainMethod(bookings);
        }
        if(menu.equals("new")){
            bookClass(bookings);
        }
    }

    public static void printCalender(Booking[] bookings){
        for(int i=0; i< bookings.length; i++){
            System.out.println( "Date is "+bookings[i].getDate()+ " and classes held are 1) "+ bookings[i].getClass1() + " 2) "+ bookings[i].getClass2() + " 3) "+ bookings[i].getClass3());
        }
        System.out.println("Redirecting to main menu\n");
        mainMethod(bookings);
    }


}

