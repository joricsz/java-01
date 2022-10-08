
public class RICAFRANCA_MP7{
	public static void main(String...args){
		int a[][] = {{1 ,2 ,3},
					 {4, 5, 6},
					 {7, 8, 9}};
		int b[][] = {{1 ,2 ,3},
					 {4, 5, 6},
					 {7, 8, 9}};
		int c[][] = new int [3][3];
		
		/*
		c[0][0] = ((a[0][0] * b[0][0]) + (a[0][1] * b[1][0]) + (a[0][2] * b[2][0]));
		c[0][1] = ((a[0][0] * b[0][1]) + (a[0][1] * b[1][1]) + (a[0][2] * b[2][1]));
		c[0][2] = ((a[0][0] * b[0][2]) + (a[0][1] * b[1][2]) + (a[0][2] * b[2][2]));
		
		c[1][0] = ((a[1][0] * b[0][0]) + (a[1][1] * b[1][0]) + (a[1][2] * b[2][0]));
		c[1][1] = ((a[1][0] * b[0][1]) + (a[1][1] * b[1][1]) + (a[1][2] * b[2][1]));
		c[1][2] = ((a[1][0] * b[0][2]) + (a[1][1] * b[1][2]) + (a[1][2] * b[2][2]));
		
		c[2][0] = ((a[2][0] * b[0][0]) + (a[2][1] * b[1][0]) + (a[2][2] * b[2][0]));
		c[2][1] = ((a[2][0] * b[0][1]) + (a[2][1] * b[1][1]) + (a[2][2] * b[2][1]));
		c[2][2] = ((a[2][0] * b[0][2]) + (a[2][1] * b[1][2]) + (a[2][2] * b[2][2]));
		*/
		
		for(int row=0;row<=2;row++){
			for(int col=0;col<=2;col++){
				c[row][col] = ((a[row][0]*b[0][col]) + (a[row][1]*b[1][col]) + (a[row][2]*b[2][col]));
			}
		}		
	
		System.out.println("Matrix A:");
		for(int row=0; row<=2; row++){
			for(int col=0; col<=2; col++){
				System.out.print(a[row][col] + "\t");
			}
			System.out.println();
		}
		System.out.println();
	
		System.out.println("	*");
		
		System.out.println();
		System.out.println("Matrix B:");
		for(int row=0; row<=2; row++){
			for(int col=0; col<=2; col++){
				System.out.print(b[row][col] + "\t");
			}
			System.out.println();
		}
		System.out.println();
		
		System.out.println("	=");
		
		System.out.println();
		System.out.println("Matrix C:");
		for(int row=0; row<=2; row++){
			for(int col=0; col<=2; col++){
				System.out.print(c[row][col] + "\t");
			}
			System.out.println();
		}
		System.out.println();
		
	}
}