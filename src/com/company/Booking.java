package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Booking {
    public String date;
    public String day;
    public String month;
    public String class1;
    public String [] class1StudentsArr = {"", "", "", ""};
    public String [] class1Attendted = {"", "", "", ""};
    public String [] class1Reviews = new String[100];
    public String [] class1Rating = new String[100];
    public double [] class1Prices = new double[100];
    public int class1PricesCounter = 0;
    public int class1StudentCounter = 0;
    public int class1AttentedCounter = 0;
    public double class1PriceTotal = 0.0;
    public String class2;
    public String [] class2StudentsArr = {"", "", "", ""};
    public String [] class2Attendted = {"", "", "", ""};
    public String [] class2Reviews = new String[100];
    public String [] class2Rating = new String[100];
    public double [] class2Prices = new double[100];
    public int class2PricesCounter = 0;
    public int class2StudentCounter = 0;
    public int class2AttentedCounter = 0;
    public double class2PriceTotal = 0.0;
    public String class3;
    public String [] class3StudentsArr = {"", "", "", ""};
    public String [] class3Attendted = {"", "", "", ""};
    public String [] class3Reviews = new String[100];
    public String [] class3Rating = new String[100];
    public double [] class3Prices = new double[100];
    public int class3PricesCounter = 0;
    public int class3StudentCounter = 0;
    public int class3AttentedCounter = 0;
    public double class3PriceTotal = 0.0;
    public String class4;
    public String [] class4StudentsArr = {"", "", "", ""};
    public String [] class4Attendted = {"", "", "", ""};
    public String [] class4Reviews = new String[100];
    public String [] class4Rating = new String[100];
    public double [] class4Prices = new double[100];
    public int class4PricesCounter = 0;
    public int class4StudentCounter = 0;
    public int class4AttentedCounter = 0;
    public double class4PriceTotal = 0.0;
    public double price1;
    public double price2;
    public double price3;
    public double price4;

    public Booking(String date, String day, String class1, String class2, String class3, double price1, double price2, double price3, String month) {
        this.date = date;
        this.day = day;
        this.month = month;
        this.class1 = class1;
        this.class2 = class2;
        this.class3 = class3;
        this.price1 = price1;
        this.price2 = price2;
        this.price3 = price3;
    }

    public String getDate() {
        return date;
    }

    public String getDay() {
        return day;
    }

    public String getClass1() {
        return class1;
    }

    public String getClass2() {
        return class2;
    }

    public String getClass3() {
        return class3;
    }

    public double getPrice1() {
        return price1;
    }

    public double getPrice2() {
        return price2;
    }

    public double getPrice3() {
        return price3;
    }

    public String getMonth() { return month; }

    public void printTimeTable(){
        System.out.println("Date is: " + getDate());
        System.out.println("Day is: " + getDay());
        System.out.println("Morning class is: " + getClass1() + " and it charges: " + getPrice1() + " and current bookings are: " + class1StudentCounter);
        System.out.println("Afternoon class is: " + getClass2() + " and it charges: " + getPrice2()  + " and current bookings are: " + class2StudentCounter);
        System.out.println("Evening class is: " + getClass3() + " and it charges: " + getPrice3() + " and current bookings are: " + class3StudentCounter);
    }

    public void setBooking(String className, String studentName) {
        if (className.equals("Yoga")) {
            boolean found = false;
            for(int i=0; i< class1StudentsArr.length; i++){
                if(class1StudentsArr[i].equals(studentName)){
                    found = true;
                }
            }
            if(found == false) {
                if (class1StudentCounter < 4) {
                    class1StudentsArr[class1StudentCounter] = studentName;
                    System.out.println(class1StudentsArr[class1StudentCounter]);
                    class1StudentCounter++;
                    System.out.println("Booking Successful" + "\nTotal Number of Bookings: " + class1StudentCounter);
                } else {
                    System.out.println("No seats available");
                }
            }else{
                System.out.println("You have already booked this class");
            }
        } else if(className.equals("Zumba")){
            boolean found = false;
            for(int i=0; i< class2StudentsArr.length; i++){
                if(class2StudentsArr[i].equals(studentName)){
                    found = true;
                }
            }
            if(found == false) {
                if (class2StudentCounter < 4) {
                    class2StudentsArr[class2StudentCounter] = studentName;
                    class2StudentCounter++;
                    System.out.println("Booking Successful" + "\nTotal Number of Bookings: " + class2StudentCounter);
                } else {
                    System.out.println("No seats available");
                }
            }else{
                System.out.println("You have already booked this class");
            }
        } else if(className.equals("HipHop")){
            boolean found = false;
            for(int i=0; i< class3StudentsArr.length; i++){
                if(class3StudentsArr[i].equals(studentName)){
                    found = true;
                }
            }
            if(found == false) {
                if (class3StudentCounter < 4) {
                    class3StudentsArr[class3StudentCounter] = studentName;
                    class3StudentCounter++;
                    System.out.println("Booking Successful" + "\nTotal Number of Bookings: " + class3StudentCounter);
                } else {
                    System.out.println("No seats available");
                }
            }
            else{
                System.out.println("You have already booked this class");
            }
        } else if(className.equals("Aquacise")){
            boolean found = false;
            for(int i=0; i< class4StudentsArr.length; i++){
                if(class4StudentsArr[i].equals(studentName)){
                    found = true;
                }
            }
            if(found == false) {
                if (class4StudentCounter < 4) {
                    class4StudentsArr[class4StudentCounter] = studentName;
                    class4StudentCounter++;
                    System.out.println("Booking Successful" + "\nTotal Number of Bookings: " + class4StudentCounter);
                } else {
                    System.out.println("No seats available");
                }
            }
            else{
                System.out.println("You have already booked this class");
            }
        }
    }

    public void printBookings(String name) {
        for(int i = 0; i<class1StudentsArr.length; i++){
            if(class1StudentsArr[i].equals(name)){
                System.out.println("You have a booking in this class1: " + getClass1() + " which is held on: "+getDate());
            }
            if(class2StudentsArr[i].equals(name)){
                System.out.println("You have a booking in this class2: " + getClass2() + " which is held on: "+getDate());
            }
            if(class3StudentsArr[i].equals(name)){
                System.out.println("You have a booking in this class3: " + getClass3() + " which is held on: "+getDate());
            }
            if(class4StudentsArr[i].equals(name)){
                System.out.println("You have a booking in this class3: Aquacise" + " which is held on: "+getDate());
            }
        }
    }

    public void removeBookings(String name, String date, String className){
        Scanner removeScanner = new Scanner(System.in);
        String choice;
        for(int i = 0; i<class1StudentsArr.length; i++){
            if(class1StudentsArr[i].equals(name) && getDate().equals(date) && getClass1().equals(className)){
                System.out.println("Enter Yes to remove your booking or No to continue");
                choice = removeScanner.nextLine().toLowerCase();
                if(choice.equals("yes")){
                    class1StudentsArr[i] = "";
                    class1StudentCounter--;
                    System.out.println("Booking Successfully Removed");
                }
            }
            if(class2StudentsArr[i].equals(name) && getDate().equals(date) && getClass2().equals(className)){
                System.out.println("Enter Yes to remove your booking or No to continue");
                choice = removeScanner.nextLine().toLowerCase();
                if(choice.equals("yes")){
                    class2StudentsArr[i] = "";
                    class2StudentCounter--;
                    System.out.println("Booking Successfully Removed");
                }
            }
            if(class3StudentsArr[i].equals(name) && getDate().equals(date) && getClass3().equals(className)){
                System.out.println("Enter Yes to remove your booking or No to continue");
                choice = removeScanner.nextLine().toLowerCase();
                if(choice.equals("yes")){
                    class3StudentsArr[i] = "";
                    class3StudentCounter--;
                    System.out.println("Booking Successfully Removed");
                }
            }
            if(class4StudentsArr[i].equals(name) && getDate().equals(date) && className.equals("Aquacise")){
                System.out.println("Enter Yes to remove your booking or No to continue");
                choice = removeScanner.nextLine().toLowerCase();
                if(choice.equals("yes")){
                    class4StudentsArr[i] = "";
                    class4StudentCounter--;
                    System.out.println("Booking Successfully Removed");
                }
            }
        }
    }

    public void printRatingOptions(){
        System.out.println("Please rate this class from the following:");
        System.out.println("1: Very dissatisfied");
        System.out.println("2: Dissatisfied");
        System.out.println("3: Ok");
        System.out.println("4: Satisfied");
        System.out.println("5: Very Satisfied");
    }

    public void attendAndRate(String studentName, String date, String className){
        Scanner attendScanner = new Scanner(System.in);
        if (className.equals("Yoga") && getDate().equals(date)) {
            boolean found = false;
            for(int i=0; i< class1Attendted.length; i++){
                if(!class1Attendted[i].equals(null) && class1Attendted[i].equals(studentName)){
                    found = true;
                }
            }
            if(found == false) {
                class1Attendted[class1AttentedCounter] = studentName;
                for(int i=0; i< class1StudentsArr.length; i++){
                    if(class1StudentsArr[i].equals(studentName)){
                        class1StudentsArr[i] = "";
                        class1StudentCounter--;
                    }
                }
                class1Prices[class1PricesCounter] = getPrice1();
                System.out.println("Attended Successful, Please give you valuable review");
                String review = attendScanner.nextLine();
                class1Reviews[class1AttentedCounter] = review;
                printRatingOptions();
                int rating = attendScanner.nextInt();
                if(rating == 1){
                    class1Rating[class1AttentedCounter] = "Very dissatisfied";
                }else if(rating == 2){
                    class1Rating[class1AttentedCounter] = "Dissatisfied";
                }else if(rating == 3){
                    class1Rating[class1AttentedCounter] = "Ok";
                }else if(rating == 4){
                    class1Rating[class1AttentedCounter] = "Satisfied";
                }else if(rating == 5){
                    class1Rating[class1AttentedCounter] = "Very Satisfied";
                }
                System.out.println("Thankyou for your feedback :)");
                class1AttentedCounter++;
                class1PricesCounter++;
            }else{
                System.out.println("You have already attended this class");
            }
        } else if(className.equals("Zumba") && getDate().equals(date)){
            boolean found = false;
            for(int i=0; i< class2Attendted.length; i++){
                if(class2Attendted[i].equals(studentName)){
                    found = true;
                }
            }
            if(found == false) {
                class2Attendted[class2AttentedCounter] = studentName;
                for(int i=0; i< class2StudentsArr.length; i++){
                    if(class2StudentsArr[i].equals(studentName)){
                        class2StudentsArr[i] = "";
                        class2StudentCounter--;
                    }
                }
                class2Prices[class2PricesCounter] = getPrice2();
                System.out.println("Attended Successful, Please give you valuable review");
                String review = attendScanner.nextLine();
                class2Reviews[class2AttentedCounter] = review;
                printRatingOptions();
                int rating = attendScanner.nextInt();
                if(rating == 1){
                    class2Rating[class2AttentedCounter] = "Very dissatisfied";
                }else if(rating == 2){
                    class2Rating[class2AttentedCounter] = "Dissatisfied";
                }else if(rating == 3){
                    class2Rating[class2AttentedCounter] = "Ok";
                }else if(rating == 4){
                    class2Rating[class2AttentedCounter] = "Satisfied";
                }else if(rating == 5){
                    class2Rating[class2AttentedCounter] = "Very Satisfied";
                }
                System.out.println("Thankyou for your feedback :)");
                class2AttentedCounter++;
                class2PricesCounter++;
            }else{
                System.out.println("You have already attended this class");
            }
        } else if(className.equals("HipHop") && getDate().equals(date)){
            boolean found = false;
            for(int i=0; i< class3Attendted.length; i++){
                if(class3Attendted[i].equals(studentName)){
                    found = true;
                }
            }
            if(found == false) {
                class3Attendted[class3AttentedCounter] = studentName;
                for(int i=0; i< class3StudentsArr.length; i++){
                    if(class3StudentsArr[i].equals(studentName)){
                        class3StudentsArr[i] = "";
                        class3StudentCounter--;
                    }
                }
                class3Prices[class3PricesCounter] = getPrice3();
                System.out.println("Attended Successful, Please give you valuable review");
                String review = attendScanner.nextLine();
                class3Reviews[class3AttentedCounter] = review;
                printRatingOptions();
                int rating = attendScanner.nextInt();
                if(rating == 1){
                    class3Rating[class3AttentedCounter] = "Very dissatisfied";
                }else if(rating == 2){
                    class3Rating[class3AttentedCounter] = "Dissatisfied";
                }else if(rating == 3){
                    class3Rating[class3AttentedCounter] = "Ok";
                }else if(rating == 4){
                    class3Rating[class3AttentedCounter] = "Satisfied";
                }else if(rating == 5){
                    class3Rating[class3AttentedCounter] = "Very Satisfied";
                }
                System.out.println("Thankyou for your feedback :)");
                class3AttentedCounter++;
                class2PricesCounter++;
            }
            else{
                System.out.println("You have already attended this class");
            }
        } else if(className.equals("Aquacise") && getDate().equals(date)){
            boolean found = false;
            for(int i=0; i< class4Attendted.length; i++){
                if(class4Attendted[i].equals(studentName)){
                    found = true;
                }
            }
            if(found == false) {
                class4Attendted[class4AttentedCounter] = studentName;
                for(int i=0; i< class4StudentsArr.length; i++){
                    if(class4StudentsArr[i].equals(studentName)){
                        class4StudentsArr[i] = "";
                        class4StudentCounter--;
                    }
                }
                class4Prices[class4PricesCounter] = 13;
                System.out.println("Attended Successful, Please give you valuable review");
                String review = attendScanner.nextLine();
                class4Reviews[class4AttentedCounter] = review;
                printRatingOptions();
                int rating = attendScanner.nextInt();
                if(rating == 1){
                    class4Rating[class4AttentedCounter] = "Very dissatisfied";
                }else if(rating == 2){
                    class4Rating[class4AttentedCounter] = "Dissatisfied";
                }else if(rating == 3){
                    class4Rating[class4AttentedCounter] = "Ok";
                }else if(rating == 4){
                    class4Rating[class4AttentedCounter] = "Satisfied";
                }else if(rating == 5){
                    class4Rating[class4AttentedCounter] = "Very Satisfied";
                }
                System.out.println("Thankyou for your feedback :)");
                class4AttentedCounter++;
                class4PricesCounter++;
            }
            else{
                System.out.println("You have already attended this class");
            }
        }
    }

    public void printStudents(){
        if(class1AttentedCounter>0){
            System.out.println("Student who attended "+ getClass1()+ " class are: ");
            for(int i = 0; i< class1Attendted.length; i++){
                if(class1Attendted[i].length() > 0 ){
                    System.out.println(class1Attendted[i]);
                }
            }
            System.out.println("Reviews are: ");
            for(int i=0 ; i< class1Reviews.length; i++){
                if(class1Reviews[i]!=null){
                    System.out.println(class1Reviews[i]);
                }
            }
            System.out.println("Ratings are: ");
            for(int i=0 ; i< class1Rating.length; i++){
                if(class1Rating[i]!=null){
                    System.out.println(class1Rating[i]);
                }
            }
        }
        if(class2AttentedCounter>0){
            System.out.println("Student who attended "+ getClass2()+ " class are: ");
            for(int i = 0; i< class2Attendted.length; i++){
                if(class2Attendted[i].length() > 0 ){
                    System.out.println(class2Attendted[i]);
                }
            }
            System.out.println("Reviews are: ");
            for(int i=0 ; i< class2Reviews.length; i++){
                if(class2Reviews[i]!=null){
                    System.out.println(class2Reviews[i]);
                }
            }
            System.out.println("Ratings are: ");
            for(int i=0 ; i< class2Rating.length; i++){
                if(class2Rating[i]!=null){
                    System.out.println(class2Rating[i]);
                }
            }
        }
        if(class3AttentedCounter>0){
            System.out.println("Student who attended "+ getClass3()+ " class are: ");
            for(int i = 0; i< class3Attendted.length; i++){
                if(class3Attendted[i].length() > 0 ){
                    System.out.println(class3Attendted[i]);
                }
            }
            System.out.println("Reviews are: ");
            for(int i=0 ; i< class3Reviews.length; i++){
                if(class3Reviews[i]!=null){
                    System.out.println(class3Reviews[i]);
                }
            }
            System.out.println("Ratings are: ");
            for(int i=0 ; i< class3Rating.length; i++){
                if(class3Rating[i]!=null){
                    System.out.println(class3Rating[i]);
                }
            }
        }
        if(class4AttentedCounter>0){
            System.out.println("Student who attended Aquacise class are: ");
            for(int i = 0; i< class4Attendted.length; i++){
                if(class4Attendted[i].length() > 0 ){
                    System.out.println(class4Attendted[i]);
                }
            }
            System.out.println("Reviews are: ");
            for(int i=0 ; i< class4Reviews.length; i++){
                if(class4Reviews[i]!=null){
                    System.out.println(class4Reviews[i]);
                }
            }
            System.out.println("Ratings are: ");
            for(int i=0 ; i< class4Rating.length; i++){
                if(class4Rating[i]!=null){
                    System.out.println(class4Rating[i]);
                }
            }
        }
    }

    public void monthlyChampionReports(){
        double total1 = 0.0;
        double total2 = 0.0;
        double total3 = 0.0;
        double total4 = 0.0;
        if(class1AttentedCounter>0){
            for(int i = 0; i< class1Prices.length; i++){
                if(class1Prices[i] != 0.0){
                    total1 = class1Prices[i] + total1;
                }
            }
        }
        if(class2AttentedCounter>0){
            for(int i = 0; i< class2Prices.length; i++){
                if(class2Prices[i] != 0.0){
                    total2 = class2Prices[i] + total2;
                }
            }
        }
        if(class3AttentedCounter>0){
            for(int i = 0; i< class3Prices.length; i++){
                if(class3Prices[i] != 0.0){
                    total3 = class3Prices[i] + total3;
                }
            }
        }
        if(class4AttentedCounter>0){
            for(int i = 0; i< class4Prices.length; i++) {
                if (class4Prices[i] != 0.0) {
                    total4 = class4Prices[i] + total4;
                }
            }
        }
        if((total1 > total2) && (total1  > total3) && (total1 > total4 )){
            System.out.println("Highest Earning are by " + getClass1() + " which is equal to: " + total1);
        }
        if((total2 > total1) && (total2  > total3) && (total2 > total4 )){
            System.out.println("Highest Earning are by " + getClass2() + " which is equal to: " + total2);
        }
        if((total3 > total1) && (total3  > total2) && (total3 > total4 )){
            System.out.println("Highest Earning are by " + getClass3() + " which is equal to: " + total3);
        }
        if((total4 > total1) && (total4  > total2) && (total4 > total3 )){
            System.out.println("Highest Earning are by Aquacise" + " which is equal to: " + total4);
        }
    }
}
