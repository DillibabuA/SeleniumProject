import java.util.ArrayList;
public class CollectionArray {

	public static void main(String[] args) {
		ArrayList<String> cars = new ArrayList<String>();
	    cars.add("Volvo");
	    cars.add("BMW");
	    cars.add("Ford");
	    cars.add("Mazda");
	    for(String elements : cars){
	    System.out.println(elements);
	    }
	    System.out.println(cars);
	    ArrayList<Integer> vid = new ArrayList<Integer>();
	    vid.add(111);
	    vid.add(222);
	    vid.add(333);
	    vid.add(888);
	    System.out.println(vid.size());
	    for(int counter = vid.size()-1; counter >=0;counter--){
	    System.out.println(vid.get(counter));
	    }
	}

}
