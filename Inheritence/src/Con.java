
public class Con{
	int productionNumber;
	  String fruitName;

	  public Con(int year, String name) {
		  productionNumber = year;
		  fruitName= name;
	  }
	public static void main(String[] args) {
		Con myFruit = new Con(1001, "Mango");
	    System.out.println(myFruit.productionNumber+ " " + myFruit. fruitName);
	  }
	}


