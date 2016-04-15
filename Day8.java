package com.prithvi.hackkerrank;
import java.util.*;
import java.io.*;

class Day8{
   public static void main(String []argh)
   {
      Scanner in = new Scanner(System.in);
      int N=in.nextInt();
      HashMap<String, Integer> hm = new HashMap<String, Integer>();
     // in.nextLine();
      for(int i=0;i<N;i++)
      {
         String name=in.next();
         int phone=in.nextInt();
           //  System.out.println(name +" "+phone);
			// in.nextLine();
		  hm.put(name, phone);
      }
	  
     while(in.hasNext())
      {
         String s=in.next();
          if(hm.containsKey(s)){
            int value = hm.get(s);
             System.out.println(s+"="+value);
          }
          else{
              System.out.println("Not found");
          }
      }
	 
       
   }
}