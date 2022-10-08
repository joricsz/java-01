
public class Plowchart{
	public static void main(String ... args){
		int A = 15;
		int B = 10;
		int C = 20;
		int Temp = 0;
		
		Temp = A;
		A = B;
		B = Temp;
		
		System.out.println("A = " + A);
		System.out.println("B = " + B);
		System.out.println("C = " + C);
	}
}