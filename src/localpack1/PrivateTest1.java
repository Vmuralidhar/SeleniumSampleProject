package localpack1;

public class PrivateTest1 {
	
	public static void main(String[] args) 
	{
		
		PrivateDemo1 p1=new PrivateDemo1();
		//p1.funA(); private method
		//System.out.println(p1.i);//private variable
		p1.funB();//indirectly accessing the private funA method through funB
		
		//PrivateDemo2 p2=new PrivateDemo2();//PrivateDemo2 is private constructor
		PrivateDemo2.funA();
		
	}
	
}
