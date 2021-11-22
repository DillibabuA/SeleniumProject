import java.util.Set;
import java.util.TreeSet;

public class CollectionTs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Set<Integer> ts = new TreeSet<Integer>();
     ts.add(111);
     ts.add(22);
     ts.add(1);
     ts.add(333);
     ts.add(99);
     for(int elements:ts) 
    
     {
    	System.out.println(elements);
     }
     
     
     ts.remove(99);
     System.out.println(ts);
	}

}