
class MulAnimalOne {


	void eat(){System.out.println("eating...");}  
}  
class Dog extends MulAnimalOne{  
	void bark(){System.out.println("barking...");}  
}  
class BabyDog extends Dog{  
	void weep(){System.out.println("weeping...");}  
}  
class MulAnimal{  
	public static void main(String args[]){  
		BabyDog d=new BabyDog();  
		d.weep();  
		d.bark();  
		d.eat();  
	}}  

