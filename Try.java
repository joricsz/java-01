
import java.util.Scanner;

public class Try{
		
	public static void main(String ... args){
		Scanner sc = new Scanner(System.in);
		
		print("Enter a number from -9999 to 9999: ");
		String num = sc.next();
		
		String sign = "" + num.charAt(0);
	
		if (num.equals("0")){
			println("Number: " + num);
			println("In Words: Zero");
		}
		else if (parseInt(num) <= 9999 && parseInt(num) > 0) {
			println("Number: " + num);
			println("In Words: " + NumToWords(num));
		}
		else if (sign.equals("-")){
			println("Number: " + num);
			String NegativeNum = num.substring(1);
			if (parseInt(NegativeNum) <= 9999 && parseInt(NegativeNum) > 0 )
				println("In Words: " + "Negative " + NumToWords(NegativeNum));
			else
				println("The number entered is out of range.");	
		}
		else{
			println("The number entered is out of range.");
		}	
    }
		static void print(String word){
			System.out.print(word);
		}
		static void println(String word){
			System.out.println(word);
		}
		static int parseInt(String num){
			return Integer.parseInt(num);
		}
	
	public static String NumToWords(String num){

	String Ones = num.substring(0);
	String Tens = num.substring(0,1);
	String Hundreds = num.substring(0,1);
	String Thousands = num.substring(0,1);
	
	String numDigits = "" + String.valueOf(num).length();
	String a, b , c;
	
	//System.out.println(numDigits);
	/*
	if (numDigits.equals("1")){
		switch (parseInt(num)){
		//case 0: System.out.print("");  break;
		case 1: System.out.print("One "); a = "One "; break;
		case 2: System.out.print("Two "); a = "Two "; break;
		case 3: System.out.print("Three "); a = "Three "; break;
		case 4: System.out.print("Four "); a = "Four "; break;
		case 5: System.out.print("Five "); a = "Five "; break;
		case 6: System.out.print("Six "); a = "Six "; break;
		case 7: System.out.print("Seven "); a = "Seven "; break;
		case 8: System.out.print("Eight "); a = "Eight "; break;
		case 9: System.out.print("Nine "); a = "Nine "; break;
		}
	}
	else if (numDigits.equals("2")){
		if (Integer.parseInt(Tens) < 20){
			Switch (parseInt(Tens)){
			case 10: System.out.print("Ten "); b = "Ten "; break;
			case 11: System.out.print("Eleven "); b = "Eleven "; break;
			case 12: System.out.print("Tweleve "); b = "Tweleve "; break;
			case 13: System.out.print("Thirteen "); b = "Thirteen "; break;
			case 14: System.out.print("Fourteen "); b = "Fourteen "; break;
			case 15: System.out.print("Fifteen "); b = "Fifteen "; break;
			case 16: System.out.print("Sixteen "); b = "Sixteen "; break;
			case 17: System.out.print("Seventeen "); b = "Seventeen "; break;
			case 18: System.out.print("Eighteen "); b = "Eighteen "; break;
			case 19: System.out.print("Nineteen "); b = "Nineteen "; break;
			}
			else if (Integer.parseInt(Tens) <= 90 && ) {
			
			}	
		}
	}
	public static String NumberToWord(int number) {
	String words = "";
    String unitsArray[] = {"", "One", "Two", "Three", "Four", "Five", "Six", 
                      "Seven", "Eight", "Nine", "Ten", "Eleven", "Twelve",
                      "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", 
                      "Eighteen", "Nineteen" };
	String tensArray[] = {"", "Ten", "Twenty", "Thirty", "Forty", "Fifty",
                      "Sixty", "Seventy", "Eighty", "Ninety" };
					  
	if ((num / 1000) > 0){
	    words += NumberToWord(num / 1000) + " Thousand ";
	    numb %= 1000;
	}
	// check if number is divisible by 1 hundred
	if ((num / 100) > 0) {
	     words += numberToWord(num / 100) + " Hundred ";
	     num %= 100;
	}
 
	if (num > 0) {
	     // check if number is within teens
	     if (num < 20) { 
                    // fetch the appropriate value from unit array
                    words += unitsArray[num];
             } 
			 else { 
                // fetch the appropriate value from tens array
                words += tensArray[num / 10]; 
                if ((num % 10) > 0) {
		        words += "-" + unitsArray[num % 10];
                }  
			}
          }
	  return words;
	}
 */	return num;
	}
}

/*

static void numberToWords(char num[]){  
//determines the number of digits in the given number  
	int numlength = num.length;  
//checks the given number has number or not  
	if (numlength > 9999 && numlength < -9999){  
//if the given number is empty prints the following statement     
	System.out.println("The number entered is out of range.");  
	return;  
	}  
}  
//string type array for one-digit numbers    
String[] OneDigits = new String[] {"Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"};  
//string type array for two digits numbers    
//the first index is empty because it makes indexing easy   
String[] TwoDigits = new String[] {"", "Ten", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"};  
//string type array of tens multiples   
//the first two indexes are empty because it makes indexing easy   
String[] MultiplesOfTen = new String[] {"",  "", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"};  
//string type array of power of tens   
String[] PowersOfTen = new String[] {"Hundred", "Thousand"};  
 
if (numlength == 1)   
{  
//if the above condition returns true, it accesses the corresponding index and prints the value of that index  
//[num[0]-'0']: getting the number equal the decimal value of the character (assuming the char is the digit)  
System.out.println(OneDigits[num[0]-'0']);  
return;  
}  
int x = 0;  
//executes until num does not become not '\0'  
while (x < num.length)   
{  
//executes if the length of the string is greater than equal to three  
if (numlength >= 3)   
{  
if (num[x] - '0' != 0)   
{  
System.out.print(OneDigits[num[x] - '0'] + " ");  
//here length can be 3 or 4  
System.out.print(PowersOfTen[numlength - 3]+ " ");  
}  
//decrements the length of the string by 1  
--numlength;  
}  
//executes if the given number has two digits  
else   
{  
//the if-statement handles the numbers from 10 to 19 only     
if (num[x] - '0' == 1)   
{  
//adding the digits of the given number   
//the logic behind sum up the digits is that we will use the sum for accessing the index of the array   
//for example: 17, sum of digits = 8  
//we will access the 8th index in twodigits[] array i.e. Seventeen  
int sum = num[x] - '0' + num[x + 1] - '0';  
System.out.println(TwoDigits[sum]);  
return;  
}  
//the else-if statement handles the number 20 only  
//compares the tens and unit place with 2 and 0 respectively  
else if (num[x] - '0' == 2 && num[x + 1] - '0' == 0)   
{  
//executes if the above else-if condition returns true    
System.out.println("Twenty");  
return;  
}  
//the else block handles the numbers from 21 to 100  
else   
{  
int i = (num[x] - '0');  
if (i > 0)  
//prints the ith index element of the array multipleoftens[]  
System.out.print(MultiplesOfTen[i]+ " ");  
else  
//prints space  
System.out.print("");  
//increments the variable i by 1  
++x;  
//checks whether the number is not equal to zero, it means the number has only a digit  
if (num[x] - '0' != 0)  
//prints the ith index element of the array onedigit[]  
System.out.println(OneDigits[num[x] - '0']);  
}  
}  
//increments the variable i by 1  
++x;  
}  */