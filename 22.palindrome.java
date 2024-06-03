import java.util.*;
class king
{
	public static void main(String a[])
{
	Scanner s = new Scanner(System.in);
	int rev=0,i,n,c;
	System.out.println("Enter the Number:");
	n = s.nextInt();
	c=n;
	while(n!=0)
	{
		i = n%10;
		rev = rev*10 + i;
		n = n/10;
	}
	if(c==rev)
	System.out.println("It is a Palindrome Number");
	else
	System.out.println("It is NOT a Palindrome Number");
}
}