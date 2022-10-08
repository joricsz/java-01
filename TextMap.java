
public class TextMap{
	
	//Instance variables
	private int rowCnt;
	private int colCnt;
	private char defaultChar;
	private char [][] Map;
	private boolean validPosition;
	private String str = "";
	
	//Constructor
	public TextMap(int rowCnt, int colCnt, char defaultChar){
		this.rowCnt = rowCnt;
		this.colCnt = colCnt;
		this.defaultChar = defaultChar;
		Map = new char[rowCnt][colCnt];
		for(int row=0; row<rowCnt; row++){
			for(int col=0; col<colCnt; col++){
				Map[row][col] = defaultChar; 
			}
		}
	}
	
	//Getters
	public int getRowCnt(){
		return Map.length;
	}
	public int getColCnt(){
		return Map[0].length;
	}
	public boolean getPosVal(){
		return validPosition;
	}
	
	//Other methods
	public boolean isValidPosition(MapCoord coord){
		if(coord.getRow()<rowCnt && coord.getColumn()<colCnt){
			validPosition = true;
			str = "";
			return true;
		}
		str = "";
		return false;
	}
	
	public char getPos(MapCoord coord){
		if(validPosition){
			return Map[coord.getRow()][coord.getColumn()];
		}
		return defaultChar;
	}
	
	public boolean setPos(MapCoord coord, char c){
		if(validPosition==true){
			Map[coord.getRow()][coord.getColumn()] = c;
			return true;
		}
		return false;
	}
	
	public String toString(){
		for(char[] x: Map){
			for(char c: x){
				str += c;
				}
			str += "\n";
		}
		return "\n" + str;
	}
}
