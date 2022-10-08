
public class RICAFRANCA{
	public static void main(String ... args){
	
	//cigarParty
	cigarParty(64, true);
	System.out.println(cigarParty(64, true));
	
	//dateFashion
	dateFashion(2,8);	
	System.out.println(dateFashion(2,8));
	
	//squirrelPlay
	squirrelPlay(90,false);
	System.out.println(squirrelPlay(90,false));
	
	//caughtSpeeding
	caughtSpeeding(65, true);
	System.out.println(caughtSpeeding(65, true));
	
	//sortaSum
	sortaSum(10,9);
	System.out.println(sortaSum(10,9));
	
	//alarmClock
	alarmClock(6,false);
	System.out.println(alarmClock(6,false));
	
	//love6
	love6(1,7);
	System.out.println(love6(1,7));
	
	//in1to10
	in1To10(5,false);
	System.out.println(in1To10(5,false));
	
	//specialEleven
	specialEleven(111);
	System.out.println(specialEleven(111));
	
	//more20
	more20(222);
	System.out.println(more20(222));
	
	//old35
	old35(15);
	System.out.println(old35(15));
	
	//less20
	less20(99);
	System.out.println(less20(99));
	
	//nearTen
	nearTen(1611);
	System.out.println(nearTen(1611));
	
	//teenSum
	teenSum(19,0);
	System.out.println(teenSum(19,0));
	
	//answerCell
	answerCell(true,false,false);
	System.out.println(answerCell(true,false,false));
	
	//teaParty
	teaParty(6,12);
	System.out.println(teaParty(6,12));
	
	//fizzString
	fizzString("fizzb");
	System.out.println(fizzString("fizzb"));
	
	//fizzString2
	fizzString2(45);
	System.out.println(fizzString2(45));
	
	//twoAsOne
	twoAsOne(1,2,3);
	System.out.println(twoAsOne(1,2,3));
	
	//inOrder
	inOrder(1,2,3,false);
	System.out.println(inOrder(1,2,3,false));
	
	//inOrderEqual
	inOrderEqual(2,5,11,false);
	System.out.println(inOrderEqual(2,5,11,false));
	
	//lastDigit
	lastDigit(3,13,23);
	System.out.println(lastDigit(3,13,23));
	
	//lessBy10
	lessBy10(11,1,21);
	System.out.println(lessBy10(11,1,21));
	
	}

	static boolean cigarParty(int cigars, boolean isWeekend) {
	if (isWeekend == true && cigars >= 40){
		return true;
	}
	return (cigars >= 40 && cigars <= 60);
	}
	
	static int dateFashion(int you, int date) {
	if (you <= 2 || date <= 2){
		return 0;
		}
	else if (you >= 8 || date >= 8 ){
		return 2;
		}
	else
		return 1;
	}
	
	static boolean squirrelPlay(int temp, boolean isSummer) {
	if (isSummer == true && temp >= 60 && temp <= 100){
		return true;  
		}
		return (temp >= 60 && temp <= 90);
	}
	
	static int caughtSpeeding(int speed, boolean isBirthday){
	if (isBirthday == true){
		if(speed <= 65){
			return 0;
			}
		else if (speed >= 66 && speed <= 85){
			return 1;
			}
		else if (speed >= 86){
			return 2;
			}
		}
	else if (isBirthday == false){
		if(speed <= 60){
			return 0;
			}
		else if (speed >= 61 && speed <= 80){
			return 1;
			}
		}
	return 2;
  } 
	
	static int sortaSum(int a, int b){ 
	int sum = a+b;
		if (sum >= 10 && sum <= 19){
			return 20;
		}
	return sum;
	}

	static String alarmClock(int day, boolean vacation) {
		if (vacation){
			if (day == 0 || day == 6){
				return "off";
				}
			return "10:00";
		}
		else if (day == 0 || day == 6){
			return "10:00";
			}
		return "7:00";
	}
	
	static boolean love6(int a, int b) {
	int sum = a+b;
	int difference = Math.abs(a-b);
	if (sum == 6 || difference == 6 || a == 6 || b == 6){
		return true;
	}  
	return false;
	}
	
	static boolean in1To10(int n, boolean outsideMode) {
	if(outsideMode){
		if(n<=1 || n>=10){
			return true;
		}
		return false;
	}
	else if (n>=1 && n<=10){
		return true;
		}
	return false;
	}
	
	static boolean specialEleven(int n) {
	int remainder = n%11;
	if(remainder == 0 || remainder == 1){
		return true;
	}
	return false;
	}
	
	static boolean more20(int n) {
	int remainder = n%20;
	if (remainder == 1 || remainder == 2){
		return true;
	}
	return false;
	}

	static boolean old35(int n) {
	int remainder3 = n%3;
	int remainder5 = n%5;
	if (remainder3 == 0 && remainder5 == 0){
		return false;
	}
	else if (remainder3 == 0 || remainder5 == 0){
		return true;
	}
	return false;
	}
	
	static boolean less20(int n) { 
	int add1 = n+2;
	int add2 = n+4;
	int add3 = n+3;
	int remainder1 = add1%20;
	int remainder2 = add2%20;
	int remainder3 = add3%20;
	if (remainder1 == 1 || remainder2 == 2 || remainder3 == 1){
		return true;
	}
	return false;
	}
	
	static boolean nearTen(int num) {
	int remainder = num%10;
	int add1 = num+2;
	int add2 = num+4;
	int add3 = num+3;
	int remainder1 = add1%10;
	int remainder2 = add2%10;
	int remainder3 = add3%10;
	if(remainder == 0){
		return true;
	}
	else if (remainder == 1 || remainder == 2){
		return true;
	}
	else if (remainder1 == 1 || remainder2 == 2 || remainder3 == 1 ){
		return true;
	}
	return false;
	}	
	
	static int teenSum(int a, int b) {
	int sum = a+b;
	if(a >= 13 & a <= 19){
		return 19;
	}
	else if (b >= 13 & b <= 19){
		return 19;
	}
	return sum;
	}
	
	static boolean answerCell(boolean isMorning, boolean isMom, boolean isAsleep) {
	if(isAsleep){
		return false;
	}
	else if (isMorning){
		if(isMom){
			return true;
		}
		return false;
	}  
	return true;
	}
	
	static int teaParty(int tea, int candy) {
	if(tea < 5 || candy < 5){
		return 0;
	}
	else if(tea >= candy*2 || candy >= tea*2){
		return 2;
	}
	else if (tea >= 5 && candy >= 5){
		return 1; 
	}
	return 0;
	}
	
	static String fizzString(String str) {
	if (str.startsWith("f") && str.endsWith("b")){
		return "FizzBuzz";
		}
	else if(str.startsWith("f")){
		return "Fizz";
	}
	else if (str.endsWith("b")){
		return "Buzz";
	}
	return str;
	}

	static String fizzString2(int n) {
	int r3 = n%3;
	int r5 = n%5;
	if(r3 == 0 && r5 == 0){
		return "FizzBuzz!";
	}
	else if(r3 == 0){
		return "Fizz!";
	}
	else if (r5 == 0){
		return "Buzz!";
	}
	return n + "!";
	}
	
	static boolean twoAsOne(int a, int b, int c) {
	if(a+b == c || b+c == a || a+c == b){
		return true;
	}
	return false;
	}
	
	static boolean inOrder(int a, int b, int c, boolean bOk) {
	if(bOk){
		if(c > b){
			return true;
		}
		return false;
	}
	else if (b > a && c > b){
		return true;
	}
	return false;
	}
	
	static boolean inOrderEqual(int a, int b, int c, boolean equalOk) {
	if (equalOk){
		if(a > b && b > c){
			return true;
		}
		else if (a==b && b==c){
			return true;
		}
		else if (a<b && b==c){
			return true;
		}
		else if (a==b && b<c){
			return true;
		}
		return false;
	}
	else if (a<b && b<c){
		return true;
	}
	return false;
	}
	
	static boolean lastDigit(int a, int b, int c) {
	int modA = a%10;
	int modB = b%10;
	int modC = c%10;
	if(modA == modB){
		return true;
	}
	else if (modB == modC){
		return true;
	}
	else if (modA == modC){
		return true;
	}
	return false;
	}
	
	static boolean lessBy10(int a, int b, int c) {
	if(a>= b+10){
		return true;
	}
	else if(a>= c+10){
		return true;
	}
	else if(b>= a+10){
		return true;
	}
	else if(b>= c+10){
		return true;
	}
	else if(c>= a+10){
		return true;
	}
	else if(c>= b+10){
		return true;
	}
	return false;
	}
	
	
	
}
	
