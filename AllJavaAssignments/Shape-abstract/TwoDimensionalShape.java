package com.classassignments;

public abstract class TwoDimensionalShape extends ShapeHeierarchy {

	TwoDimensionalShape(float side1){
		super(side1);
	}
    TwoDimensionalShape(float side1,float side2) {
		super(side1,side2);
	}
	abstract void getArea();
}


/// class for Triangle
class Triangle1 extends TwoDimensionalShape {
	float areaoftriangle;
	Triangle1(float base,float height) {
		super(base,height);		
	}
	
	// For calculating area of triangle
	void getArea() {
		areaoftriangle=(((float)0.5)*(getDimension1()*getDimension2()));
		System.out.println("Area of triangle : "+areaoftriangle);
	}
}


/// class for Square

class Square1 extends TwoDimensionalShape{
	float areaofsquare;
	Square1(float side){
		super(side);
	}
	// for calculating the area	
	void getArea() {
		areaofsquare=getDimension1()*getDimension1();
		System.out.println("Area of Square : "+areaofsquare);
	}

}


/// class for Circle

class Circle1 extends TwoDimensionalShape {
    float areaofcircle;
	Circle1(float radius){
		super(radius);
	}
	
	//For circle area
	
	void getArea()	{
		areaofcircle=getDimension1()*getDimension1()*(float)Math.PI;
		System.out.println("Area of circle : "+areaofcircle);
	}
}
