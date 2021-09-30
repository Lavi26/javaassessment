package com.overloadingpackage;


//Overloading with different data types
//Write a Java Program to demonstrate the Method Overloading with difference in datatypes of parameters.


public class OverloadingWithDiffDataType {
	
	void calculateSum(int num1,int num2) {
		System.out.println("Sum of two integer number : "+(num1+num2));
	}
	
 void calculateSum(float num1,float num2) {
 	System.out.println("Sum of two float number : "+(num1+num2));
	}
 
 void calculateMultiply(int num1,int num2) {
 	System.out.println("Multiplication of two integer number : "+(num1*num2));
	}
	
 void calculateMultiply(float num1,float num2) {
 	System.out.println("Multiplication of two float number : "+(num1*num2));
	}

 public static void main(String args[]) {
	 
 	//Creating object for integer number
 	OverloadingWithDiffDataType DifferentDataType=new OverloadingWithDiffDataType();
 	DifferentDataType.calculateSum(6, 9);
 	DifferentDataType.calculateMultiply(6, 9);
 	
 	
 	//Creating object for float number
 	OverloadingWithDiffDataType DifferentDataType1=new OverloadingWithDiffDataType();
 	DifferentDataType1.calculateSum((float)7.6,(float)8.9);
   	DifferentDataType1.calculateMultiply((float)7.6,(float)8.9);
 }
 
 
}