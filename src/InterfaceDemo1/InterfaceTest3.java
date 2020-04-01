package InterfaceDemo1;

class InterfaceTest3 implements Printable, Showable{  
public void print(){System.out.println("Hello");} 
//public int print(){
//System.out.println("Hello");
//return 10;
//}

public static void main(String args[]){  
	InterfaceTest3 obj = new InterfaceTest3();  
	obj.print();  
 }  
}