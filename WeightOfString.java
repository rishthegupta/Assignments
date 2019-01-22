
public class WeightOfString {
	
	
	
	
	static void weight(String s)
	{
		char[] ip= s.toCharArray();
		
		int sum=0;
		int len=ip.length;
		
		int[] ipNum =new int[len];
		
		
		for(int i=0;i<len;i++)
		{
			if((int)ip[i]>96 && (int)ip[i]<123)
				ipNum[i]=(int)ip[i]-96;
			else
				if((int)ip[i]>63 && (int)ip[i]<91)
				ipNum[i]=(int)ip[i]-64;
			
		}
		
		for(int i=0;i<len;i++)
		{
			
			sum=sum+ipNum[i];
		}
		
		
		System.out.println("Weight would be "+ sum  );
		
		
	}

	public static void main(String[] args) {
		
		weight("Apple");

	}

}
