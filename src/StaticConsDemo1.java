public class StaticConsDemo1 {
	int i=1;
	static int j=1;
	StaticConsDemo1()
	{	i++;
		j++;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(j);
		StaticConsDemo1 t1=new StaticConsDemo1();

		System.out.println(t1.i);
		System.out.println(t1.j);
		
		StaticConsDemo1 t2=new StaticConsDemo1();
		System.out.println(t2.i);
		System.out.println(t2.j);
		
		StaticConsDemo1 t3=new StaticConsDemo1();
		System.out.println(t3.i);
		System.out.println(t3.j);
		
		
	}

}
