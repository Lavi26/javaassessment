package com.stringassignment;

public class Split {
	public static void main(String args[]) {
        String string = "lavi,jain";
        String[] arrayOfString= string.split("," );
  
        for (String array :arrayOfString )
            System.out.println(array);
    }

}
