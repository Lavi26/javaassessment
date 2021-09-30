package com.specifier;


class  num{
	protected int a = 90;
	protected int b= 100;
	
    void display() {
        System.out.println("the value from parent class  :"+a);
    }
}

class num1 extends num {
	

     void display() {
        System.out.println("the value from Child class  :"+b);
  
}
}

public class ProtectedSpecifier
{
	  public static void main(String[] args) {

	        // create an object 
	        num n = new num();
	         // access protected method
	        n.display();
	        
	        num1 n1 = new num1();
	        
	        n1.display();
	        
	    }
}