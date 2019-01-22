import java.util.Arrays;
public class Anagram {

	
	static void check(String s1, String s2)
	{
		char[] cs1=s1.toCharArray();
		char[] cs2=s2.toCharArray();
		
		Arrays.sort(cs1);
		Arrays.sort(cs2);
		
		int f=0;
		if(cs1.length==cs2.length)
		{
			for(int i=0; i<cs1.length;i++)
			{
				if(cs1[i]!=cs2[i])
				{
					System.out.println("Not Anagram");
				}
				else 
					f++;
			}
			
		if(f==cs1.length)
			System.out.println("Anagram");
			
			
		}
		else 
			System.out.println("Not Anagram");
		
	}
	
	
	
	
	public static void main(String[] args) {
		check("dog","gid");

	}

}
