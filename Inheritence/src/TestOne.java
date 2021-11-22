class A{
	public void exam()
	{System.out.println("wt");
	}
}
class B extends A{
	public void write() {
		System.out.println("nn");
	}
}
class C extends A{
	public void seen() {
		System.out.println("jj");
	}
}
public class TestOne {

public static void main(String args[]) {
	C c=new C();
	c.seen();
	c.exam();
}
}
