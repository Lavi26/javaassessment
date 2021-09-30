package com.stringassignment;

public class Equals {
	public static void main(String args[]){  
		
		String name1="lavi";  
		String name2="lavi";  
		String name3="Lavi";  
		
		System.out.println(name1.equals(name2));              //true because content and case is same  
		System.out.println(name1.equals(name3));              //false because case is not same  
		
		}

}
