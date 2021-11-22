
class Fruit {

	void eat(){System.out.println("fruit gives protiens...");}  
}  
class Mango extends Fruit{  
	void juice(){System.out.println("making the juice.s..");}  
}  
class SingleIn{  
	public static void main(String args[]){  
		Mango j=new Mango();  
		j.juice();  
		j.eat();  
	}}  


