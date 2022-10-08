import java.util.Scanner;
class SampleTryCatch{
	public static void main(String ... args){
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter an integer: ");
		
		try{
			sc.nextInt();
		}
		catch(Exception e){
			System.out.println("Invalid Input. Please enter an integer");
		}
	}
}