import java.util.Scanner;

public class WaysToAdd {

	
	
	static void count(int num)
	{
		
		int i,sum=1;
		for(i=num-1;i>0;i--)
		{
			sum=sum+(num-i);
		}
		
		
		System.out.println("number of ways are " + sum);
	}
	
	
	
	
	
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter the Number to be check");
		
		int num=scan.nextInt();
		
		count(num);

	}

}
