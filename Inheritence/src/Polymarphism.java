
class PolyBank {

	float getRateOfInterest(){return 0;}  
}  
class SBI extends PolyBank{  
	float getRateOfInterest(){return 8.4f;}  
}  
class ICICI extends PolyBank{  
	float getRateOfInterest(){return 7.3f;}  
}  
class AXIS extends PolyBank{  
	float getRateOfInterest(){return 9.7f;}  
}  
class Polymarphism{  
	public static void main(String args[]){  
		PolyBank b;  
		b=new SBI();  
		System.out.println("SBI Rate of Interest: "+b.getRateOfInterest());  
		b=new ICICI();  
		System.out.println("ICICI Rate of Interest: "+b.getRateOfInterest());  
		b=new AXIS();  
		System.out.println("AXIS Rate of Interest: "+b.getRateOfInterest());  
	}  
}  

