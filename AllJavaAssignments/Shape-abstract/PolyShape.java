package com.classassignments;


class Shape {
	
	void draw() {
		
		System.out.println("Draw shape");
	}
	
	void erase() {
		System.out.println("Erase shape");
	}
}

class Circle extends Shape {
	
	void draw() {
		System.out.println("Draw a circle");
	}
	
	void erase() {
		System.out.println("Erase a circle");
	}
}
	
class Triangle extends Shape {
	
	void draw() {
		System.out.println("Draw a triangle");
	}
	void erase() {
		System.out.println("Erase a triangle");
	}	
}

class Square extends Shape {
	

	void draw() {
		System.out.println("Draw a square");
	}
	void erase() {
		System.out.println("Erase a square");
	}
}


public class PolyShape {
	public static void main(String args[]) {
		
		Shape s = new Circle();
		s.draw();
		s.erase();
		
		s = new Triangle();
		s.draw();
		s.erase();
		
		s = new Square();
		s.draw();
		s.erase();
	}

}
