public class StringAssignmt {

	public static void main(String[] args) {
		String s1="This is selenium class";//literal string object
		String words[]=s1.split(" ");		
		for(int i=0;i<words.length;i++)
		{	
			if((i+1)%2==0)
			{	
				StringBuffer s2=new StringBuffer(words[i]);	
				System.out.print(s2.reverse()+" ");
			}
			else
			{
				System.out.print(words[i]+" ");
			}
								
		}
	
		}
	}

