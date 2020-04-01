
public class GenericsDemo1<T> {
	T t1;
	public static void main(String[] args) {

		GenericsDemo1 g1=new GenericsDemo1();
		g1.funA("selenium");
		g1.funA(10);
		g1.funA(true);
		g1.funA(new A());
	}
	void funA(T t1)
	{
		System.out.println(t1);
	}

}
