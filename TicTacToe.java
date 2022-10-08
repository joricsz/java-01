
//two dimensional array to hold the attempt of the players.
//Scanner to get the position of the attempt of the players
//Conditional statements to test for: winner, tie, full, may existing mark on the position, valid position
//Marking: X and O
//Toss coin
//loop for next turn


//Declare the array and variables
//Accept attempt from player 1
//Check if there is an existing mark on the position
//if vacant, then mark the position
//Display the board
//Check for winner
//check if full
//check if draw
//Accept attempt from player 2
//Check if there is an existing mark on the position
//if vacant, then mark the position
//Display the board
//Check for winner
//check if full
//check if draw

import java.util.Scanner;
public class TicTacToe{
	public static void main(String...args){
		Scanner sc = new Scanner(System.in);
		
		//Declare variables
		char arr[][] = {{' ', ' ', ' '},{' ', ' ', ' '},{' ', ' ', ' '}};
		int pos, pRow=0, pCol=0;
		boolean vacant = true;
		boolean winner = false, full=false;
		
		//display board w/ number
		int ctr=1;
		for(int i=1;i<=3;i++){
			for(int j=1;j<=3;j++){	
				System.out.print("|"+ctr+"|");
				ctr++;
			}
			System.out.println();
		}
		OuterLoop:
		do{
				//Accept attempt from player 1
			do{
				System.out.print("Enter position for Player 1 [1-9]: ");
				pos = sc.nextInt();
				
				switch(pos){
					case 1: pRow=0; pCol=0; break;
					case 2: pRow=0; pCol=1; break;
					case 3: pRow=0; pCol=2; break;
					case 4: pRow=1; pCol=0; break;
					case 5: pRow=1; pCol=1; break;
					case 6: pRow=1; pCol=2; break;
					case 7: pRow=2; pCol=0; break;
					case 8: pRow=2; pCol=1; break;
					case 9: pRow=2; pCol=2;
				}
				if(arr[pRow][pCol]=='X'||arr[pRow][pCol]=='0'){
					vacant=false;
				}
				else{
					vacant=true;
				}
				//if vacant, then mark the position
				arr[pRow][pCol]='X';
				
			//display the board
			for(int i=0;i<=2;i++){
				for(int j=0;j<=2;j++){	
					System.out.print("|"+arr[i][j]+"|");
					ctr++;
				}
				System.out.println();
			}
			
			//check for winner
			if(arr[0][0]=='X' && arr[0][1]=='X' && arr[0][2]=='X'){
				System.out.println("Player 1 Wins!");
				winner=true;
			}
			if(arr[1][0]=='X' && arr[1][1]=='X' && arr[1][2]=='X'){
				System.out.println("Player 1 Wins!");
				winner=true;
			}
			if(arr[2][0]=='X' && arr[2][1]=='X' && arr[2][2]=='X'){
				System.out.println("Player 1 Wins!");
				winner=true;
			}
			if(arr[0][0]=='X' && arr[1][1]=='X' && arr[2][2]=='X'){
				System.out.println("Player 1 Wins!");
				winner=true;
			}
			if(arr[2][0]=='X' && arr[1][1]=='X' && arr[0][2]=='X'){
				System.out.println("Player 1 Wins!");
				winner=true;
			}
			if(arr[0][0]=='X' && arr[1][0]=='X' && arr[2][0]=='X'){
				System.out.println("Player 1 Wins!");
				winner=true;
			}
			if(arr[0][1]=='X' && arr[1][1]=='X' && arr[2][1]=='X'){
				System.out.println("Player 1 Wins!");
				winner=true;
			}
			if(arr[0][2]=='X' && arr[1][2]=='X' && arr[2][2]=='X'){
				System.out.println("Player 1 Wins!");
				winner=true;
			}
			
			if (winner==true) break OuterLoop;
			//check if full
			outer:
			for(int i=0;i<=2;i++){
				for(int j=0;j<=2;j++){	
					if(arr[i][j]==' '){
						full=false;
						break outer;
					}
					else{
						full=true;
					}
				}
			}
			
			if(full==true && winner==false){
				System.out.println("Draw!");
				break OuterLoop;
			}
			
		}while((pos<1 || pos>9) && vacant==false);

			//Accept attempt from player 2
			do{
				System.out.print("Enter position for Player 2 [1-9]: ");
				pos = sc.nextInt();
				
				//
				switch(pos){
					case 1: pRow=0; pCol=0; break;
					case 2: pRow=0; pCol=1; break;
					case 3: pRow=0; pCol=2; break;
					case 4: pRow=1; pCol=0; break;
					case 5: pRow=1; pCol=1; break;
					case 6: pRow=1; pCol=2; break;
					case 7: pRow=2; pCol=0; break;
					case 8: pRow=2; pCol=1; break;
					case 9: pRow=2; pCol=2;
				}
				if(arr[pRow][pCol]=='X'||arr[pRow][pCol]=='0'){
					vacant=false;
				}
				else{
					//if vacant, then mark the position
					arr[pRow][pCol]='0';
					vacant=true;
				}
				
			//display the board
			for(int i=0;i<=2;i++){
				for(int j=0;j<=2;j++){	
					System.out.print("|"+arr[i][j]+"|");
				}
				System.out.println();
			}
			
			//Player 2
			if(arr[0][0]=='0' && arr[0][1]=='0' && arr[0][2]=='0'){
				System.out.println("Player 2 Wins!");
				winner=true;
			}
			if(arr[1][0]=='0' && arr[1][1]=='0' && arr[1][2]=='0'){
				System.out.println("Player 2 Wins!");
				winner=true;
			}
			if(arr[2][0]=='0' && arr[2][1]=='0' && arr[2][2]=='0'){
				System.out.println("Player 2 Wins!");
				winner=true;
			}
			if(arr[0][0]=='0' && arr[1][1]=='0' && arr[1][2]=='0'){
				System.out.println("Player 2 Wins!");
				winner=true;
			}
			if(arr[2][0]=='0' && arr[1][1]=='0' && arr[0][2]=='0'){
				System.out.println("Player 2 Wins!");
				winner=true;
			}
			if(arr[0][0]=='0' && arr[1][0]=='0' && arr[2][0]=='0'){
				System.out.println("Player 2 Wins!");
				winner=true;
			}
			if(arr[0][1]=='0' && arr[1][1]=='0' && arr[2][1]=='0'){
				System.out.println("Player 2 Wins!");
				winner=true;
			}
			if(arr[0][2]=='0' && arr[1][2]=='0' && arr[2][2]=='0'){
				System.out.println("Player 2 Wins!");
				winner=true;
			}
			
			if (winner==true) break OuterLoop;
			//check if full
			OuterX:
			for(int i=0;i<=2;i++){
				for(int j=0;j<=2;j++){	
					if(arr[i][j]==' '){
						full=false;
						break OuterX;
					}
					else{
						full=true;
					}
				}
			}
			//checks is draw
			if(full==true && winner==false){
				System.out.println("Draw!");
				break OuterLoop;
				}
			}while(pos<1 || pos>9 || vacant==false);
		}while(winner==false && full==false);
	}
}