
public class SampleOperators{
	public static void main (String ... args){
		int a=8, b=15, c=20, d=22;
	
		System.out.println("a = 8, b = 15, c = 20, d = 22");
		System.out.println("a + b = " + (a + b)); //a + b = 815
		System.out.println("a - b = " + (a - b));
		System.out.println("a * b = " + (a * b));
		System.out.println("a / b = " + ((float)a / (float)b));
		System.out.println("a % b = " + (a % b)); // 8 because 8/15 = 0, and 8 would be the answer
		System.out.println("c % d = " + (c % d));
		System.out.println("b % a = " + (b % a));
		System.out.println("d % c = " + (d % c));
		
		//increment and decrement
			//post increment - execute statement (print) b4 the operation
		System.out.println("a++ = " + (a++)); 	// a++ is a = a + 1 // the display on screen is 8, but actual value is 9
		System.out.println("Actual value of a = " + (a)); 	// Current value of a = 9
		
			// pre increment - execute the operation first, then the statement (print)
		System.out.println("++a = " + (++a)); 	// Current value and display value is 10
		System.out.println("Actual value of a = " + (a)); 	// Current value of a = 10
		
			//post increment
		System.out.println("b-- = " + (b--)); 	// b-- is b = b - 1 // The display is 15 but the actual value is 14
		System.out.println("Actual value of b = " + (b));
		System.out.println("--b = " + (--b));
		System.out.println("Actual value of b = " + (b));
		
		System.out.println("b +=3 " + (b+=3)); //16
		
		//Relational Operators
		System.out.println(" is a == b? " + (a == b));
		System.out.println(" is a == 10? " + (a == 10)); //a == 1
		System.out.println(" is a < b? " + (a < b));
		System.out.println(" is a > b? " + (a > b));
		System.out.println(" is a <= b? " + (a <= b));
		System.out.println(" is a != b? " + (a != b));
		System.out.println(" is a != 10? " + (a != 10));
		
		
		//Logical Operators
		System.out.println(a<b);
		System.out.println(!(a<b));
		
		int ageA = 15, ageB = 20;
		boolean appointment = true, noAppointment = false;
		
		System.out.println(ageA>=18);
		System.out.println(ageB>=18);
		
		//18 above w/ appointment
		System.out.println(ageB>=18 && appointment);
		System.out.println(ageB>=18 && noAppointment);
		System.out.println(ageA>=18 && appointment);
		
		//18 above, walk in is allowed
		System.out.println(ageB>=18 || appointment);
		System.out.println(ageB>=18 || noAppointment);
		System.out.println(ageA>=18 || noAppointment);
		
		
		//Bitwise Operator
		int x = 81, y = 27; //converted into binary before operations are executed
		System.out.println("x & y = " + (x&y));
		System.out.println("x | y = " + (x|y));
		System.out.println("x ^ y = " + (x^y));
		System.out.println("~ x = " + (~x));
		System.out.println("x << 2 = " + (x<<2));
		System.out.println("y >> 3 = " + (y>>3)); //signed (+ - ) shift right, if negative 1 is inserted instead of 1
		System.out.println("x >>> 3 = " + (x>>>3)); //unsigned shift right whether positive or negative it inserts 0
		
		//Assignment Operators
		System.out.println("x + y = " + (x + y));
		System.out.println("x = " + x);
		System.out.println("x += y = " + (x += y)); //x = x + y
		System.out.println("x = " + x);
		System.out.println("x += 3 = " + (x += 3)); 
		System.out.println("x =+ 3 = " + (x =+ 3)); // x = +3
		System.out.println("x = " + x);
		int z = -y;
		System.out.println("z = " + z);
		
		int num = 1, num2 = 2; 
		int result;
		
		result = num==1?50:100;
		System.out.println("result = " + result);
		result = num2==1?50:100;
		System.out.println("result = " + result);

		int grade1 = 80;
		String remarks;
		remarks = (grade1 >= 60)?"Passed":"Failed";
		System.out.println("remarks = " + remarks);
			
		int grade2 = 59;
		remarks = grade2 >= 60?"Passed":"Failed";
		System.out.println("remarks = " + remarks);
		
		System.out.println(243%100/5);
		System.out.println(2*3/12*8/4);
		System.out.println(5+3/2+3.7);
		
		int var1 = 5, var2 = 1, var3 = 4;
		System.out.println(var1<=3||var2<5&&var1>=4);
		
		System.out.println(var1!=2&&var2!=var3||var1+5*var2>2-5*var2/4);
		
		System.out.println((var1<=-2)&&b>=c&&c-2!=4);
		
		int varA = 2, varB = 3, varC = 2;
		varB = 2*varC++ - varA++; //21
		varA *= 2 + varB + varC; // 2
		/*
		System.out.println(varA);
		System.out.println(varB);
		System.out.println(varC);
		System.out.println(varA);
		System.out.println(varA*0.2+varC);
		System.out.println(Math.ceil(varA*0.2+varC));
		System.out.println(--varA/2*varB++);
		System.out.println(varA/10/0.135);
		System.out.println(Math.floor(varA/10/0.135));
		System.out.println(varB);
		System.out.println(Math.floor(varA/10/0.135)*varB+varC);
		*/
		
		varC=(int)(Math.ceil(varA*0.2+varC)- --varA/2*varB++ +Math.floor(varA/10/0.135)*varB+varC);
		System.out.println("varA = " +varA + "\nvarB = "+varB + "\nvarC = " + varC);
		
		
		
		
		
		
		
		
		
	}
}

