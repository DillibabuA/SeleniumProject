import java.util.ArrayList;
public class Test {
Test(int val[]){
	for(int elem:val) {
		System.out.println(elem);
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {22,33,44,4,5};
		Test h = new Test(a);
		System.out.println("hello");
	}

}
/* class Test{
	 static void sur(int a) {
		System.out.println(a);
	}
	static void sur() {
		System.out.println("huihkj");
	}
	public static int hi() {
		return 0;
	}

public static void main(String[] args) {
	sur();
	sur(8);
	hi();
	
}
}*/