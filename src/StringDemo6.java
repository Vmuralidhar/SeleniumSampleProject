
public class StringDemo6 {

	public static void main(String[] args) {

		String s1="abc";//literal string object
		String s2=s1+"def";
		String s3="abcdef";
		System.out.println(s1);
		System.out.println(s2);
		if (s1==s3)
		{
			System.out.println("s1 and s3 are same");
		}else
		{
			System.out.println("s1 and s3 are not same");
		}
	}

}
