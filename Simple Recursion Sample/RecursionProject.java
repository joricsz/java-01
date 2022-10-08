import java.util.Scanner;

public class RecursionProject{
    public static void main(String ... args){
        Scanner sc = new Scanner(System.in);
		int choice;
		
		do{
			System.out.println("Sequence List");
			System.out.println("[1] Factorial");
			System.out.println("[2] Even");
			System.out.println("[3] Geometric");
			System.out.println("[4] Arithmetic");
			System.out.println("[5] Fibonacci");
			System.out.println("Enter Choice [1-5]: ");
			choice = sc.nextInt();
			System.out.println();
		}while(!(choice >=1 && choice <=5));
		
		//factorial
		if(choice==1){
			int num; 
			long fSum=0;
			do{
				System.out.print("Enter number of elements: ");
				num = sc.nextInt();
			}while(num<0);
			
			System.out.println("Factorial Sequence: ");
			
			for(int ctr=1; ctr<=num; ctr++){
				System.out.print(Factorial(ctr,1)+" ");
				fSum += Factorial(ctr,1);
			}
			System.out.println("\nSum: " + fSum);
		}
		
		//even
		if(choice==2){
			int num;
			long eSum=0;
			do{
				System.out.print("Enter number of elements: ");
				num = sc.nextInt();
			}while(num<0);
			
			System.out.println("Even Sequence: ");
			
			for(int ctr=1; ctr<=num; ctr++){
				System.out.print(Even(ctr,0)+" ");
				eSum += Even(ctr,0);
			}
			System.out.println("\nSum: " + eSum);
		}
		
		//geometric
		if(choice==3){
			int num;
			long gSum=0;
			do{
				System.out.print("Enter number of elements: ");
				num = sc.nextInt();
			}while(num<0);
			
			System.out.println("Geometric Sequence: ");
			
			for(int ctr=1; ctr<=num; ctr++){
				System.out.print((long)Geometric(ctr,0.5)+" ");
				gSum += (long)Geometric(ctr,0.5);
			}
			System.out.println("\nSum: " + gSum);
		}
		
		//arithmetic
		if(choice==4){
			int num; 
			long aSum=0;
			do{
				System.out.print("Enter number of elements: ");
				num = sc.nextInt();
			}while(num<0);
			
			System.out.println("Arithmetic Sequence: ");
			
			for(int ctr=1; ctr<=num; ctr++) {
				System.out.print(Arithmetic(ctr,0) + " ");
				aSum += Arithmetic(ctr,0);
			}
			System.out.println("\nSum: " + aSum);
		}
		
		//fibonacci	
		if(choice==5){
			int num; 
			long fSum=0;
			do{
				System.out.print("Enter number of elements: ");
				num = sc.nextInt();
			}while(num<0);
			
			System.out.println("Fibonacci Sequence: ");
			
			for(int ctr=1; ctr<=num; ctr++){
				System.out.print(Fibonacci(ctr,0,1)+" ");
				fSum += Fibonacci(ctr,0,1);
			}
			System.out.println("\nSum: " + fSum);
		}
	}
	public static long Factorial(int n, int a){
        if(n==0)
            return a;
        else
            return Factorial((n-1), (a*n));
    }

    public static long Even(int n, int a){
        if(n==0)
            return a;
        else
            return Even((n-1),(a+2));
    }
	
	public static double Geometric(int n, double a){
        if(n==0)
            return a;
		else
            return Geometric((n-1), (a*2));
    }
	
	public static long Arithmetic(int n, int a) {
        if(n==0)
            return a;
        else
            return Arithmetic(n-1, a+1);
		
    }
    public static long Fibonacci(int n, int a, int b) {
        if(n==0)
            return a;
        if(n==1)
            return b;
        else
            return Fibonacci(n-1, b, a+b);
    }
}
