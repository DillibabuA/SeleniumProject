package javabase_programs;


import java.util.Scanner;
public class UniqueCharacters {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in); 
	     String str = "";

	     System.out.println("Enter a string: ");
	     str = sc.nextLine();

	    String uniqueString = uniqueCharacters(str); 
	    System.out.println(uniqueString+" ");
	}

	    public static  String uniqueCharacters(String teststr){
	      String temp = "";
	         for (int i = 0; i < teststr.length(); i++){
	            if (temp.indexOf(teststr.charAt(i)) == - 1){
	               temp = temp + teststr.charAt(i);
	         }
	      }
    	 
    	 
    	 return temp;
     
     
     }
	}


