public class StringSample{
	public static void main(String ... args){
		//String str = "abc";
		
		//str = "def";
		
		//System.out.println(str);
		//Using string class
	/*	String strString2 = "Hello";
		String strString3 = "Hello";
		String strString4 = "Hello";
		String strString5 = "Hello";
		System.out.println("---Using String Class---");
		String strString = "Hello";
		
		System.out.println(strString);
		strString.concat(" World");
		System.out.println(strString);
		System.out.println(strString.concat(" World"));
		strString=strString.concat("World");
		System.out.println(strString);
		System.out.println("strString2: " + strString2);
		System.out.println("strString3: " + strString3);
		System.out.println("strString4: " + strString4);
		System.out.println("strString5: " + strString5);
		
		
		//Using StringBuffer
		System.out.println("\n\n---Using StringBuffer---");
		StringBuffer strBuffer = new StringBuffer("Hello");
		
		System.out.println(strBuffer);
		strBuffer.append(" World");
		System.out.println(strBuffer);
		
		//Using StringBuilder
		StringBuilder strBuilder = new StringBuilder("Hello");
		System.out.println("\n\n---Using StringBuilder---");
		
		System.out.println(strBuilder);
		strBuilder.append(" World");
		System.out.println(strBuilder);
		*/
		//Print starting from index 3
		String country = "Philippines";
		System.out.println(country.substring(3));
		System.out.println(country.substring(0,3));
		System.out.println(country.length());
		System.out.println(country.substring(country.length()-1));
		System.out.println(country.charAt(5));
		
		String str = "aaa:bbb:ccc";
		String arr[] = str.split(":");
		for(String r: arr){
			System.out.println(r);
		}
	}
}