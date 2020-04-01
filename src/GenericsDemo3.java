public class GenericsDemo3<S,I> {
	S s1;
	I i1;
	public static void main(String[] args) {

		GenericsDemo3<String,Integer> g1=new GenericsDemo3<String,Integer>();		
		int sum=g1.funA("4000",1000);//restricting to string and integer
		System.out.println("Sum of converted string and int data types is :" +sum);
		

	}

	int funA(S s1,I i1)
	{
		System.out.println(s1);
		System.out.println(i1);
		
		int s2=Integer.valueOf((String) s1);
		int i2=((Integer) i1).intValue();
		return s2+i2;
	}

}

