package com.classassignments;

public abstract class ShapeHeierarchy {
	
	float dimension1;
	float dimension2;
	float dimension3;
	
	//Getter and setter
	public float getDimension1() {
		return dimension1;
	}

	public void setDimention1(float dimension1) {
		this.dimension1 = dimension1;
	}

	public float getDimension2() {
		return dimension2;
	}

	public void setDimension2(float dimension2) {
		this.dimension2 = dimension2;
	}

	public float getDimension3() {
		return dimension3;
	}

	public void setDimension3(float dimension3) {
		this.dimension3 = dimension3;
	}

	
	// Single parameter constructor
	ShapeHeierarchy(float side1){
		this.dimension1=side1;
	}
	
	//Double parameter constructor
	ShapeHeierarchy(float side1,float side2) {
		this.dimension1=side1;
		this.dimension2=side2;
	}
	//Three parameter constructor
	ShapeHeierarchy(float side1,float side2,float side3) {
		this.dimension1=side1;
		this.dimension2=side2;
		this.dimension3=side3;
	}
	

}
