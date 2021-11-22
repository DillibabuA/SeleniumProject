package coreJava;

import java.util.HashMap;
import java.util.Iterator;

public class hashMapexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
HashMap<Integer,String> gh=new HashMap<Integer,String>();
gh.put(0, "hello");
gh.put(1, "raju");
gh.put(0, "kjjk");
gh.put(0, "ho");
System.out.println(gh.get(1));
//Set gh=new entrySet();
Iterator<Integer> it=gh.iterator<Integer>();
while(it.hasNext()) {
	System.out.println(it.hasNext());
	
}
	}

}
