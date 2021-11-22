package coreJava;

import java.util.ArrayList;

public class arrayListexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList<String> gh=new ArrayList<String>();
gh.add("rahul");
gh.add("jhavsbhjkl");
System.out.println(gh);
gh.add(0, "hjkj");
System.out.println(gh.get(1))
;
System.out.println(gh);
System.out.println(gh.contains("rahul"));
System.out.println(gh.indexOf("rahul"));
System.out.println(gh.isEmpty());
System.out.println(gh.size());
	}

}
