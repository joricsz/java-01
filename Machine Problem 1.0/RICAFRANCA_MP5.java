
import java.util.Scanner;
public class RICAFRANCA_MP5{
	public static void main(String ... args){
	Scanner sc = new Scanner(System.in);
	int num = 0;
	int days = 0;
	int tabs = 0;
	int day = 1;
	
	System.out.print("Enter month [1-12]: "); //1
	num = sc.nextInt();
	
	System.out.println();
	
	if(num<1 || num>12){
		System.out.println("Invalid Month");
	}
	else{
		switch(num){
			case 1:
				System.out.println("January 2021"); 
				days = 31;
				// month starts at friday
				tabs = 5;
				break;
				
			case 2:
				System.out.println("February 2021");
				days = 28;
				// month starts at monday
				tabs = 1;
				break;
				
			case 3:
				System.out.println("March 2021"); 
				days = 31;
				// month starts at monday
				tabs = 1;
				break;
				
			case 4:
				System.out.println("April 2021");
				days = 30;
				// month starts at thursday	
				tabs = 4;
				break;
				
			case 5:
				System.out.println("May 2021");
				days = 31;
				// month starts at saturday
				tabs = 6;
				break;
				
			case 6:
				System.out.println("June 2021");
				days = 30;
				// month start at tuesday
				tabs = 2;
				break;
			
			case 7:
				System.out.println("July 2021"); 
				days = 31;
				// month starts at thursday
				tabs = 4;
				break;
			
			case 8:
				System.out.println("August 2021"); 
				days = 31;
				//month starts at sunday
				tabs = 0;
				break;
			
			case 9:
				System.out.println("September 2021"); 
				days = 30;
				//month starts at wednesday
				tabs = 3;
				break;
				
			case 10:
				System.out.println("October 2021"); 
				days = 31;
				//month starts at friday
				tabs = 5;
				break;
			
			case 11:
				System.out.println("November 2021"); 
				days = 30;
				//month starts at monday
				tabs = 1;
				break;
			
			case 12:
				System.out.println("December 2021");
				days = 31;
				//month starts at wednesday
				tabs = 3;
		}
		// header of the calendar
		System.out.println("Sun	"+"Mon	" +"Tue	" +"Wed	" +"Thu	" + "Fri	" +"Sat	");
		
		//days = 31
		//tabs = 0
		outerLoop: 
		for(int i=1;i<=days;i++){ // i=6
			for(int j=1;j<=7;j++){ // j=1
				
				if(tabs==1){
					System.out.print("	");
					tabs = 0;
					j+=1;
				}
				if(tabs==2){
					System.out.print("		");
					tabs = 0;
					j+=2;
				}
				if(tabs==3){
					System.out.print("			");
					tabs = 0;
					j+=3;
				}	
				if(tabs==4){
					System.out.print("				");
					tabs = 0;
					j+=4;
				}	
				if(tabs==5){
					System.out.print("					");
					tabs = 0;
					j+=5;
				}	
				if(tabs==6){
					System.out.print("						");
					tabs = 0;
					j+=6;
				}	
					
				System.out.print(day + "	");
				if(day==days){
					break outerLoop;
				}
				day += 1;
			}
			System.out.println();
		}
	}
  }
  //day = 31
  /**
	Sun	Mon	Tue	Wed	Thu	Fri	Sat
						1	2
	3	4	5	6	7	8	9	
	10	11	12	13	14	15	16
	17	18	19	20	21	22	23
	24	25	26	27	28	29	30
	31	
	
  */	
}