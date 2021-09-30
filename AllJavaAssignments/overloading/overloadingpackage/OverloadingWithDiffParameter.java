package com.overloadingpackage;

//Overloading With Different Parameter 


public class OverloadingWithDiffParameter {
	//for employee
	void getScore(String Empname,int empid,int emprating) {
		System.out.println("Name : "+Empname+"\nEmployee Id : "+empid+"\nEmployee Rating : "+emprating+"\n");
	}
	
	//For student 
	void getScore(String stuname,int rollnum,int percent, String grade) {
		System.out.println("Student Name : "+stuname+"\nStudent Roll Number : "+rollnum+"\nPercentage : "+percent+"%\nGrade : "+grade);
		
	}

	public static void main(String args[]) {
		OverloadingWithDiffParameter DifferentParameter=new OverloadingWithDiffParameter();
		DifferentParameter.getScore("john", 304, 4);
		DifferentParameter.getScore("lily", 472, 90, "A");
		
	}
}