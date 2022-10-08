import java.util.Scanner;
public class NestedLoop{
	public static void main(String ... args){
		Scanner sc = new Scanner(System.in);
		int inp;
		String ans;
		do{
			do{
				System.out.print("Enter a number from [1-10]: ");
				inp = sc.nextInt();
			}while(inp<1||inp>10);
		
			outerLoop:
			for(int i=1;i<=inp;i++){
				innerLoop:
				for(int j=1;j<=inp;j++){
					//continue; >>> unreachable statement error
					System.out.print(("*")+"\t");
					//continue outerLoop;
				}
				System.out.println();
			
			}
			
				System.out.println("Answer [Y/N]: ");
				ans = sc.next();
		}while(ans.equals("Y") || ans.equals("y"));
	
	// inp=3 i=1 j=4
	//*	* *
	
	}
}	