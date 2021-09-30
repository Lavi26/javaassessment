package com.specifier;


class  Language{
   // public variable
   public String type;

   // public method
   public void display() {
       System.out.println("this is " + type + " language");
   }
}

//Main.java
public class PublicSpecifier {
   public static void main( String[] args ) {
  
	   Language lang = new Language();

       
	// accessing the public variable
      lang.type = "java";
    //   // accessing the public method
      lang.display();
   }
}