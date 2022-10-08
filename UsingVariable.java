import java.util.Scanner;
public class UsingVariable{
	public static void main (String ... args){
		
		int grade=0, sum=0;
		
		for(int ctr=1;ctr<5;ctr++){
			grade= (int) Math.round(Math.random()*100);
			System.out.println(grade);
			sum+=grade;
		}
	
		float average = sum/5;
		
		System.out.println("The average is " + average);
	}
}