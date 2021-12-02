import java.util.Scanner;

public class IntegertoString {
	public void hand(int a ,int b){
		 String s1 = Integer.toString(a);
         String s2 = Integer.toString(b);
		System.out.println("String s1 = " + s1);
		System.out.println("String s2 = " + s2); 
	}
	public static void main(String[] args) {
		//int x = 123;
               // int y = 456;
              //  String s1 = Integer.toString(x);
               // String s2 = Integer.toString(y);
                Scanner sc = new Scanner(System.in);
                System.out.println("enter x value:");
                int x=sc.nextInt();
                System.out.println("enter y value:");
                int y=sc.nextInt();
                
		IntegertoString hs = new IntegertoString();
		hs.hand(x,y);
		//hs.hand(123,456);
	}	
}
