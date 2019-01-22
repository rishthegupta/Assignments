import java.util.Scanner;
import java.util.Scanner;
public class Power5 {

	
	static void check(int num)
	{
		int i=0;
		
		if(num%10==5)
		{
			while(num>5)
			{
				i=num%5;
				//System.out.println("value of i in loop "+ i);
				num=num/5;
			}
		}
		else 
			i=1;
		
		//System.out.println("val of i "+ i);
		if(i==0)
		{
			System.out.println("power of 5");
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
