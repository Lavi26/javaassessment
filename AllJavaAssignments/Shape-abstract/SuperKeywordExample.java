package com.classassignments;

//Example of super class

class Addition{
	int numone,numtwo;
	void setValueA(int num1,int num2) {
		numone=num1;
		numtwo=num2;
	}
	void result() {
		System.out.println("Sum is : "+(numone+numtwo));
	}
}

class Subtraction extends Addition{
	int numone,numtwo;
	void setValueB(int num1,int num2) {
		numone=num1;
		numtwo=num2;
	}
	void result() {
		super.result();                                           // call parent class method
		System.out.println("Subtraction is : "+(numone-numtwo));
	}
}

public class SuperKeywordExample {
	public static void main(String args[]) {
		Subtraction subtract=new Subtraction();
		subtract.setValueA(3, 7);
		
		subtract.setValueB(5,9);
		subtract.result();
	}


}
