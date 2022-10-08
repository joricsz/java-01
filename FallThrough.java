public class FallThrough
{
	public static void main(String[] args)
	{
		
		char letter = 'o';
		
		System.out.println("Using if with compound expressions");
		if (letter=='a' || letter=='e' || letter=='i' || letter=='o' || letter=='u')
			System.out.println("Vowel");
		else
			System.out.println("Consonant");
		
		//same as this using fall through
		System.out.println("Using case taking advantage of fall through");
		switch(letter)
		{
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':
			System.out.println("Vowel");
			break;
		default:
			System.out.println("Consonant");
		}	
		
		
			
	}
}