import java.util.Scanner;

public class Grade {
	
	static void check(int marks)
	{
		if(marks<100)
		{
			if(marks>75)
			{
				System.out.println("Distenction");
			}
			else if(marks>60 && marks<74)
			{
				System.out.println("First Grade");
			}
			else if(marks>50 && marks<60)
			{
				System.out.println("Pass");
			}
			else 
			{
				System.out.println("Fail");
			}
		}
		else 
			System.out.println("INVALID MARKS");
	}
	
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter the Marks to be check");
		
		int num=scan.nextInt();
		check(num);
		
		scan.close();


	}

}
