import java.util.HashMap;
import java.util.Map.Entry;
public class CollectionHm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 HashMap<Integer,String> map = new HashMap<Integer,String>();
		 
	       
	        map.put(10, "viki");
	        map.put(30, "kumar");
	        map.put(10, "hi");
	        map.put(78,"hi");
	       System.out.println("Size of map is:- " + map.size());
	        for(Entry<Integer, String>  pairEntry: map.entrySet()) {
				System.out.println(pairEntry.getKey() + " : " + pairEntry.getValue());
			}
	        	
	        
	        System.out.println(map);
	        if (map.containsKey("jill")) {
	 
	            // Mapping
	            String a = map.get("jill");
	            System.out.println("value for key"  + " \"jill\" is:- " + a);
	                              
	}

}
}
