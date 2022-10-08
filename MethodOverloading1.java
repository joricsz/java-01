
class MethodOverloading1{
	public static void main (String ... args){
		System.out.println(sum(100,200));			//300
		System.out.println(sum(100,200,300));		//600
		System.out.println(sum(100,200,300,400));	//1000
	}
	
	public static int sum(int num1, int num2){
		return num1  + num2;
	}
	public static int sum(int num1, int num2, int num3){
		return num1  + num2 + num3;
	}
	public static int sum(int num1, int num2, int num3, int num4){
		return num1  + num2 + num3 + num4;
	}
}