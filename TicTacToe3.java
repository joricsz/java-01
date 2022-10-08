import java.util.Scanner;
public class TicTacToe3{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		char arr[][] = {{' ',' ',' '}, {' ',' ',' '}, {' ',' ',' '}};
		int pos, pRow=0, pCol=0;
		boolean vacant=false, winner=false, full=false;

		for(int i=1; i<=9; i++){
			System.out.print("|" + i + "|");
			if(i%3==0) System.out.println();
		}

		OuterLoop:
		do{
			//Player 1
			do{
				System.out.print("Enter position for Player 1 [1-9]: ");
				pos=sc.nextInt();

				//Check if the position is vacant
				switch(pos){
					case 1: pRow=0; pCol=0; break;
					case 2: pRow=0; pCol=1; break;
					case 3: pRow=0; pCol=2; break;
					case 4: pRow=1; pCol=0; break;
					case 5: pRow=1; pCol=1; break;
					case 6: pRow=1; pCol=2; break;
					case 7: pRow=2; pCol=0; break;
					case 8: pRow=2; pCol=1; break;
					case 9: pRow=2; pCol=2; break;
				}
				if(arr[pRow][pCol]==' '){
					//Mark the position
					vacant=true;
					arr[pRow][pCol]='X';
				}
				else{
					vacant=false;
					System.out.println("Try another position.");
				}

				//Display the array
				for(int i=0; i<=2; i++){
					for(int j=0; j<=2; j++){
						System.out.print("|" + arr[i][j] + "|");
					}
					System.out.println();
				}

				//Check for winner
				if(arr[0][0]=='X' && arr[0][1]=='X' && arr[0][2]=='X'){
					System.out.println("Player 1 Win!");
					winner=true;
				}
				else if(arr[1][0]=='X' && arr[1][1]=='X' && arr[1][2]=='X'){
					System.out.println("Player 1 Win!");
					winner=true;
				}
				else if(arr[2][0]=='X' && arr[2][1]=='X' && arr[2][2]=='X'){
					System.out.println("Player 1 Win!");
					winner=true;
				}
				else if(arr[0][0]=='X' && arr[1][0]=='X' && arr[2][0]=='X'){
					System.out.println("Player 1 Win!");
					winner=true;
				}
				else if(arr[0][1]=='X' && arr[1][1]=='X' && arr[2][1]=='X'){
					System.out.println("Player 1 Win!");
					winner=true;
				}
				else if(arr[0][2]=='X' && arr[1][2]=='X' && arr[2][2]=='X'){
					System.out.println("Player 1 Win!");
					winner=true;
				}
				else if(arr[0][0]=='X' && arr[1][1]=='X' && arr[2][2]=='X'){
					System.out.println("Player 1 Win!");
					winner=true;
				}
				else if(arr[0][2]=='X' && arr[1][1]=='X' && arr[2][0]=='X'){
					System.out.println("Player 1 Win!");
					winner=true;
				}

				if(winner==true) break OuterLoop;

				//Check if full
				OuterX:
				for(int i=0; i<=2; i++){
					for(int j=0; j<=2; j++){
						if(arr[i][j]==' '){
							full=false;
							break OuterX;
						}
						else{
							full=true;
						}
					}
				}

				//Check if draw
				if(full==true && winner==false){
					System.out.println("Draw!");
					break OuterLoop;
				}

			}while(pos<1 || pos>9 || vacant==false);

			//Player 2
			do{
				System.out.print("Enter position for Player 2 [1-9]: ");
				pos=sc.nextInt();

				//Check if the position is vacant
				switch(pos){
					case 1: pRow=0; pCol=0; break;
					case 2: pRow=0; pCol=1; break;
					case 3: pRow=0; pCol=2; break;
					case 4: pRow=1; pCol=0; break;
					case 5: pRow=1; pCol=1; break;
					case 6: pRow=1; pCol=2; break;
					case 7: pRow=2; pCol=0; break;
					case 8: pRow=2; pCol=1; break;
					case 9: pRow=2; pCol=2; break;
				}
				if(arr[pRow][pCol]==' '){
					//Mark the position
					vacant=true;
					arr[pRow][pCol]='O';
				}
				else{
					vacant=false;
					System.out.println("Try another position.");
				}

				//Display the array
				for(int i=0; i<=2; i++){
					for(int j=0; j<=2; j++){
						System.out.print("|" + arr[i][j] + "|");
					}
					System.out.println();
				}

				//Check for winner
				if(arr[0][0]=='O' && arr[0][1]=='O' && arr[0][2]=='O'){
					System.out.println("Player 2 Win!");
					winner=true;
				}
				else if(arr[1][0]=='O' && arr[1][1]=='O' && arr[1][2]=='O'){
					System.out.println("Player 2 Win!");
					winner=true;
				}
				else if(arr[2][0]=='O' && arr[2][1]=='O' && arr[2][2]=='O'){
					System.out.println("Player 2 Win!");
					winner=true;
				}
				else if(arr[0][0]=='O' && arr[1][0]=='O' && arr[2][0]=='O'){
					System.out.println("Player 2 Win!");
					winner=true;
				}
				else if(arr[0][1]=='O' && arr[1][1]=='O' && arr[2][1]=='O'){
					System.out.println("Player 2 Win!");
					winner=true;
				}
				else if(arr[0][2]=='O' && arr[1][2]=='O' && arr[2][2]=='O'){
					System.out.println("Player 2 Win!");
					winner=true;
				}
				else if(arr[0][0]=='O' && arr[1][1]=='O' && arr[2][2]=='O'){
					System.out.println("Player 2 Win!");
					winner=true;
				}
				else if(arr[0][2]=='O' && arr[1][1]=='O' && arr[2][0]=='O'){
					System.out.println("Player 2 Win!");
					winner=true;
				}

				if(winner==true) break OuterLoop;

				//Check if full
				Outer:
				for(int i=0; i<=2; i++){
					for(int j=0; j<=2; j++){
						if(arr[i][j]==' '){
							full=false;
							break Outer;
						}
						else{
							full=true;
						}
					}
				}

				//Check if draw
				if(full==true && winner==false){
					System.out.println("Draw!");
					break OuterLoop;
				}

			}while(pos<1 || pos>9 || vacant==false);
		}while(full==false && winner==false);



	}
}