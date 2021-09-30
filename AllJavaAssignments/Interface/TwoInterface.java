package com.classassignments;

//Write a java program in which you will declare two interface sum and Add inherits these interface through class A1
//and display their content.

interface Sum {
	
	void sumofnumber();
	
}

interface Add {
	
	void additionofnumber();
	
}

class A1 implements Sum,Add {
	

	@Override
	public void additionofnumber() {
		// TODO Auto-generated method stub
		
		System.out.println("Sum is to add together");
	}

	@Override
	public void sumofnumber() {
		// TODO Auto-generated method stub
		
		System.out.println("Add is to join or unite");
	}
}

public class TwoInterface {
	public static void main(String args[]) {
		
		A1 obj = new A1();
		obj.additionofnumber();
		obj.sumofnumber();
		
	}
}


