import java.util.*;
import java.util.HashSet;
public class CollectionHss {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<Integer> hs = new HashSet<Integer>(); 
		hs.add(20);  
		hs.add(6);  
		hs.add(20);  
		hs.add(8);  
		for(int elements : hs) {
			System.out.println(elements);  
		}

	}
}
