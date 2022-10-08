import java.util.Scanner;
public class CompareLoop{
	public static void main(String ... args){
		//int i = 1;
		Scanner sc = new Scanner(System.in);		
		int i;
		do{
			System.out.println("Enter an integer from [1-10]: ");
			i = sc.nextInt();
		}while(i<1||i>10);
		
		/*
		System.out.println("While loop");
		while(i<=10){
			System.out.println(i);
			++i;
			//--i; // will stop after hitting lowest boundary and will start at the highest boundary
		}
		
		System.out.println("Do loop");
		int j=1;
		do{
			System.out.println(j);
			j++;
		}
		while(j<=10);
		
		System.out.println("For loop");
		for(int k=1;k<=10;k++){
			System.out.println(k);
		}
		
		boolean a = true;
		while (a==true){
			
			if(a==false){
				break;
			}
		}*/
	}
}