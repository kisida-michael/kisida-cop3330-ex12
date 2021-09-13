package org.example;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Michael Kisida
 */

import java.util.Scanner;
public class Interest
{
    public static void main( String[] args )
    {

        Scanner input = new Scanner(System.in);  // Create a Scanner object
        System.out.print("Enter the principal: ");
        int principal = input.nextInt();  // Read user input
        System.out.print("Enter the rate of interest: ");
        double interestRate = input.nextDouble();  // Read user input
        double interestRateD = interestRate /  100;
        System.out.print("Enter the number of years: ");
        int years = input.nextInt();  // Read user input
        double interest = principal * (1+ (interestRateD*years));
        double round = Math.round(interest * 100.0) /100.0;

        String output1 = String.format("After %d years at %.1f, the investment will be worth $%.2f.", years, interestRate, round);
        System.out.println(output1);
        input.close();
    }
}
