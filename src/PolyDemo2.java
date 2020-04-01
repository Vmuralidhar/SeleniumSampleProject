
public class PolyDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PolyDemo2 p1= new PolyDemo2();
		p1.funA();
		p1.funA(10,20);//Here if we declare with int,long with different data types we get ambiguity
		p1.funA(10.0,20.05);
	}
	
	 void funA()
		{
			System.out.println("zero args funA"); 
		}
 void funA(int i,int j)
		{
			System.out.println("int int args funA"); 
		}
	 void funA(long i,long j)
		{
			System.out.println("long long args funA"); 
		}
	 void funA(float i,float j)
		{
			System.out.println("float float args funA"); 			
		}	 
	 void funA(double i,double j)
		{
			System.out.println("double double args funA"); 			
		}
	/*void funA(int i,long j)
		{
			System.out.println("int long args funA"); 			
		}./
	 /*void funA(long i,int j)
		{
			System.out.println("long int args funA"); 			
		}.*/
}
