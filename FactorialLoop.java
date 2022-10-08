/** Write a java program that will compute for the factorial of a given positive integer
* 0! = 1
* 1! = 1
* 2! = 1 * 2 = 2
* 3! = 1 * 2 * 3 = 6
* 4! = 1 * 2 * 3 * 4 = 24
* 5! = 1 * 2 * 3 * 4 * 5 = 120
*
* Expected output:
* Enter a positive integer: 4
* 4! = 24
*/
import java.util.Scanner;
public class FactorialLoop{
	public static void main(String ... args){
		int inp;
		int factorial = 1;
		do{
			System.out.print("Enter a positive integer: ");
			Scanner sc = new Scanner(System.in);
			inp = sc.nextInt();
		}while(inp<0);
		
		for(int i=1;i<=inp;i++){
			factorial *= i;
		}
		System.out.println(inp + "! = " + factorial);
		
		//inp=4 factorial=24 i=5
		//24
		
		//Solution 1
		/**
		int i=1
		while(i<=num){
			factorial*=i;
			i++;
		}
		System.out.println(inp + "! = " + factorial)
		*/
		
		//Solution 2
		/**
		for(int i=num;i>1;i--){
			factorial*=i;
		}
		System.out.println(inp + "! = " + factorial)
		*/
		
	}
}

