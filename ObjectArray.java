
public class ObjectArray{
	public static void main (String ... args) {
		Object a[][] = new Object[5][];
		a[0] = new Integer[3];
		a[1] = new Boolean[2];
		a[2] = new Double[4];
		a[3] = new Character[3];
		a[4] = new String[2];
		
		a[0][0] = 1;
		a[0][1] = 2;
		a[0][2] = 3;
		a[1][0] = true;
		a[1][1] = false;
		a[2][0] = 1.1;
		a[2][1] = 1.2;
		a[2][2] = 1.3;
		a[2][3] = 1.4;
		a[3][0] = 'C';
		a[3][1] = 'M';
		a[3][2] = 'M';
		a[4][0] = "Jorics";
		a[4][1] = "Rica";
		
		for(int r=0; r<=4; r++){
			for(int c=0; c<a[r].length; c++){
					System.out.print(a[r][c] + " ");
			}
			System.out.println();
		}
		
	}
}