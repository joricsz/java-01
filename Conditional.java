
public class Conditional{
	public static void main(String ... args){
		int grade = 74;
		
		if(grade>=75)
		{
			System.out.println("Passed");
			System.out.println("Very Good");
		}
		else
		{	
			System.out.println("Failed");
			System.out.println("Hehe");
		}
		
		char gender = 'm';
		if (gender == 'm'|| gender == 'M' ) //Do not terminate the conditional by placing ';'
			System.out.println("Male");
		
		grade = 100;
		if (grade == 100)
			System.out.println("A");
		else if (grade == 95)
			System.out.println("B");
		else if (grade == 90)
			System.out.println("C");
		else if (grade == 85)
			System.out.println("D");
		else
			System.out.println("F");
		
		
		switch(grade){
			case 100: System.out.println("A");break;
			case 95: System.out.println("B"); break;
			case 90: System.out.println("C"); break;
			case 85: System.out.println("D"); break;
			default: System.out.println("F");
		}
		
		char ch = 'O';
		switch (ch){ //pinupuntahan agad yung case 'i'
			case 'a':
			case 'A':
			case 'e':
			case 'E':
			case 'i':
			case 'I':
			case 'o':
			case 'O':
			case 'u':
			case 'U':System.out.println("Vowel"); break;
			default: System.out.println("Consonant");
		}
	
	
	
	
	
	
	}

}