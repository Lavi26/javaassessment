package com.classassignments;

public abstract class ThreeDimensionalShape extends ShapeHeierarchy {

	ThreeDimensionalShape(float dimension1) {
		super(dimension1);
	}
	ThreeDimensionalShape(float length,float width,float height) {
		super(length,width,height);
	}
	abstract void getArea();
	abstract void getVolume();
	
}

//Class for Sphere
class Sphere extends ThreeDimensionalShape{
	Sphere(float radius){
		super(radius);
	}
	void getArea() {
		float areaofsphere=(4*((float)Math.PI)*getDimension1()*getDimension1());
		System.out.println("Area of sphare : "+areaofsphere);
	}
	void getVolume() {
		float sphereVolume=(((float)4.0/(float)3.0)*((float)Math.PI)*getDimension1()*getDimension1()*getDimension1());
		System.out.println("Volume of sphare : "+sphereVolume);
	}
}

// Class for cube
class Cube extends ThreeDimensionalShape{
	Cube(float side){
		super(side);
	}
	void getArea() {
		float areaofcube=(6*getDimension1()*getDimension1());
		System.out.println("Area of cube : "+areaofcube);
	}
	void getVolume() {
		float cubeVolume=(getDimension1()*getDimension1()*getDimension1());
		System.out.println("Volume of cube : "+cubeVolume);
	}
}

//Class for Cuboid
class Cuboid extends ThreeDimensionalShape{
	float length;
	float width;
	float height;
	Cuboid(float length,float width,float height){
		super(length,width,height);
	}
	void getArea() {
		
		this.length=getDimension1();
		this.width=getDimension2();
		this.height=getDimension3();
		float areaofcuboid=(2*((length*width)+(width*height)+(length*height)));
		System.out.println("Area of cuboid : "+areaofcuboid);
	}
	void getVolume() {
		float cuboidVolume=(getDimension1()*getDimension2()*getDimension3());
		System.out.println("Volume of cuboid : "+cuboidVolume);
	}
}
