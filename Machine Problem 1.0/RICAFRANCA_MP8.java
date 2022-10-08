
public class RICAFRANCA_MP8{
	public static void main(String...args){
		/* //left allign
		int greeting[][] = {{0,4,6,7,8,9,10,12,13,14,15,18,19,20,21,24,28,32,36,42,46,50,55,56,57,60,61},
							{0,1,3,4,6,12,16,18,22,25,27,33,35,42,43,45,46,48,52,54,60,61},
							{0,2,4,6,7,8,9,12,13,14,15,18,19,20,21,26,34,38,39,40,42,44,46,48,52,55,56,57,60,61},
							{0,4,6,12,16,18,22,26,33,35,42,46,48,49,50,51,52,58},
							{0,4,6,7,8,9,10,12,16,18,22,26,32,36,42,46,48,52,55,56,57,60,61}};
		*/
		//center
		int greeting[][] = {{9,13,15,16,17,18,19,21,22,23,24,27,28,29,30,33,37,41,45,51,55,59,64,65,66,69,70},
							{9,10,12,13,15,21,25,27,31,34,36,42,44,51,52,54,55,58,60,63,69,70},
							{9,11,13,15,16,17,18,21,22,23,24,27,28,29,30,35,43,47,48,49,51,53,55,57,61,64,65,66,69,70},
							{9,13,15,21,25,27,31,35,42,44,51,55,57,58,59,60,61,67},
							{9,13,15,16,17,18,19,21,25,27,31,35,41,45,51,55,57,61,64,65,66,69,70}};
		
		//clear
		for(int rows=0;rows<=23;rows++){
			for(int col=0;col<=79;col++){
				System.out.print(" ");
			}
			System.out.println(" ");
		}
		
		//Greeting words = MERRY X-MAS!
		for(int i=0; i<=4;i++){
			int mark=0;
			for(int j=0; j<greeting[i].length; j++){
				
				while(mark<=greeting[i][j]){					
					if(mark==greeting[i][j]){
						delay(150000000);
						System.out.print('#');
					}
					else{
						System.out.print(" ");
					}
					mark+=1;
				}
			}
			System.out.println();
		}
		System.out.println();
		
		int center=39;
		int charPerRow=1;
		//star *
		for(int j=1;j<=center;j++){
				System.out.print(" ");
				if(j==center)
					System.out.println('*');
			}
		//1st triangle ^
		for(int i=1;i<=5;i++){
			for(int j=1;j<=center;j++){
				System.out.print(" ");
			}
			for(int n=1;n<=charPerRow;n++){
				delay(150000000);
				System.out.print('^');
			}
			charPerRow+=2;
			center-=1;
			System.out.println();
		}
		//2nd triangle ^
		charPerRow=3;
		center=38;
		for(int i=1;i<=5;i++){
			for(int j=1;j<=center;j++){
				System.out.print(" ");
			}
			for(int n=1;n<=charPerRow;n++){
				delay(150000000);
				System.out.print('^');
			}
			charPerRow+=2;
			center-=1;
			System.out.println();
		}
		//3rd triangle ^
		charPerRow=5;
		center=37;
		for(int i=1;i<=5;i++){
			for(int j=1;j<=center;j++){
				System.out.print(" ");
			}
			for(int n=1;n<=charPerRow;n++){
				delay(150000000);
				System.out.print('^');
			}
			charPerRow+=2;
			center-=1;
			System.out.println();
		}
		//trunk \u2551
		charPerRow=5;
		center=37;
		for(int i=1;i<=2;i++){
			for(int j=1;j<=center;j++){
				System.out.print(" ");
			}
			for(int n=1;n<=charPerRow;n++){
				delay(150000000);
				System.out.print('\u2551');
			}
			System.out.println();
		}
	}
	private static void delay(long x){
		for(int i=0;i<=x; i++){
		}
	}
}