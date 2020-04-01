
public class VariableDemo { 
	int i=10;  //non static or instance variable
	//int i=20; duplicate variable
	static int j=20; //class variable

 public static void main(String args[]){ 
	 
  System.out.println(j); 
  j=30;
  System.out.println(j);
  int j=40;// local variable
  System.out.println(j);
  j=50;
  //int i=60;// local variable
  System.out.println(j);
 // System.out.println(i);
 }  
 
}  