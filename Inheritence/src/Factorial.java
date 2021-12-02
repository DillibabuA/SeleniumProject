
public class Factorial {
	public void sure() {
		 //It is the number to calculate factorial   
		int fact=1;  
		  int number=5;
		  for(int i=1;i<=number;i++){    
		      fact=fact*i;  
		  }
		      System.out.println("Factorial of "+number+" is: "+fact);   
		  }    
	
	public static void main(String args[]){ 
		//int i,fact=1;  
		  //int number=5;
	Factorial hs=new Factorial();
	hs.sure();
		//  System.out.println("Factorial of "+number+" is: "+fact);    
		 }  
}
