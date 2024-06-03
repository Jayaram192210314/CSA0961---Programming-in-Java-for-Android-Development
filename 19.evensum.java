import java.util.*;
class king
{
	public static void main(String a[])
	{
	Scanner s = new Scanner(System.in);
	int i,n,sum = 0;
	System.out.println("Enter the number");
	n = s.nextInt();
	System.out.println("The series:");
	for(i=0;i<=n;i++)
	{
	System.out.println(i);
	   if(i%2==0)
		{
	     	sum = sum + i;
		}
	 }
	System.out.println("Sum of the Even Numbers in the series:"+sum);
	}
}