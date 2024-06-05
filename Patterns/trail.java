import java.util.*;
class king {
public static void main(String arg[])
{
	int i,n,j=0;
	Scanner s = new Scanner(System.in);
	System.out.println("Enter the number of elements in Array:");
	n = s.nextInt();
	int a[] = new int[n];
	int temp[] = new int[n];

	for(i=0;i<n;i++){
	System.out.print("Enter element" +i+":"); 
	a[i]=s.nextInt();
	}
	
	for(i=0;i<n-1;i++){
		if(a[i]!=a[i+1]){
			temp[j++] = a[i];
		}
	}
	temp[j++] = a[n - 1];

	for (i=0;i<j;i++) {
	a[i] = temp[i];
	}
	
	for (i = 0; i < j; i++){
	System.out.print(a[i] + " ");
	}
    }
}
