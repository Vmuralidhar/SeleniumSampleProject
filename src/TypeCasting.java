
public class TypeCasting {

	public static void main(String[] args) {
		float f=10.5f;  
		//int a=f;//Compile time error  
		int a=(int)f; 
		//float f2=10.0;
		//float f2=(float)10.0;//this is also correct
		float f2=10.0f;
		System.out.println(f2);
		System.out.println(f);  
		System.out.println(a);

	}

}
