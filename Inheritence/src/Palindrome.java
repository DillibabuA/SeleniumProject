import java.util.*;

public class Palindrome {
public void palinStr(String str) {
	String reverse = "";
	int length = str.length();
	for(int i = length - 1; i >=0; i--)
	//int i = 0;
	reverse = reverse + str.charAt(i);//here the error 
	if(str.equals(reverse))
		System.out.println("is palindrome");
	else
		System.out.println("not palindrome");
	
}
public static void main(String[] args) {
	String hello;
	Scanner gh = new Scanner(System.in);
	System.out.println("enter the string :");
	hello = gh.nextLine();
	Palindrome String=new Palindrome();
	String.palinStr(hello);
}
}
