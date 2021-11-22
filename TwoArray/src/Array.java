
public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[]a= {1,2,3};
int[]b= {13,13,13};
int c[]=new int[a.length];
for(int i=0;i<=a.length-1;i++)
{
	c[i]=a[i]+b[i];
	
}
System.out.println("the sum of two arrays is ");
for(int j=0;j<=a.length-1;j++) 
{
	System.out.println(c[j]);
}
	}

}
