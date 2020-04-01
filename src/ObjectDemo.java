public class ObjectDemo { 
	int i=10;  //non static or instance variable
	int j=20;
	//int i=20; duplicate variable
	static int k=30; //class variable

	 public static void main(String args[]){ 
		 
	  System.out.println(k);
	  //Object creation
	  ObjectDemo d1= new ObjectDemo();		  
	 // System.out.println(i);
	System.out.println(d1);
	  System.out.println(d1.i);
	  System.out.println(d1.j);
	 }  
 
}  
