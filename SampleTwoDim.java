
public class SampleTwoDim{
	public static void main(String ... args){
		int a[][] = {{1,2,3}, 
					 {4,5,6}, 
					 {7,8,9}};
		
		for(int r=0; r<=2; r++){
			for(int c=0; c<=2; c++){
				System.out.println(a[r][c]);
			}
		}
		/*
		System.out.println(a[0][0]);
		System.out.println(a[0][1]);
		System.out.println(a[0][2]);
		System.out.println(a[1][0]);
		System.out.println(a[1][1]);
		System.out.println(a[1][2]);
		System.out.println(a[2][0]);
		System.out.println(a[2][1]);
		System.out.println(a[2][2]);
		*/
	}
}