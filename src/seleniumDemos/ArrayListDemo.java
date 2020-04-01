package seleniumDemos;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo {

	public static void main(String[] args) {
		
		//ArrayList a1= new ArrayList();
		List a1= new ArrayList();
	
		a1.add(10);
		a1.add(true);
		a1.add("selenium");
		
		

		
		System.out.println(a1.get(1));
		System.out.println(a1.get(2));
		System.out.println(a1.size());
		
		
		

		List<String> a2= new ArrayList<String>();
		a2.add("selenium1");
		a2.add("selenium2");
		a2.add("selenium3");
		
		//System.out.println(a2.get(1));
		//System.out.println(a2.get(2));
		
		 // Loop to print one by one
	    for (int j = 0; j < a1.size(); j++) {
	        System.out.println(a2.get(j));
	    }

	    Iterator itr=a2.iterator();  
	    while(itr.hasNext()){  
	     System.out.println(itr.next());  
	    }  
		List<Integer> a3= new ArrayList<Integer>();
		a3.add(10);
		a3.add(100);
		a3.add(200);
		//a3.remove(0);
		System.out.println(a3.get(1));
		System.out.println(a3.get(2));
		

	}

}
