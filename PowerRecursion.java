import java.util.Scanner;
public class PowerRecursion{
	public static void main(String ... args){
		Scanner sc = new Scanner(System.in);
		int b=0, exp=0;
		
		do{
			System.out.println("Enter base: ");
			b = sc.nextInt();
			System.out.println("Enter exponent: ");
			exp = sc.nextInt();
		}while(exp<0);
		
		if(b==0 && exp==0)
			System.out.println("The product of" + b + " raised to " + exp + " is undefined or 1 depending on the context");
		else{
			int p = power(b, exp, 1);
			System.out.println("The product of " + b + " raised to " + exp + " is " + p);
		}
		
	}
	
	private static int power(int x, int n, int p){
		
		if(n==0)
			return p;
		else
			return power (x, n-1, p*x);
		
		//return (n==0?1:x * power (x, n-1));  //2 * (2 * (1)) = 4
		
		//return (n==0?1:power((x),(n-1),(p*x)))
	}
	//x=3 n=3 p=1
	//=power(3, 3-1, 1*3)
	//x=3 n=2, p=3
	//=power(3, 2, 3)
	//=power(3, 2-1, 3*3)
	//x=3 n=1 p=9
	//=power(3, 1, 9)
	//=power(3, 1-1, 9*3)
	//x=3 n=0 p=27
	//=power(3,0,27);
	//return p
	
	
}