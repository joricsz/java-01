import java.util.Scanner;

public class SampleMP4{

    public static void main(String[] args) {

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
			println("In Words: " + NumToWords(parseInt(num)));
		}
		else if (sign.equals("-")){
			println("Number: " + num);
			String NegativeNum = num.substring(1);
			if (parseInt(NegativeNum) <= 9999 && parseInt(NegativeNum) > 0 )
				println("In Words: " + "Negative " + NumToWords(parseInt(NegativeNum)));
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
	
public static String NumToWords(int num) {
        int t=0;
        int h=0;

        String[] s1 = {"","One ", "Two ", "Three ", "Four ", "Five ", "Six ", "Seven ", "Eight ", "Nine ", "Ten ", 
					   "Eleven ", "Twelve ", "Thirteen ", "Fourteen ", "Fifteen ", "Sixteen ", "Seventeen ", "Eighteen ", "Nineteen "};
					   
        String[] s2 = {"", "Ten ", "Twenty ", "Thirty ", "Forty ", "Fifty ", "Sixty ", "Seventy ", "Eighty ", "Ninety "};
		
        String[] s3 = {"","Thousand ", "Hundred "};

        int[] a=new int[5];
        int c=0;

        while (num > 0)
        {

            a[c]=(num%10);
            c++;

            num /= 10;
        }
        int[] b=new int[5];
        int j=b.length-1;
        for (int i = 0; i <b.length ; i++,j--)
        {
            b[i]=a[j];
        }
        int sum=0;
        if (b[1]!=0) t=1;
        if (b[2]!=0) h=2;

        if (b[3]*10+b[4]<20){
			sum=b[3]*10+b[4];
            String toWords0= s1[b[1]]+s3[t]+s1[b[2]]+s3[h]+s1[sum];
            return toWords0;
        }
        else {
            String toWords2 = s1[b[1]] + s3[t] + s1[b[2]] + s3[h] + s2[b[3]] + s1[b[4]];
            return toWords2;
        }	
    }	
}