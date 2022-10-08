
public class ArrayCopy {
	public static void main (String ... args){
	
		int orig[] = {1,2,3,4,5};
		int temp[] = {10,9,8,7,6,5,4,3,2,1};
		
		System.out.println("Length of orig[] is " + orig.length);
		System.out.println("Length of temp[] is " + temp.length);
		
		for(int ctr=0; ctr<orig.length; ctr++){
			System.out.print(orig[ctr] + " ");
		}
		System.out.println();	
		
		for(int ctr=0; ctr<temp.length; ctr++){
			System.out.print(temp[ctr] + " ");
		}
		System.out.println();
		
		System.arraycopy(orig,2,temp,3,orig.length-2); //orig=yung ipapalit + starting postion then temp is yung papalitan w/ its starting position
		
		for(int ctr=0; ctr<temp.length; ctr++){
			System.out.print(temp[ctr] + " ");
		}
		System.out.println();
	
		String coffee[] = {"Barako", "Americano", "Latte", "Cappuchino", "Mocha", "Cocoa", "Kilimanjaro"};
		
		for(String c : coffee){
			System.out.println(c);
		}
		
	}
}