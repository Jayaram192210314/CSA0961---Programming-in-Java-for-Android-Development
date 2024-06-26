import java.util.*;
class king{
public static void main(String arg[]){
	int i,n,j;
	Scanner s = new Scanner(System.in);
	n = s.nextInt();
	for(i=1;i<=n;i++){
		for(j=1;j<=n-i;j++){
			System.out.print(" ");
			}
		for(j=1;j<=i;j++){
			System.out.print(i+" ");
		}
		System.out.println();
	}
	for(i=n-1;i>=1;i--){
		for(j=1;j<=n-i;j++){
			System.out.print(" ");
			}
		for(j=1;j<=i;j++){
			System.out.print(i+" ");
		}
		System.out.println();
	}
}}