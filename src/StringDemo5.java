
public class StringDemo5 {

	public static void main(String[] args) {

		String s1=" 40mm,00 ";
		String s2=s1.trim();
		
		System.out.println(s1);
		System.out.println(s2);
		
		s1=s1.trim();
		
		if(s1==s2)
		{
			System.out.println("same");	
		}else
			
		{
			System.out.println("not same");
		}
		
		if(s1==s1.trim())
		{
			System.out.println("same");	
		}else
			
		{
			System.out.println("not same");
		}

	}

}
