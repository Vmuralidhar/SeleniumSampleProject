
public class GenericsDemo2<T> {
	T t1;
	public static void main(String[] args) {

		GenericsDemo2<String> g1=new GenericsDemo2<String>();
		g1.funA("selenium");//restricting to string
		//g1.funA(10);//it cant take int
	}

	void funA(T t1)
	{
		System.out.println(t1);
	}

}

