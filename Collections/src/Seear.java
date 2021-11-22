import java.util.ArrayList;
public class Seear {          //take string
/*public void Test(int[] arr) {//
	for(int i=0;i<arr.length;i++) {
	System.out.println(arr[i]);
}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] arr = new int[5];
arr[0]=1;
arr[1]=2;
Seear gh=new Seear();
gh.Test(arr);
//
	//Seear gh=new Seear();
	//gh.Test("hello");
}
	
	}

	public void Test(String[] arr) {//
		for(int i=0;i<arr.length;i++) {
		System.out.println(arr[i]);
	}
	}
		public static void main(String[] args) {
			// TODO Auto-generated method stub
	String[] arr = new String[5];
	arr[0]="hello";
	arr[1]="thill";
	Seear gh=new Seear();
	gh.Test(arr);
	//
		
	}
		
		}

*/
	//constr
 Seear(ArrayList arr) {
	for(int i=0;i<arr.size();i++) {
	System.out.println(arr.get(i));
}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList<Integer> arr = new ArrayList<Integer>();
arr.add(1);
arr.add(2);
Seear gh=new Seear(arr);
//gh.Test(arr);

}
	
	}