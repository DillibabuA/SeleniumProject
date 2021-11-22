package coreJava;

public class childDemo extends parentDemo {
String name ="hi wru";
//constructor
public childDemo() {
	super();
	System.out.println(" child constructor");
}
public void getStringdata()
{
	System.out.println(name);
	System.out.println(super.name);
}
public void getData() 
{
	super.getData();
	System.out.println("i am from the  child class");
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
childDemo cd = new childDemo();
cd.getStringdata();
cd.getData();
	}

}
