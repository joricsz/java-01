import java.util.*;

public class TicTacToe1{
	
	public static void main (String args[]){
		
		char arr[][] = {{'1','2','3'},
						{'4','5','6'},
						{'7','8','9'}};
		
		boolean winner;
		boolean vacant=false;
		boolean full=false;
		
		display(arr);
		clear(arr);
		
		do{
		
			do{
				int position = getPosition();
				vacant = AssignToArray(position, arr, 'X');	
				if (vacant==false){
					System.out.println("The position is no longer empty. Try again.");
				}
			}while(vacant==false);
			
			display(arr);
			winner = checkForWinner(arr);
			if(winner == true){
				break;
			}
			full = checkIfFull(arr);
			if (full == true){
				System.out.println("Draw");
				break;
			}
			//Get AI attempt
			do{
				int position = getRandomPos();
				vacant = AssignToArray(position, arr, 'O');	
				if (vacant==false){
					System.out.println("The position is no longer empty. Try again.");
				}
			}while(vacant==false);
			
			display(arr);
			winner = checkForWinner(arr);
			if(winner == true){
				break;
			}
			full = checkIfFull(arr);
			if (full == true){
				System.out.println("Draw");
				break;
			}
		
		}while(winner==false && full==false);
	}	
	
	//Check if Full
	public static boolean checkIfFull(char [][] a){
		boolean f = true;
		for(int row = 0; row<=2 ; row++){
			for(int col = 0; col <=2; col++){
				if(a[row][col]==' '){
					f = false;
				}
			}
		}
		return f;
	}
	//Check For Winner
	public static boolean checkForWinner(char [][]a){
		boolean r;
		if(a[0][0]=='X' && a[0][1]=='X' && a[0][2]=='X' ){
			System.out.println("Player Win");
			r = true;
		}
		else if(a[1][0]=='X' && a[1][1]=='X' && a[1][2]=='X' ){
			System.out.println("Player Win");
			r = true;
		}
		else if(a[2][0]=='X' && a[2][1]=='X' && a[2][2]=='X' ){
			System.out.println("Player Win");
			r = true;
		}
		else if(a[0][0]=='X' && a[1][0]=='X' && a[2][0]=='X' ){
			System.out.println("Player Win");
			r = true;
		}
		else if(a[0][1]=='X' && a[1][1]=='X' && a[2][1]=='X' ){
			System.out.println("Player Win");
			r = true;
		}
		else if(a[0][2]=='X' && a[1][2]=='X' && a[2][2]=='X' ){
			System.out.println("Player Win");
			r = true;
		}
		else if(a[0][0]=='X' && a[1][1]=='X' && a[2][2]=='X' ){
			System.out.println("Player Win");
			r = true;
		}
		else if(a[0][2]=='X' && a[1][1]=='X' && a[2][0]=='X' ){
			System.out.println("Player Win");
			r = true;
		}
		else if(a[0][0]=='O' && a[0][1]=='O' && a[0][2]=='O' ){
			System.out.println("AI Win");
			r = true;
		}
		else if(a[1][0]=='O' && a[1][1]=='O' && a[1][2]=='O' ){
			System.out.println("AI Win");
			r = true;
		}
		else if(a[2][0]=='O' && a[2][1]=='O' && a[2][2]=='O' ){
			System.out.println("AI Win");
			r = true;
		}
		else if(a[0][0]=='O' && a[1][0]=='O' && a[2][0]=='O' ){
			System.out.println("AI Win");
			r = true;
		}
		else if(a[0][1]=='O' && a[1][1]=='O' && a[2][1]=='O' ){
			System.out.println("AI Win");
			r = true;
		}
		else if(a[0][2]=='O' && a[1][2]=='O' && a[2][2]=='O' ){
			System.out.println("AI Win");
			r = true;
		}
		else if(a[0][0]=='O' && a[1][1]=='O' && a[2][2]=='O' ){
			System.out.println("AI Win");
			r = true;
		}
		else if(a[0][2]=='O' && a[1][1]=='O' && a[2][0]=='O' ){
			System.out.println("AI Win");
			r = true;
		}
		else{
			r = false;
		}
		return r;
	}

	
	
	//Clear the array
	public static void clear(char[][] a){
		for(int row=0;row<=2;row++){
			for(int col=0;col<=2;col++){
				a[row][col]=' ';
			}
		}
	}
	
	//Get the position
	public static int getPosition(){
		int p=0;
		do{
			Scanner sc = new Scanner(System.in);
			System.out.print("Enter position: ");
			p=sc.nextInt();
		}while(p<1 || p>9);
		return p;
	}
	
	//Get the position
	public static int getRandomPos(){
		int p=0;
		do{
			p = (int) Math.round(Math.random()*9);
			System.out.print("Enter Random position: " + p);
			
		}while(p<1 || p>9);
		return p;
	}
	
	//Assign to array
	public static boolean AssignToArray(int pos, char[][] a, char mark){
		int rowPos=0, colPos=0;
		switch(pos){
			case 1: 
					rowPos=0; 
					colPos=0; 
					break;
			case 2: 
					rowPos=0; 
					colPos=1; 
					break;		
			case 3: 
					rowPos=0; 
					colPos=2; 
					break;
			case 4: 
					rowPos=1; 
					colPos=0; 
					break;
			case 5: 
					rowPos=1; 
					colPos=1; 
					break;
			case 6: 
					rowPos=1; 
					colPos=2; 
					break;
			case 7: 
					rowPos=2; 
					colPos=0; 
					break;
			case 8: 
					rowPos=2; 
					colPos=1; 
					break;
			case 9: 
					rowPos=2; 
					colPos=2; 
					break;
		}
		
		if(a[rowPos][colPos]=='X' || a[rowPos][colPos]=='O'){
			return false;
		}
		else{
			a[rowPos][colPos]=mark;
	
			return true;
		}

	}

	//Display the content of the array
	public static void display(char[][] a){
		System.out.println();
		System.out.println("TicTacToe");
		for(int row=0;row<=2;row++){
			for(int col=0;col<=2;col++){
				System.out.print("|"+a[row][col]+"|");
			}
			System.out.println();
		}
		System.out.println("---------");
	}	
}	