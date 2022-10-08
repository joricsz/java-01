/** Write a Java program will display a right triangle of asterisks based on a given number.
* Expected output:
* Enter a positive integer: 5
* 	*
*	* * 
*	* * *
* 	* * * *
*	* * * * *
*
*	* * * * *
*	* * * *
*	* * *
* 	* * 
*	*
*/
import java.util.Scanner;
public class TriangleOfAsterisks{
	public static void main(String ... args){
		int num;
		do{
			System.out.println("Enter a positive integer: ");
			Scanner sc = new Scanner(System.in);
			num = sc.nextInt();	
		}while(num<0);
		
		for(int i=1;i<=num;i++){
			for(int j=1;j<=i;j++){
				System.out.print("* ");
			}
			System.out.println();
		}
		
		System.out.println();
		
		for(int i=1;i<=num;i++){
			for(int j=num;j>=i;j--){
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}


/**
	for(int i=1; i<=num; i++){
		for(int j=1; j<=num;j++){
			System.out.println("* ");
		}
		System.out.println();
	}
	
	System.out.println();
	
	for(int i=num; i>=1; i--){
		for(int j=1; j<=1; j++){
			System.out.println("* ");
			}
		System.out.println();
	}



*/