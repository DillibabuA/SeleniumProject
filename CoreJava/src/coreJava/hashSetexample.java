package coreJava;

import java.util.HashSet;
import java.util.Iterator;

public class hashSetexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> hs=new HashSet<String>();
		hs.add("hhhjhk");
		hs.add("giri");
		hs.add("giri");
		hs.add("house");

		hs.add("he");
		hs.add("she");

		//System.out.println(hs.remove("giri"))
		//;
		System.out.println(hs.isEmpty());

		;
		System.out.println(hs.size()
				);
		Iterator<String> i=hs.iterator();
		while(i.hasNext());
		System.out.println(i.next(
				));
	}

}
