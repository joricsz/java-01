
import java.util.Scanner;
public class FibonacciRecursiveTailCall{
	public static void main(String ... args){
		Scanner sc = new Scanner(System.in);
		int num = 0, n=1, c=0;
		do{
			System.out.print("Enter a positive integer: ");
			num = sc.nextInt();
		}while(num<0);
		
		System.out.println("The fibonacci sequence for " + num + " is: ");
		
		for(int ctr=0; ctr<=num; ctr++){
			System.out.print(fibonacci(ctr,0,1)+" ");
			}
		
		}
		
	private static int fibonacci(int n, int a, int b){
		
		if(n==0)
			return a;
		if(n==1)
			return b;
		return fibonacci(n-1,b,a+b);
		
		//return ((n==0)?a:(n==1)?b:fibonacci(n-1,b,a+b));
		
		//return((n==0)?0:(n==1)?1:fibonacci(n-2)+fibonacci(n-1));
		
		//return((n==0)?0:(n==1)?a:fibonacci(((n-2)+(n-1)),1));
	}
}

/**
f(4)

if f(0)=0
if f(1)=1
f(n-2)+f(n-1)

f(4)
=f(4-2)+f(4-1)
=f(2)+f(3)
=f(2-2)+f(2-1)+f(3-2)+f(3-1)
=f(0)+f(1)+f(1)+f(2)
=0+1+1+f(2-2)+f(2-1)
=0+1+1+f(0)+f(1)
=0+1+1+0+1
=3

RTC
f(n,a,b)

if f(0) = 0
if f(1) = 1
f(n-1,b,a+b)

f(4,0,1)
=f(4-1,1,1)
=f(3,1,1)
=f(3-1,1,2)
=f(2,1,2)
=f(2-1,2,3)
=f(1,2,3)
= 3
*/