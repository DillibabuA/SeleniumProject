import java.util.*;
public class TestJavaCollection 
{

	public static void main(String[] args)
	{
		
		ArrayList<String> list=new ArrayList<String>();
		list.add("one");
		list.add("Teo");  
		list.add("jan");  
		list.add("123");  
		list.remove("jan");
		Iterator itr=list.iterator();  
		while(itr.hasNext()){  
		System.out.println(itr.next());  
	}

  }
}
