
import java.util.Arrays;


public class MedianFind {

	public static void main(String[] args) {
		
		int[] a= {1,9,3,4,6};
		int[] b= {5,2,7,8};
		int[] c=new int[a.length+b.length];
		
		int i, count=0;
		
		for(i=0;i<a.length;i++)
		{
			c[i]=a[i];
			count++;
		}
		//System.out.println(count);
		for(i=0;i<(b.length);i++)
		{
			c[count+i]=b[i];
		}
		
		Arrays.sort(c);
		/*for(i=0;i<c.length;i++)
			System.out.println(c[i]);*/
		System.out.println(c[(c.length/2)]);
		

	}

}
