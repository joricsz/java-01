
public class SampleOverloading{
	public static void main(String ... args){
		/*int a =5;
		//a++; // a = a + 1
		System.out.println(a); // a -> 6
		System.out.println(++a); // 6 prefix operator
		System.out.println(a++); // 6
		*/
		
		add(5,10);
		add(5,10.5);
		add(5.8,10.5);
		add(5.8,10);
		add(5,10,15);
		add(1,2,3,4,5,6,7,8,9.5,10);
		
	}/*
	private static void add(double a, double b){
		System.out.println(a + b);
		System.out.println("double,double");
	}
	private static void add(int a, int b){
		System.out.println(a + b);
		System.out.println("int,int");
	}
	private static void add(int a, double b){
		System.out.println(a + b);
		System.out.println("int,double");
	}
	private static void add(double a, int b){
		System.out.println(a + b);
		System.out.println("double,int");
	}
	private static void add(int a, int b, int c){
		System.out.println(a + b + c);
		System.out.println("int,int,int"); 
	}*/
	private static void add(int ... a){
		int sum = 0;
		for(int i=0; i<a.length; i++){ //i-1 because i refers to the index value of the array 
			sum = sum + a[i];
			System.out.println(a[i]);
		}
		System.out.println("The sum is: "+sum);
		System.out.println("int...9");
	}
	private static void add(double ... a){
		double sum = 0.0d;
		for(int i=1; i<=a.length; i++){ 
			sum = sum + a[i-1];
			System.out.println(a[i-1]);
		}
		System.out.println("The sum is: "+sum);
		System.out.println("double...9");
	}
}

