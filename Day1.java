package com.prithvi.hackkerrank;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Day1 {
	
    public static void main(String[] args) {
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";
		
        Scanner scan = new Scanner(System.in);

        int a;
        double b;
        String c;
        // Declare second integer, double, and String variables.
        // Read and save an integer, double, and String to your variables.
        
        a = scan.nextInt();
        b = scan.nextDouble();
        
        c = scan.next();
        c += scan.nextLine();
    scan.close();
       // scan.close();
        // Print the sum of both integer variables on a new line.
        System.out.println(a+i);

        // Print the sum of the double variables on a new line.
        System.out.println(b+d);
        // Concatenate and print the String variables on a new line
        System.out.println(s+c);
            /* Read and save an integer, double, and String to your variables.*/

            /* Print the sum of both integer variables on a new line. */

            /* Print the sum of the double variables on a new line. */
    		
            /* Concatenate and print the String variables on a new line; 
            	the 's' variable above should be printed first. */
        scan.close();
    }
}