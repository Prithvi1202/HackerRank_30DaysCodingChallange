package com.prithvi.hackkerrank;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Day6 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        for(int i=0;i<t;i++){
            char[] s = scan.next().toCharArray();
           String ans= null;
            char[] r = new char[s.length];
            for(int j=s.length-1, n =0;j>=0;j--,n++){
                    r[n]= s[j];
            }
            for(int j=1;j<s.length;j++){
                if((Math.abs(s[j]-s[j-1]))==(Math.abs(r[j]-r[j-1]))){
                    ans = "Funny";
                }
                else{
                    ans = "Not Funny";
                    break;
                }
            }
            System.out.println(ans);
        }
        scan.close();
    }
}