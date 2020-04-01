
public class ConsDemo2 {

	ConsDemo2()
	{
		System.out.println("Cons Demo2");
	}
	int i=10;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConsDemo2 c1=new ConsDemo2();
		new ConsDemo2();
		new ConsDemo2();
		System.out.println(c1.i);
	}

}
