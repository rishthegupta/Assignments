import java.util.Scanner;
public class Power2 {
	
	
	
	
	
	static void check(int num)
	{
		int[] binNum=new int[20];
		int i=0,f=0;
		while(num>0)
		{
			binNum[i]=num%2;
			num=num/2;
			i++;
		}
		
		for(i=0;i<20;i++)
		{
			if(binNum[i]==1)
				f++;
		}
		
		if(f==1)
		{
			System.out.println("power of 2");
		
		}
		else
			System.out.println("not");
			
		
	}

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter the Number to be check");
		
		int num=scan.nextInt();
		
		check(num);

	}

}
