
public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("hello world");
	}//nkbbbkbk

}
import java.util.HashMap;
public class CollectionHm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 HashMap<String, Integer> map = new HashMap<>();
		 
	       
	        map.put("king", 10);
	        map.put("suresh", 30);
	        map.put("vk", 20);
	        map.put("jill",100);
	       System.out.println("Size of map is:- " + map.size());
	        //for(Map.Entry  pairEntry: map.entrySet()) {
				//System.out.println(pairEntry.getKey() + " : " + pairEntry.getValue());
			//}
	        	
	        
	        System.out.println(map);
	        if (map.containsKey("jill")) {
	 
	            // Mapping
	            Integer a = map.get("jill");
	            System.out.println("value for key"  + " \"jill\" is:- " + a);
	                              
	}

}
}
//linkedlist
import java.util.LinkedHashSet;
public class CollectionLs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashSet<String> ls = 
                new LinkedHashSet<String>();  

// Adding element to LinkedHashSet  
ls.add("java");  
ls.add("is");  
ls.add("good");  
ls.add("not");
ls.add("java"); 
ls.add("platform");  

System.out.println("Size of LinkedHashSet = " + ls.size());
                       
System.out.println("Original LinkedHashSet:" + ls);  
System.out.println("Removing not from LinkedHashSet: " + ls.remove("not"));
System.out.println("Trying to Remove laptop which is not "+ "present: " + ls.remove("laptop"));
System.out.println("Checking if java is present=" + ls.contains("java"));    
System.out.println("Updated LinkedHashSet: " + ls);  
	}

}
