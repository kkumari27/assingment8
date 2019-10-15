package com.assingmet8.demo;

import java.util.LinkedList; 
public class Lastelement {
	   public static void main(String args[]) { 

	      LinkedList<String> list = new LinkedList<String>();  
	      list.add("Geeks"); 
	      list.add("for"); 
	      list.add("Geeks"); 
	      list.add("10"); 
	      list.add("20"); 
	 
	      System.out.println("LinkedList:" + list); 
	       
	      System.out.println("The last element is: " + list.getLast()); 
	   } 

}
