
abstract class AbBike{  
	AbBike(){System.out.println("bike is created");}  
	abstract void run();  
	void changeGear(){System.out.println(" It is gear bike");}  
}  

class Honda extends AbBike{  
	void run(){System.out.println("running safely..");}  
}  

class Abstract{  
	public static void main(String args[]){  
		AbBike zmr = new Honda();  
		zmr.run();  
		zmr.changeGear(); 
	}  
}  

