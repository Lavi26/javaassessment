package com.mainpackage;

import com.addition.AdditionService;
import com.substraction.SubstractionService;
import com.multiplication.MultiplicationService;
import com.division.DivisionService;
import com.evenodd.EvenOddService;



public class MainPackageClass {
	
	public static void main(String args[]) {
		
		AdditionService additionservice = new AdditionService();
		additionservice.SumOfNumber(5, 9);
		
		SubstractionService substractionservice = new SubstractionService();
		substractionservice.SubOfNumber(4, 11);
		
		MultiplicationService multiplicationservice = new MultiplicationService();
		multiplicationservice.MulOfNumber(5, 7);
		
		DivisionService divisionservice = new DivisionService();
		divisionservice.DivOfNumber(5, 9);
		
		EvenOddService eveoddservice = new EvenOddService();
		eveoddservice.EvenOrOdd(5);
	}

}
