import java.util.Scanner;

public class Stringtointeger {
	
	public  void hand(String e) {
		
	
        System.out.println( Integer.parseInt( e ));
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Stringtointeger hs = new Stringtointeger();
		System.out.println("enter string:");
		String str=sc.nextLine();
		hs.hand(str);
		
	}	
}
