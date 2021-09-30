package com.java8.lambdaexp;

interface Palindrome{
	int isPalindrome(int num);
}
public class LambdaForPalindrome {
	
	public static void main(String args[]) {
		
		Palindrome plindromenum=(num) ->{
			int temp=num;                                //store number to temp variable
			int reversednum=0,remainder;
			while(temp!=0) {                                  //get reverse and store into variable
				remainder=temp%10;
				reversednum=reversednum*10+ remainder;
				temp=temp/10;
			}
			
			remainder=(num==reversednum)?0:1;                           //if remainder ==0  palindrome else not palindrome
			return remainder;
		};
		int remainder=plindromenum.isPalindrome(806);
		System.out.println("The given number is : "+(remainder==0?"Palindrome":"Not Palindrome"));
	}

}