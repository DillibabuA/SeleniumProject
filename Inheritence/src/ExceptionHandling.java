
public class ExceptionHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
try {
	int n = 100/0;
	
}
catch(ArithmeticException e) {
	System.out.println(e);
}
System.out.println("it can not be divisable by zero");
	}

}
