import java.util.ArrayList;

public class Example {
/*public void ren(String[] a) {
	for(int i=0;i<a.length;i++) {
		System.out.println(a[i]);
	}
}
public static void main(String args[]) {
	String [] l=new String[3];
	l[0]="hello";
	l[1]="jigh";
	l[2]="hhh";
	Example gh=new Example();
	gh.ren(l);
}


}*/
	/*Example(ArrayList a){
	//public void ren(ArrayList a) {
		for(int i=0;i<a.size();i++) {
			System.out.println(a.get(i));
		}
	}
	public static void main(String[] args) {
		
		ArrayList<String> ab=new ArrayList<String>();
		ab.add("hello");
		ab.add("hkhj");
		Example gh=new Example(ab);
		//gh.ren(ab);
} 
	}*/
	
	/*Example(String a){
	//public void hi(String a) {
		System.out.println(a);
		
	}
	public static void main(String[] args) {
		Example gh=new Example("hekk");
		//gh.hi("hello");
	}
}x*/
	public void Bs(int[] a)
	{
		int sum=0;
		for(int i=0;i<a.length;i++) {
			sum=sum+a[i];
			}
			System.out.println(sum);
		}
	

public static void main(String[] args) {
	Example gh=new Example();
	int[] a= new int[2];
	a[0]=1;
	a[1]=2;
	gh.Bs(a);
	
	
}
}




