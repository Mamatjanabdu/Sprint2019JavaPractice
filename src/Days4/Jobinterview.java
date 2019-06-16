package Days4;

public class Jobinterview {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.out.println("what is java");
		
		
		/*
		 in order to just run java application what do we need?
		JRE--
		
		 in order to just develop java application what do we do ?
		
		 JDK
		
		 JDK has JRE 
* 
* Variable 
		 */
		
		int count;//declaring variable
		count = 10 ; //assignment , literal value
		int score = 100; // declaring and assigning in one statement
		
		int x, y, z ;
		x =10 ;
		y = 20;
		z=x+y;
		
		// once you use one variable name, you can not reuse that variavle 
		// in same block
		score = 200;  // reassignment
		
		/*
		 * Naming variavle
		 * is this a valid name for a variable
		 * int abc;----good
		 * int 123;----bad
		 * int a123;----good
		 * int _a;------good
		 * int $; -----good , but recomended
		 * int a-b; -----bad
		 * int _123;-----good --not recomended
		 * 
		 * 
		 * Rule: 
		 * 
		 * you can use a-z letters A-Z 
		 * numbers, ( just don't start with number)
		 * only 2 special character_$
		 * 57 Reserved Key Word should be avoided;
		 * 
		 * 
		 * Guideline for class rule :
		 *  for more than one word, use camel case gameScore; 
		 *  int countOfonlineStudent = 300
		 *  It shodl always start with Uppercase, the rest can lower case
		 *  if you have multiple word, it can be camecace
		 *  Car, Boat, ComputerMonotor
		 *  
		 *  Package naming
		 *  reserved keyword should be alwasy asovided
		 *  it shoud be whole word without space
		 * 
		 * Create 4 different variable with type byte, int, short, long, and
		 * assign values
		 * 
		 * print them out.
		 * and try to go over the range you saw 
		 * 
		 * Byte = 120;
		 * short = 30000;
		 * int = 300000;
		 * long = 2899999L;
		 * 
		 * 
		 * 
		 * 
		 * 
		 */
				
		
		System.out.println(z);
		System.out.println(score);
		
		
		
	}

}
