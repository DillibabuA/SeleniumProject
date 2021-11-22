
class HiAnimalOne {

	 static void eat(){System.out.println("eating...");}  
}  
class cow extends HiAnimalOne{  
	void graz(){System.out.println("grazing...");}  
}  
class Cat extends HiAnimalOne{  
	void meow(){System.out.println("meowing...");}  
}  
class HiAnimal{  
	public static void main(String args[]){  
		Cat c=new Cat();  
		c.meow();  
		c.eat();  
	}}  
