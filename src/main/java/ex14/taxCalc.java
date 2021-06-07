/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Connor Stanley
 */


package ex14;

import java.util.Scanner;

public class taxCalc {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        // Asking for input in string form
        System.out.print("What is the order amount? ");
        String orderAmount = in.nextLine();
        System.out.print("What is the state? ");
        String taxState = in.nextLine();


        // Numerical Conversion from string to type double
        double subTotal = Double.parseDouble(orderAmount);
        double tax = 0;


        // Determiner of whether or not a tax will be applied
        if (taxState.equals("WI")){

            tax = .55;
            System.out.print("The subtotal is $" + subTotal + ".\n");
            System.out.print("The tax is $" + tax +".\n");

        }

        // Final Calculation
        double total = subTotal + tax;

        // Output within a single line
        System.out.print( "The total is :$ "+ total + ".");


    }
}
