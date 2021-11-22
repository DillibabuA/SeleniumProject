import java.util.Scanner;
import java.util.Arrays;

public class TwoArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Scanner sc = new Scanner(System.in);
   System.out.println("enter the no of elements in fisrt array:");
   int array1size = sc.nextInt();
   System.out.println("enter the no of elements in second array:");
   int array2size = sc.nextInt();
   if(array1size != array2size){
	   System.out.println("both arraymust have"+"same number of ele");
	   return;
	   
   }
   int array1[] = new int[array1size];
   int array2[] = new int[array1size];
   int array3[] = new int[array1size];
   System.out.println("enter first array ele");
   for (int i=0; i<array1.length;i++) {
	   array1[i] = sc.nextInt();
   }
   System.out.println("enter second array ele");
   for (int i=0; i<array2.length;i++) {
	   array2[i] = sc.nextInt();
	}
 for(int i=0;i<array3.length;i++) {
	 array3[i] = array1[i] + array2[i];
}
 System.out.println("result of array"+ Arrays.toString(array3));
	}
}
