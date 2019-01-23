import java.util.Arrays;

public class Pangram {
	
	
	
	static void check(String str)
	{
		
		
		
		
		int i, len=str.length(),index=0;
		int[] flag=new int[26];
		for(i=0;i<str.length();i++)
		{
			
		
			if ('A' <= str.charAt(i) &&  str.charAt(i) <= 'Z') 
	                      
	            index = str.charAt(i) - 'A'; 
	
	        else if('a' <= str.charAt(i) && str.charAt(i) <= 'z') 
	                          
	            index = str.charAt(i) - 'a'; 
			flag[index]=1;
		}
		
		for(i=0;i<26;i++)
		{
			if(flag[i]==0)
				System.out.println("not Pangram");
				
		}
		System.out.println("Pangram");
	}

	public static void main(String[] args) {
		check("The quick brown fox jumps over the lazy dog.");

	}

}
