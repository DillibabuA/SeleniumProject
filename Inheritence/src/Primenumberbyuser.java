import java.util.Scanner;

public class Primenumberbyuser {
	public void prime(int num){
		// int num =0;
		for (int i = 1; i <= num; i++)  	   
	      { 		 		  
	         int counter=0; 		  
	         for(num =i; num>=1; num--)
	         {
		    if(i%num==0)
		    {
			counter = counter + 1;
		    }
		 }
		 if (counter ==2)
		 {
		    num = num + i ;
		 }	
	      }	
	      System.out.println("Prime numbers from 1 to n are :"+ num);
	     // System.out.println(num);
	   }
	
	public static void main (String[] args){		
	      Scanner scanner = new Scanner(System.in);
	     // int i =0;
	      int num =0;
	      
	      String  primeNumbers = "";
	      System.out.println("Enter the value of n :");
	      int n = scanner.nextInt();
	      scanner.close();
	      Primenumberbyuser pr = new Primenumberbyuser();
	      pr.prime(n);
	      
}
}
