import java.util.Arrays;

public class Panagram {
	
	
	
	static void check(String s)
	{
		s=s.toLowerCase();
		
		char[] ip=s.toCharArray();
		
		int i, len=s.length();
		int[] cap=new int[26];
		Arrays.sort(ip);
		
		for(i=0;i<len;i++)
		{
			cap[(int)ip[i]-97]++;
		}
	}

	public static void main(String[] args) {
		check("The quick brown fox jumps over the lazy dog.");

	}

}
