package com.constructoroverloading;

//constructor overloading with different parameter

import com.overloadingpackage.OverloadingWithDiffParameter;

public class ConsOverloadingWithDiffParameter {
	
	//For Employee
	ConsOverloadingWithDiffParameter(String Empname,int empid,int emprating) {
		System.out.println("Name : "+Empname+"\nEmployee Id : "+empid+"\nEmployee Rating : "+emprating+"\n");
	}

	//For Student
	ConsOverloadingWithDiffParameter(String stuname,int rollnum,int percent, String grade) {
		System.out.println("Student Name : "+stuname+"\nStudent Roll Number : "+rollnum+"\nPercentage : "+percent+"%\nGrade : "+grade);
	}
	
	//Main method
	public static void main(String args[]) {
		ConsOverloadingWithDiffParameter consOverloadingWithDiffParameter=new ConsOverloadingWithDiffParameter("john", 201, 3);
		ConsOverloadingWithDiffParameter consOverloadingWithDiffParameter1=new ConsOverloadingWithDiffParameter("lily", 742, 60, "B");
	}
}