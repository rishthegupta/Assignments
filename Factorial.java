import java.util.Scanner;

public class Factorial {
	
	
	
	
	static int fact(int num)
	{
		if(num==1)
			return num;
		else return num*fact(num-1);
	}

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter the Number to be check");
		
		int num=scan.nextInt();
		
		
		int ans=fact(num);
		System.out.println(ans);

	}

}
