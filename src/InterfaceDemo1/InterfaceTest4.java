package InterfaceDemo1;

class InterfaceTest4 implements Showable{  
public void print(){System.out.println("Hello Print");}  
public void show(){System.out.println("Welcome Show");}  
  
public static void main(String args[]){  
	InterfaceTest4 obj = new InterfaceTest4();  
	obj.print();  
	obj.show();  
 }  
}  