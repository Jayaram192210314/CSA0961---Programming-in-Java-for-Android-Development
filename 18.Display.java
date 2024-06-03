import java.util.*;
class king
{
	public static void main(String ar[])
{
	Scanner s = new Scanner(System.in);
	int i,n,sum=0;
	i = 0;
	System.out.println("Enter the n value:");
	n = s.nextInt();
	for(i=0;i<=n;i++)
		System.out.println(i);
	for(i=0;i<=n;i++)
	{
	sum = sum + i;
	}
	System.out.println("Sum of Series:"+sum); 
}
}