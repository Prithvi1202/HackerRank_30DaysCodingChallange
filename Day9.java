package com.prithvi.hackkerrank;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Day9 {

    public static int factorial(int num){
        if(num == 1){
            return 1;
        }
        else{
            return num*factorial(num-1);
        }
    }
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Day9 s = new Day9();
       Scanner scan = new Scanner(System.in);
       int num = scan.nextInt();
       System.out.println(factorial(num));
        
    }
}