
public class MethodDemo7 {

	public static void main(String[] args) {

		MethodDemo7 m1= new MethodDemo7();
	}
	
	int funA()
	{
		 System.out.println("funA method");
		 return 10;	
		//System.out.println("funA method");//this statement wont execute as return is final statement
	}
	void fubB()
	{
		System.out.println("funB method");
		return;//no value should be used
		//System.out.println("funA method"); un reachable code
	}
	

}
