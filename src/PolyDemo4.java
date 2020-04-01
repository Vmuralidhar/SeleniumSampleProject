
public class PolyDemo4 {

	public static void main(String[] args) {

		PolyDemo4 p1= new PolyDemo4();
		
		System.out.println(p1.add(10,20));
		System.out.println(p1.add(10.0f,20.07f));
		System.out.println(p1.add(10.03,20.5));
	}
	int add(int a,int b)
		{
			System.out.println("int int args of add method");
			return a+b;		
		}
	 
	 float add(float a,float b)
		{
			System.out.println("float float args of add method");
			return a+b;
			
		}	 
	 double add(double a,double b)
		{
			System.out.println("double double args of add method");
			return a+b;
			
		}	 
	 long add(int a,long b)
		{
			System.out.println("long long add method"); 
			return a+b;
		}
	 long add(long a,int b)
		{
			System.out.println("long long add method"); 
			return a+b;
		}
	 
	 
	
}
