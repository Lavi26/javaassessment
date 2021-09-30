package com.exception;


/*Handle exception in number Problem statement: Get the input String from user and parse it to integer, 
if it is not a number it will throw number format exception Catch it and print 
"Entered input is not a valid format for an integer." or else print the square of that number. 
(Refer Sample Input and Output).
 Sample input and output 1: Enter an integer: 12 
 Output : The square value is 144 
 The work has been done successfully
 Sample input and output 2:
 Enter an integer: Java Entered input is not a valid format for an integer.
 */


import java.util.Scanner;

public class NumberFormat {

	public static void main(String args[]) {
		String num;
		Scanner obj=new Scanner(System.in);
		System.out.print("Enter an integer : ");
		try {
			num=obj.next();
			int i=Integer.parseInt(num);                         // check weather given input is integer of not
			System.out.println("The Square of number is : "+i*i);
					
		}
		catch(NumberFormatException e) {
			System.out.println("Entered input is not a valid format for an integer");
		}
	}
}