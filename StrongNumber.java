import java.util.Scanner;

public class StrongNumber {
	
	
	

	static int fact(int num)
	{
		if(num==1)
			return num;
		else return num*fact(num-1);
	}
	
	static int checkStrong(int ip)
	{
		int sum=0,temp=ip;
		
		while(ip!=0)
		{
			sum=sum+fact(ip%10);
			ip=ip/10;
		}
		
		if(sum==temp)
			return 1;
		else return 0;
	}

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter the Number to be check");
		
		int ip=scan.nextInt();
		
		
		if(checkStrong(ip)==1)
			System.out.println("This is a Strong Number");
		else
			System.out.println("This is not");

	}

}
