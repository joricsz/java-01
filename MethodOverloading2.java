
class MethodOverloading2{
	public static void main (String ... args){
		sum("First",100,200);			//300
		sum("Second",100,200,300);		//600
		sum("Third",100,200,300,400);	//1000
	}
	
	public static void sum(String s,int ... num){
		int total=0;
		for(int i : num){
			total += 1;
		}
		System.out.println(s+ "=" + total);
	}
}