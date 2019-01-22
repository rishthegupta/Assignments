import java.util.Scanner;
public class Fibonacci {

	public static void main(String[] args) {
		
		Scanner scan= new Scanner(System.in);
		
		System.out.println("Enter the limit of series");
		int limit=scan.nextInt();
		int i;
		int[] fib= new int[limit];
		
		fib[0]=0;
		fib[1]=1;
		for(i=2;i<limit;i++)
		{
			fib[i]=fib[i-1]+fib[i-2];
		}
		
		
		for(i=0;i<limit;i++)
		{
			System.out.print(fib[i]+" ");
		}

	}

}
