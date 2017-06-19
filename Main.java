package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // creates a new scanner

        int year1, year2, month1, month2, day1, day2;


        System.out.println("Enter the first date: (format -> \"Year Month Day for example 1984 30 12\")"); // Prompts user for first date

// Reads the date the user entered
        year1 = scanner.nextInt();
        month1 = scanner.nextInt();
        day1 = scanner.nextInt();


        System.out.println("Enter the second date: format -> \"Year Month Day for example 1984 30 12\")"); //Prompts user for second date

// Reads the second date the user entered
        year2 = scanner.nextInt();
        month2 = scanner.nextInt();
        day2 = scanner.nextInt();

//converts year, month and date of date 1 and 2 to integer
        int date1 = (year1 * 365 + month1 * 30) + day1;
        int date2 = (year2 * 365 + month2 * 30) + day2;

        int durationDifference = Math.abs(date2 - date1);

//Converts the year, month and date back to year, month, date format
        int year = durationDifference / 365;
        int month = (durationDifference % 365) / 30;
        int day = (durationDifference % 365) % 30;

// Prints out the difference
        System.out.println("Difference in time is: " + year + " year(s)" + " " + month + " month(s)" + " " + day + " day(s)");
    }
}
