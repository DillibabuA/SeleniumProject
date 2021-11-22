package coreJava;

public class exceptionDemo {



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int b=7;
		int c=0;
		try
		{
		//int k=b/c; for show of the arthimetic we need to enable
		//public void getData() {
			int arr[]=new int[5];
			System.out.println(arr[7]);
		}
		catch(ArithmeticException et) {
			System.out.println("i catch the arthimetic exvception");
		}
		catch(IndexOutOfBoundsException et) {
			System.out.println("i catch the index out of exvception");
		}
		
		catch(Exception e) {
			System.out.println("catch exception");
		}
finally {
	System.out.println("delete cookies");
}
	}

}
