package coreJava;

public class constructDemo {
public constructDemo(){
	System.out.println("the word");
}
public constructDemo(int a,int b){
	System.out.println("values are ");
	int c=a+b;
	System.out.println(c);
}
public constructDemo(String str){
	System.out.println(str);
	}

public void getdata() {
	System.out.println("jiijklkj");
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 constructDemo h= new constructDemo();
		 constructDemo dh= new constructDemo(4,5);
		 constructDemo ndh= new constructDemo("hello");
		 h.getdata();

	}

}
