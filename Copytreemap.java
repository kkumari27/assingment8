package com.assingmet8.demo;
import java.util.*; 
public class Copytreemap {
	 public static void main(String args[]){  
	    TreeMap<String,String> tree_map1=new TreeMap<String,String>();      
	  tree_map1.put("C1", "Red");
	  tree_map1.put("C2", "Green");
	  tree_map1.put("C3", "Black");
	  tree_map1.put("C4", "White");
	  tree_map1.put("C5", "Blue");
	   System.out.println("Tree Map 1: "+tree_map1);
	   TreeMap<String,String> tree_map2 = new TreeMap<String,String>();
	   tree_map2.put("A1", "Orange");
	   tree_map2.put("A2", "Pink");
	   System.out.println("Tree Map 2: "+tree_map2);
	   tree_map1.putAll(tree_map2);
	   System.out.println("After coping map2 to map1: "+tree_map1);   
	 }  
	}


