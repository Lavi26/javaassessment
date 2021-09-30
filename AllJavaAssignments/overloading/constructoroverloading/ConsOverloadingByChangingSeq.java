package com.constructoroverloading;

public class ConsOverloadingByChangingSeq {
	
	//for employee 
	ConsOverloadingByChangingSeq(int empid,String Empname,int emprating) {
		System.out.println("Name : "+Empname+"\nEmployee Id : "+empid+"\nEmployee Rating : "+emprating+"\n");
	}
	
	//After changing the sequence of empname and empid
	ConsOverloadingByChangingSeq(String Empname,int empid,int emprating) {
		System.out.println("Name : "+Empname+"\nEmployee Id : "+empid+"\nEmployee Rating : "+emprating+"\n");
	}
	
	//Main method
	public static void main(String args[]) {
		ConsOverloadingByChangingSeq consOverloadingByChangeSeq=new ConsOverloadingByChangingSeq(101, "john", 4);
		ConsOverloadingByChangingSeq consOverloadingByChangeSeq2=new ConsOverloadingByChangingSeq("lily", 102, 4);
	}

}