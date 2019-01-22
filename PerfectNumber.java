class PerfectNumber

 

{        public static void main(String args[])

          {

                   int i,sum=1;                  

                   System.out.print("Perfect nos from 1 to 100 are 1,");

                   for(int j=2;j<=100;j++)

                   {

                	   sum=1;

                       for(i=2;i<j;i++)

                       {     if(j%i==0)

                             sum=sum+i;

                       }

                   if(j==sum)

                             System.out.print(j+",");

                   }

          }

}