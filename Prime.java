import java.util.Scanner;

public class Prime {
	
	
	
	static int check(int num)
	{
		
		int limit= (int)Math.sqrt(num);
		
			for(int i=2;i<=limit;i++)
			{
				if(num%i==0)
				{
					return 1;
				}					
			}
			return 0;
		
	}
		
	

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter the Number to be check");
		
		int num=scan.nextInt();
		if(check(num)==0)
			System.out.println("Prime");
		else 
			System.out.println("Not Prime");


	}

}
