package basic.pack;
import java.util.Scanner;
public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the number");
    int num=sc.nextInt();
    boolean flag=true;
    for(int i=2;i<=num-1;i++)
    {
    	if(num%i==0)
    	{
    		flag=false;
    		break;
    		
    	}
    }
    if (flag)
    	System.out.println(num+"number is prime number");
    else
    	System.out.println(num+"number is not  prime number");
    }

}
