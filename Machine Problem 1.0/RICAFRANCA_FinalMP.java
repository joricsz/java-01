
public class RICAFRANCA_FinalMP{
	public static void main(String...args){
		int Player1 = 0;
		int Player2 = 0;
		int win1 = 0;
		int win2 = 0;
		int numRound = 0;
		int lose1 = 0;
		int lose2 = 0;
		int draw1 = 0;
		int draw2 = 0;
		char scoreBoard[][] = new char[10][2];
		
		for(int i=1;i<=10;i++){
			do{
			Player1 = (int) Math.round(Math.random()*100); 
			}while(Player1<1||Player1>3);
			do{
			Player2 = (int) Math.round(Math.random()*100); 
			}while(Player2<1||Player2>3);
			
			if(win1>=5||win2>=5){
				break;
			}
			System.out.println("---------------------------------------");
			System.out.println("Round: " + i);
			System.out.println("Player 1: " + Attempt(Player1));
			System.out.println("Player 2: " + Attempt(Player2));
			
			if(Attempt(Player1)==Attempt(Player2)){
				System.out.println("Result of round " + i + " is Draw!");
				scoreBoard[-1+i][0] = 'D';
				scoreBoard[-1+i][1] = 'D';
				draw1 += 1;
				draw2 += 1;
				numRound += 1;
				continue;
			}
			
			if(Attempt(Player1)=="Rock"){
				if(Attempt(Player2)=="Scissors"){
					System.out.println("Result of round " + i + " Player 1 win!");
					scoreBoard[-1+i][0] = 'W';
					scoreBoard[-1+i][1] = 'L';
					win1 += 1;
					lose2 += 1;
					numRound += 1;
					continue;
				}
				System.out.println("Result of round " + i + " Player 2 win!");
				scoreBoard[-1+i][0] = 'L';
				scoreBoard[-1+i][1] = 'W';
				win2 += 1;
				lose1 += 1;
				numRound += 1;
				continue;
			}
			if(Attempt(Player1)=="Scissors"){
				if(Attempt(Player2)=="Paper"){
					System.out.println("Result of round " + i + " Player 1 win!");
					scoreBoard[-1+i][0] = 'W';
					scoreBoard[-1+i][1] = 'L';
					win1 += 1;
					lose2 += 1;
					numRound += 1;
					continue;
				}
				System.out.println("Result of round " + i + " Player 2 win!");
				scoreBoard[-1+i][0] = 'L';
				scoreBoard[-1+i][1] = 'W';
				win2 += 1;
				lose1 += 1;
				numRound += 1;
				continue;
			}
			else if(Attempt(Player1)=="Paper"){
				if(Attempt(Player2)=="Rock"){
					System.out.println("Result of round " + i + " Player 1 win!");
					scoreBoard[-1+i][0] = 'W';
					scoreBoard[-1+i][1] = 'L';
					win1 += 1;
					lose2 += 1;
					numRound += 1;
					continue;
				}
				System.out.println("Result of round " + i + " Player 2 win!");
				scoreBoard[-1+i][0] = 'L';
				scoreBoard[-1+i][1] = 'W';
				win2 += 1;
				lose1 += 1;
				numRound += 1;
				continue;
			}
		}
			
		System.out.println("=======================================");
		System.out.println();
		System.out.println("	    Score Board");
		System.out.println("\tPlayer 1   Player 2");
		int round=1;
		for(int i=0;i<numRound;i++){
			for(int j=0;j<1;j++){
				System.out.print("Round " + round + "     ");
				System.out.print(scoreBoard[i][j] + "\t" + "     " + scoreBoard[i][j+1]);
				round += 1;
			}
			System.out.println();
		}
		System.out.println();
		System.out.println("Player 1: W: " + win1 + "\tL: " + lose1 + "\tD: " + draw1);
		System.out.println("Player 2: W: " + win2 + "\tL: " + lose2 + "\tD: " + draw2);
		System.out.println();
		if(win1==win2){
			System.out.println("It's a draw!");
		}
		else if(win1>win2){
			System.out.println("Player 1 is the winner!");
		}
		else{
			System.out.println("Player 2 is the winner!");
		}
		System.out.println();
		System.out.println("=======================================");
	}	
	
	public static String Attempt(int a){
		String event = "";
		switch(a){
		case 1:
			event = "Rock"; break;
		case 2:
			event = "Scissors"; break;
		case 3:
			event = "Paper";
		}
		return event;
	}
}