public class MachineProblem2B{
	public static void main(String ... args){
		String a = "5.2";
		String b = "2.1";
		
		double sum;
		double difference;
		double product;
		double modulo;
		
		sum = Double.parseDouble(a) + Double.parseDouble(b);
		difference = Double.parseDouble(a) - Double.parseDouble(b);
		product = Double.parseDouble(a) * Double.parseDouble(b);
		modulo = Double.parseDouble(a) % Double.parseDouble(b);
		
		System.out.println("The sum is " + (int)sum);
		System.out.println("The difference is " + (int)difference);
		System.out.println("The product is " + (int)product);
		System.out.println("The modulo is " + (int)modulo);
	}
}