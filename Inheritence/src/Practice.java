import java.util.HashMap;
import java.util.Map.Entry;

public class Practice {
Practice(HashMap giri){
	for(Entry<Integer, String>  pairEntry: giri) {
		System.out.println(pairEntry.getKey() + " : " + pairEntry.getValue());
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 HashMap<Integer,String> map = new HashMap<Integer,String>();
		 
	       
	        map.put(10, "viki");
	        map.put(30, "kumar");
	        map.put(10, "hi");
Practice m=new Practice(map);	
	}
}
