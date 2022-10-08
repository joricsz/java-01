import java.util.Scanner;
public class MapEditor{
	public static void main (String ... args){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter rows, columns, and default character: ");
		
		int UserInput1 = sc.nextInt();
		int UserInput2 = sc.nextInt();
		char UserInput3 = sc.next().charAt(0);
		
		//Prints the map
		TextMap myMap = new TextMap(UserInput1, UserInput2, UserInput3);
		System.out.println(myMap);
		
		do {
			System.out.println("Enter row, column, and character: ");	
			int UserInput1a = sc.nextInt();
			int UserInput2a = sc.nextInt();
			char UserInput3a = sc.next().charAt(0);
			
			MapCoord mc = new MapCoord(UserInput1a, UserInput2a);
			myMap.isValidPosition(mc);
			
			if(myMap.isValidPosition(mc)){
				myMap.setPos(mc, UserInput3a);
			}
			else{
				System.out.println(myMap);
				break;
			}
			System.out.println(myMap);
		}while(myMap.getPosVal()==true);
	}
}