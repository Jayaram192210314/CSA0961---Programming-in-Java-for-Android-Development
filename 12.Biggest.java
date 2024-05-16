import java.util.*;
class king
{
public static void main(String S[])
{
	Scanner s = new Scanner(System.in);
	System.out.println("Enter the value of A and B:");
	int x = s.nextInt();
	int y = s.nextInt();
	if (x<y)    
        System.out.println(y + " is a Biggest Number.");
    	else
      	System.out.println(x + " is a Biggest Number.");
  }
}