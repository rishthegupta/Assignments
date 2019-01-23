import java.util.Scanner;

public class RemoveRepeated {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
String s1=sc.nextLine();
String s2="";
String s3[]=s1.split(" ");
for(int i=0;i<s3.length;i++)
{
	int f=0;
	String p[]=s2.split(" ");
	for(int j=0;j<p.length;j++)
	{
		if(p[j].equals(s3[i]))
			{
			f=1;
			}
	}
	if(f==1)
	{
		continue;
	}
	s2=s2+s3[i]+" ";
	sc.close();
}
System.out.println(s2);
	}
	
	

}
