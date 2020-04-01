package ioStream;

import java.util.Hashtable;

public class HashtableDemo {
	
	public static void main(String[] args) {
		
		Hashtable<String, String> h1= new Hashtable<String,String>();
		h1.put("Username", "mercury");
		h1.put("Password", "mercury");
		h1.put("Username1", "mercury123");
		h1.put("Password1", "mercury345");
		System.out.println(h1.get("Username"));
		System.out.println(h1.get("Password"));
		System.out.println(h1.get("Username1"));
		System.out.println(h1.get("Password1"));
	}


}
