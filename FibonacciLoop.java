
import java.util.Scanner;
public class FibonacciLoop{
	public static void main(String ... args){
		Scanner sc = new Scanner(System.in);
	
		int num=0, a=0, c=0, b = 1;
	
		do{
			System.out.print("Enter a positive integer: ");
			num = sc.nextInt();
		}while(num<0);
		
		System.out.println("The fibonacci sequence for " + num + " is: " );
		
		for(int ctr=0; ctr<=num; ctr++){
			if(ctr==0)
				c=0;
			else if(ctr==1)
				c=1;
			else{
				c = a+b;
				a = b;
				b = c;
			}
			System.out.println(c+ " ");
		}
		
	}
	//num=4 a=2 b=3 c=3 ctr=5
	//0 1 1 2 3 
}