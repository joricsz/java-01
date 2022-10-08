/**
	Sample User-defined method without parameter and without return value.
	Sammple Command-Line Argument
*/

public class MyMethod3{
	public static void main(String ... args){
		int num=0, sum=0;
		for(String s: args){
			num = Integer.parseInt(s);
			System.out.println(num);
			sum = sum + num;
		}
		System.out.println(sum);
	}
	
}