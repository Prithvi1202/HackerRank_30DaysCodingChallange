package com.prithvi.hackkerrank;
package com.prithvi.hackkerrank.day13;
import java.util.*;
abstract class Book
{
    String title;
    String author;
    Book(String t,String a){
        title=t;
        author=a;
    }
    abstract void display();
}

class MyBook extends Book{
	String title, author;
	int price;
	public MyBook(String title, String author, int price){
		super(title, author);
		/*this.title = title;
		this.author = author;*/
		this.price = price;
	}
	@Override
	void display() {
		// TODO Auto-generated method stub
		System.out.println("Title: "+title);
		System.out.println("Author: "+author);
		System.out.println("Price: "+price);
	}
	
}
public class Day13
{
	   
	   public static void main(String []args)
	   {
	      Scanner sc=new Scanner(System.in);
	      String title=sc.nextLine();
	      String author=sc.nextLine();
	      int price=sc.nextInt();
	      Book new_novel=new MyBook(title,author,price);
	      new_novel.display();
	      sc.close();
	   }
	}