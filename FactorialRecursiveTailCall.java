import java.util.Scanner;

public class FactorialRecursiveTailCall{
	public static void main(String ... args){
		Scanner sc = new Scanner(System.in);
		int num, sum=0;
	
		do{
			System.out.print("Enter a positive integer: ");
			num = sc.nextInt();
		}while(num<0);
		
		//int f = factorial(num,1);
		
		for(int ctr=1; ctr<=num; ctr++){
			System.out.print(factorial(ctr,1)+" ");
			sum += factorial(ctr,1);
			}
		
		System.out.println("\nSum: " + sum);
		
		//System.out.println("The factorial of " + num + " is " + f);	
		
	}
		
	private static int factorial(int n, int a){
		
		if(n==0)
			return a;
		else
			return factorial((n-1), (a*n));
		
		//return (n==0)?a: factorial((n-1), (a*n));
	}
	//4!
	//n=0 a=24
	//=f(4,1)
	//=f(4-1, 1*4)
	//=f(3,4)
	//=f(3-1, 4*3)
	//=f(2, 12)
	//=f(2-1, 12*2)
	//=f(1, 24)
	//=f(1-1, 24*1)
	//=f(0, 24)
}