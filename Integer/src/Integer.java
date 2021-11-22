import java.util.*;
public class Integer {

	public static void main(String[] args) {
		
            Scanner sc=new Scanner(System.in);
            int arr[]=new int[4];
            System.out.println("enter integers in array:");
            for(int i = 0;i<arr.length;i++) {
            	arr[i] = sc.nextInt();}
            System.out.println("The integers are in array:");
            for(int i = 0;i<arr.length;i++)
            	System.out.println(arr[i]);
            }
	}


