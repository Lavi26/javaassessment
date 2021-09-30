package com.stringassignment;

public class EqualsIgnoreCase {
	public static void main(String args[]){  
		
		String string1="lavi";  
		String string2="lavi";  
		String string3="LAVI";  
		String string4="java"; 
		
		System.out.println(string1.equalsIgnoreCase(string2));     //true because content and case both are same  
		System.out.println(string1.equalsIgnoreCase(string3));      //true because case is ignored  
		System.out.println(string1.equalsIgnoreCase(string4));       //false because content is not same  
		}

}
