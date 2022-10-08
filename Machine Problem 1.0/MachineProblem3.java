import java.util.Scanner;
public class RICAFRANCA_JOSHUA_MP3{
	public static void main(String ... args){
		//Question 1
		String school1 = "College of Information and Computing Sciences";
		System.out.println("Question1: " + school1);
		
		//Question 2
		String school2 = "college of information and computing sciences";
		System.out.println("Question2: " + school2);
		
		//Question 3
		String message = "\tI love ";
		System.out.println("Question3: " + message);
		
		//Question 4
		System.out.println("Question4: " + school1.charAt(0));
		
		//Question 5
		System.out.println("Question5: " + school1.length());
		
		//Question 6
		System.out.println("Question6: " + school1.equals(school2));
		
		//Question 7
		System.out.println("Question7: " + school1.equalsIgnoreCase(school2));
		
		//Question 8
		System.out.println("Question8: " + message.concat(school1));
		
		//Question 9
		Scanner sc = new Scanner(System.in);
		System.out.print("Input a string: ");
		String str = sc.nextLine();
		System.out.println("Question9: " + str.equals(school1));
		
		//Question 10
		System.out.println("Question10: " + school2.toUpperCase());
		
		//Question 11
		System.out.println("Question11: " + school1.toUpperCase());
		
		//Question 12
		System.out.println("Question12: " + school2.charAt(school2.length()-1));
		
		//Question 13
		System.out.println("Question13: " + message.charAt(0));
		
		//Question 14
		System.out.println("Question14: " + school2.length());
		
		//Question 15
		System.out.println("Question15: " + school2.replace('i', '!'));
		
		//Question 16
		System.out.println("Question16: " + school1.substring(11, 22));
		
		//Question 17
		System.out.println("Question17: " + message.trim());
		
		//Question 18
		System.out.println("Question18: " + message.trim().length());
		
		//Question 19
		System.out.println("Question19: " + school1.compareTo(school2));
		
		//Question 20
		System.out.println("Question20: " + message.substring(3, 7));
	}
}