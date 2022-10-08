
public class MapCoord{
	
	//instance variables
	private int r;
	private int c;
	
	//Constructor
	public MapCoord(int r, int c){
		this.r = r;
		this.c = c;
	}
	
	//Getters
	public int getRow(){
		return r;
	}
	public int getColumn(){
		return c;
	}
	
	//Other method
	public String toString(){
		return "(" + r + "," + c + ")";
	}
}