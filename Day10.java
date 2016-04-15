package com.prithvi.hackkerrank;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Day10 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
       StringBuilder sb = new StringBuilder();
		while(number > 0){

		sb.append( number%2);

		number = number/2;

		}
        sb = sb.reverse();
        in.close();
        int count = 0;
        int max = 0;
      // int i =0;
        for(int i = 0; i<sb.length();i++){
     if(sb.charAt(i)%2 == 0)
           count  = 0;
     else
           count = count +1;
    
      if (count  > max)
              max  = count;

      }
        System.out.println(max);
    }
}