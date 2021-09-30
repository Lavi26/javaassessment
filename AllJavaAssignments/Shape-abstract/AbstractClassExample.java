package com.classassignments;

//Abstract class example

abstract class Language{
	public abstract void display();
}

class Java extends Language {
		public void display() {
		System.out.println("This is Java Language");
	}
	
}
public class AbstractClassExample {
	
	public static void main(String args[]) {
		
		Java obj = new Java();
		obj.display();
	}

}
