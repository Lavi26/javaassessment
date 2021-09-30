package com.constructorpackage;

public class Area {
	
 //Zero arguments constructor
    Area() {
        int length = 9;
        int breadth = 8;
 
        int areaofreactangle = length * breadth;
 
        System.out.println("area" + areaofreactangle);
    }
 
    
    //parameterized
    Area(int side) {
        
        int areaofsquare = side * side;
 
        System.out.println("area" + areaofsquare);
    }
 
    
    //overloading constructor
    Area(int length, int breadth, int height) {
 
        int areaofvolume = length * breadth * height;
 
        System.out.println("area" + areaofvolume);
    }
 
    public static void main(String ar[]) {
 
        Area area = new Area();
        Area areaofsquare = new Area(5);
        Area areaofvolume = new Area(5,5,5);

    }
 
}