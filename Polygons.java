
import java.util.Scanner;

public class Polygons{
	static int getLengthOfSide(){
	int s;
	System.out.println("Enter the length of side(s) of a regular polygon");
	s = sc.nextInt();
	return s;
 }
	static int getNumberOfSide(){
	int n;
	System.out.println("Enter the number of side(s) of a regular polygon");
	n = sc.nextInt();
	return n;	
}
	static int getApothem(){
	int r;
	System.out.println("Enter the apothem of the regular polygon");
	r = sc.nextInt();
	return r;	
	}
 static int perimeter(int s){
	return (n*s);
 }	
 static int area(int s){
	int perimeter = 0;
	return ((r*perimeter)/2);
 }
 static Scanner sc = new Scanner(System.in);
 public static void main (String ... args){
	int s, n, r;
	s=getLengthOfSide();
	n=getNumberOfSide();
	r=getApothem();
	
	System.out.printf("The perimeter of the of the regular polygon is: ", perimeter(s));
	System.out.printf("The area of the of the regular polygon is: ", area(s));
 }
 
}