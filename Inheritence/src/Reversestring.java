import java.util.*; 
public class Reversestring {
	// Function to reverse a string in Java using StringBuilder
	public String rev(String s){
	return new StringBuilder(s).reverse().toString();
	}
	public static void main(String[] args){
		
	String s= "Welcome to world"; // Note that string is immutable in Java
	Reversestring hs = new Reversestring();
	s=hs.rev(s);
	//s= rev(s);
	System.out.println("Result after reversing a string is : "+s);
	}
}
