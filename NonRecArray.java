
public class NonRecArray{
	public static void main (String ... args){
		int a[][] = new int [3][];
		a[0] = new int[3];
		a[1] = new int[2];
		a[2] = new int[4];
		
		int num=0;
		
		for(int r=0; r<=2; r++){
			for(int c=0; c<a[r].length; c++){
				num++;
				a[r][c]= num;
			}
		}
		
		for(int r=0; r<=2; r++){
			for(int c=0; c<a[r].length; c++){
					System.out.println(a[r][c] + " ");
			}
			System.out.println();
		}
		
		/*
		System.out.println(a[0][0] + " ");
		System.out.println(a[0][1] + " ");
		System.out.println(a[0][2] + " ");
		System.out.println();
		System.out.println(a[1][0] + " ");
		System.out.println(a[1][1] + " ");
		System.out.println();
		System.out.println(a[2][0] + " ");
		System.out.println(a[2][1] + " ");
		System.out.println(a[2][2] + " ");
		System.out.println(a[2][3] + " ");
		System.out.println();
		*/
	}
}