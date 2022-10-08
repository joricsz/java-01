
import java.util.Scanner;
public class RICAFRANCA_MP6{
	public static void main(String ... args){
		Scanner sc = new Scanner(System.in);
		int num = 0, n=1, c=0;
		do{
			System.out.print("Enter a positive integer: ");
			num = sc.nextInt();
		}while(num<0);
		
		System.out.println("The fibonacci sequence for " + num + " is: ");