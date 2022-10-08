import java.util.Scanner;
public class MachineProblem2A{
	public static void main(String ... args){
		Scanner x = new Scanner(System.in);
		Scanner y = new Scanner(System.in);
		
		int int1, int2;
		
		System.out.print("Enter the 1st integer: ");
		int1 = x.nextInt();
		
		System.out.print("Enter the 2nd integer: ");
		int2 = y.nextInt();
		
		float q = ((float) int1)/ ((float) int2);
		
		System.out.printf("The quotient is %.4f", q); 
	}
}