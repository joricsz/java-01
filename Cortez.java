/** This program would determine if you passed or failed depending on the score that you input.
Analysis:
Variable: score
input: score 
*/

import java.util.Scanner;
public class Cortez{
	public static void main(String ... args){
		 Scanner x = new Scanner(System.in);
		 
		 System.out.println("Input your score. The total score is 100.");
		 
		 int score;
		 score = x.nextInt();
		
		 if (score >= 50){
		 System.out.print("Anak, itabi mo ako na!");
		 }
		 else {
		 System.out.print("AHAY! Hakdog ata yarn!");
		 }
		
	}
}
