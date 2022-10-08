import java.util.Scanner;

public class SquareRecursiveTailCall{
	public static void main(String ... args){
		Scanner sc = new Scanner(System.in);
		int num, sum=0; 
	
		do{
			System.out.print("Enter a positive integer: ");
			num = sc.nextInt();
		}while(num<0);
		
		int f = square(num,1);
		
		for(int ctr=1; ctr<=num; ctr++){
			System.out.print(square(ctr,1)+" ");
			sum += square(ctr,1);
			}
		
		System.out.println("\nSum: " + sum);
		
		//System.out.println("The factorial of " + num + " is " + f);	
		
	}
		
	private static int square(int n, int a){
		
		if(n==1)
			return a;
		else
			return square((n-1), (a + n*n));
		
		//return (n==0)?a: square(a*n));
	}
}
/*

*/