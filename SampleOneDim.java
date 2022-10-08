import java.util.Scanner;
public class SampleOneDim{
	public static void main (String ... args){
		Scanner sc = new Scanner(System.in);
		int grade[] = new int[10];
		int num, sum=0;
		int temp;
		boolean swap=true;
		do{
			System.out.println("Enter an integer from [1-10]");
			num = sc.nextInt();
			
		}while(num<0||num>10);
	

	
		//generate random number and display
		
		for(int ctr=0;ctr<num;ctr++){
			grade[ctr]= (int) Math.round(Math.random()*100);
			System.out.println(grade[ctr]);
			sum+=grade[ctr];
		}
		do{
			swap=false;
			for(int i=0;i<num-1;i++){
				if(grade[i]>grade[i+1]){
					//swap
					temp=grade[i];
					grade[i]=grade[i+1];
					grade[i+1]=temp;
					swap=true;
				}	
			}	
		}while(swap==true);
	
		System.out.println("Ascending Order");
		for(int ctr=0; ctr<num;ctr++){
			System.out.println(grade[ctr]);
		}
	
		System.out.println("Descending Order");
		for(int ctr=num-1; ctr>=0;ctr--){
			System.out.println(grade[ctr]);
		}
	
		float average = sum/num;
		System.out.println("The average is " + average);
		System.out.println("The size of the array is " + grade.length);
	}
}