package com.constructoroverloading;

//Write a Java Program to demonstrate the Method Overloading with difference in datatypes of parameters.


public class ConsOverloadingWithDiffDataTypes {
	
    ConsOverloadingWithDiffDataTypes(int num1,int num2) {
		System.out.println("Sum of two integer number : "+(num1+num2));
	}
	
    ConsOverloadingWithDiffDataTypes(float num1,float num2) {
    	System.out.println("Sum of two float number : "+(num1+num2));
	}
    
    public static void main(String args[]) {
    	ConsOverloadingWithDiffDataTypes consOverloadingDiffDataType=new ConsOverloadingWithDiffDataTypes(8, 3);
    	ConsOverloadingWithDiffDataTypes consOverloadingDiffDataType2=new ConsOverloadingWithDiffDataTypes((float)5.5,(float)8.9);
    }

}