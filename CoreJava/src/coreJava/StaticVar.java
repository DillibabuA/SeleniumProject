package coreJava;

public class StaticVar {
	//instance variables
String name;
String address;
static String  city="bangalore";
static int i;
static {
	city="bangaloure";
	i=0;
	
}
//below local variables in constructor
StaticVar(String name,String address)
{
	this.name=name;
	this.address=address;
	i++;
	System.out.println(i);
}
public void getAddress() {
	System.out.println(address+" "+city);
}
public static void getcCity() {
	System.out.println(city);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticVar gh= new StaticVar("giri","rajmahal");
		StaticVar rr= new StaticVar("suresh","sv nagar");
		gh.getAddress();
		rr.getAddress();
		StaticVar.getcCity();
		StaticVar.i=4;
		gh.
		address="fgfdf";	
		}

}
