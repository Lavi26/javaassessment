package com.overloadingpackage;

//overloading by changing sequence

public class OverloadingByChangingSeq {
	
	//for employee 
	void getEmployee(String Empname,int empid,String designation) {
		System.out.println("Name : "+Empname+"\nEmployee Id : "+empid+"\nEmployee Branch : "+designation+"\n");
	}
	
	//After changing the Sequence
	void getEmployee(int empid,String designation ,String Empname) {
		System.out.println("Name : "+Empname+"\nEmployee Id : "+empid+"\nEmployee Branch : "+designation+"\n");
	}

	public static void main(String args[]) {
		
		OverloadingByChangingSeq overloadingByChangingSeq=new OverloadingByChangingSeq();
		overloadingByChangingSeq.getEmployee("john", 401, "HR");
		
		//object second method
		OverloadingByChangingSeq overloadingByChangingSeq1=new OverloadingByChangingSeq();
		overloadingByChangingSeq1.getEmployee(101, "Software Engineer","lily");
		
		
	}

}