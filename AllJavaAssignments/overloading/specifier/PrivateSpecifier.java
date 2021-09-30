package com.specifier;


class Data {
    private String name;

    // getter method
    public String getName() {
        return this.name;
    }
    // setter method
    public void setName(String name) {
        this.name = name;
    }
}
public class PrivateSpecifier {
	
    public static void main(String[] main){
        Data data = new Data();

        // access the private variable using the getter and setter
        data.setName("Lavi");
        System.out.println(data.getName());
    }
}