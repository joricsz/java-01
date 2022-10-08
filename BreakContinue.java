
public class BreakContinue{
	public static void main (String ... args){
		for(int i=1; i<=5; i++){
			if(i%3==0){
				break;
			}
			System.out.println(i);
		}
		System.out.println("Outside the loop.");
		
		for(int i=1; i<=5; i++){
			if(i%3==0){
				continue;
			}
			System.out.println(i);
		}
		System.out.println("Outside the loop.");
	}
	// i = 1 2 3
	//display: 1 2 4 5
}