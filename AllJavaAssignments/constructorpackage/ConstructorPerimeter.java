package com.constructorpackage;




public class ConstructorPerimeter {
	
	ConstructorPerimeter() {                     //zero argument
		
		int length=3;
		int breadth=5;
		
		int perimeterofrectangle = (length + breadth)*2;
		
		System.out.println("Perimeter of rectangle is  " +perimeterofrectangle);
	}
	
	
	ConstructorPerimeter(int side) {                   //parameterized
		
		int perimeterofsquare= 4*side;
		
		System.out.println("Perimeter of square is  " +perimeterofsquare);
	}

	
	ConstructorPerimeter(int base, int side1, int side2) {                     // overloading
		
		int perimeteroftriangle= base+side1+side2;
		
		System.out.println("Perimeter of Triangle is  " +perimeteroftriangle);
	}
	
	
	public static void main(String args[]) {
		
		ConstructorPerimeter perimeterofrectangle= new ConstructorPerimeter();
		ConstructorPerimeter perimeterofsquare= new ConstructorPerimeter(4);
		ConstructorPerimeter perimeteroftriangle= new ConstructorPerimeter(4,5,6);
	}
}
