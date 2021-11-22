
public class ExceptionThrows {
	  public void checkAge(int age){
	      if(age<18)
	         throw new ArithmeticException("Not Eligible for voting");
	      else
	         System.out.println("Eligible for voting");
	   }

	public static void main(String[] args) {
		 ExceptionThrows  age = new  ExceptionThrows ();
	      age.checkAge(14);
	      System.out.println("success the Exception handling");
	}

}
