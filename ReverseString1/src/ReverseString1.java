
public class ReverseString1 {

	public static void main(String[] args) {
		String str="rajurani";
		String rev="";
		int len=str.length();
	for(int i=len-1;i>-1;i=i-2)
	{
		rev=rev+str.charAt(i);
	}
		System.out.println("reverse string is:"+rev);
	}

}
