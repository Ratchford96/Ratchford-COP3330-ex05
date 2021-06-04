/*
 * UCF COP3330 Summer 2021 Assignment 1 Solution
 * Copyright 2021 Joseph Ratchford
 */

import java.util.Scanner;
public class Math {
    public static void main(String[] args)
    {

        // here is where we declare our int functions to solve our problem
        int num1;
        int num2;
        int sum;
        int difference;
        int product;
        int quotient;


        Scanner scan = new Scanner(System.in);

        // here is where we enter our number to solve
        System.out.println("Enter the first number");
         num1 = scan.nextInt();



        System.out.println("Enter the second number");
        num2 = scan.nextInt();

        // Here is where we call our math equation to solve
        sum = num1 + num2;
        System.out.println(num1 +" + " + num2 + " = " + sum);

        difference = num1 - num2;
        System.out.println(num1 + " - " + num2 + " = "+ difference);

        product = num1 * num2;
        System.out.println(num1 + " * " + num2 + " = " + product);

        quotient = num1 / num2;
        System.out.println(num1 + " / " + num2 + " = " + quotient);

    }
}
