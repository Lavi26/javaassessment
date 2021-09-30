package com.classassignments;

public class ShapeMain {
	
	public static void main(String args[]) {
		
		
		//FOR TWO DIMENTIONAL SHAPES
		
		
		//Creating object for triangle
		TwoDimensionalShape twoDimensionalShape=new Triangle1((float)9,(float)7);
		twoDimensionalShape.getArea();
				
		
		//Creating object for Square
		TwoDimensionalShape twoDimensionalShape1=new Square1((float)8);
		twoDimensionalShape1.getArea();
		

		//Creating object for circle
		TwoDimensionalShape twoDimensionalShape2=new Circle1((float)8);
		twoDimensionalShape2.getArea();
		
		
		
		//FOR THREE DIMENTIONAL SHAPES
		
		
		//Creating object for SphereArea
		ThreeDimensionalShape threeDimensionalShap3=new Sphere((float)8);
		threeDimensionalShap3.getArea();
		
		
		//Creating object for SphereVolume
		ThreeDimensionalShape threeDimensionalShapV=new Sphere((float)8);
		threeDimensionalShapV.getVolume();
		
		
		
		//Creating object for Cube Area
		ThreeDimensionalShape threeDimentionalShapC=new Cube((float)3);
		threeDimentionalShapC.getArea();
		
		
		
		//Creating object for  Cube volume
		ThreeDimensionalShape threeDimentionalShapCV=new Cube((float)3);
		threeDimentionalShapCV.getVolume();
		
		
		//Creating object for Cuboid Area
		ThreeDimensionalShape Cuboid1=new Cuboid((float)3,(float)5,(float)2);
		Cuboid1.getArea();
		
		//Creating object for  Cuboid volume
		ThreeDimensionalShape Cuboid2=new Cuboid((float)3,(float)5,(float)2);
		Cuboid2.getVolume();
   }
	


}
