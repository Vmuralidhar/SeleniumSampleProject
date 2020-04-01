
public class StringBufferDemo2 {

	public static void main(String[] args) {
		
		//StringBuffer s1="selenium";
		StringBuffer s1=new StringBuffer("selenium");

		System.out.println(s1);
		StringBuffer s2=new StringBuffer("class");
		System.out.println(s2);
		//System.out.println(s1+s2);//error
		System.out.println(""+s1+s2);
		
	}

}
