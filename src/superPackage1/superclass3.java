package superPackage1;or,

import java.util.Scanner;

public class superclass3 {

	public static void main(String[] args) {

	Scanner scan = new Scanner(System.in);
	String word1 = scan.next();
             String word2 = scan.next(); 
	
     
       int count1=word1.length();
	    int count2=word2.length();
	    
	    if (count1==3&& count2==3) {
      	  System.out.println(word1.charAt(0)+""+word2.charAt(0)+""+word1.charAt(1) 
      	  +""+word2.charAt(1)+"" +	word1.charAt(3)+""+word2.charAt(3));                  
        }













		// System.out.println(word.substring(1, count-1));

		// System.out.println(word.charAt(0));

//		if (length % 2 != 0 && length >= 5) {
//			System.out.println(word.substring(midPoint - 1, midPoint + 2));
//
//		} else {
//			System.out.println("invalid");
//		}

		//
		// int length = word.length();
//		int midPoint = length / 2;
//
//		if (length % 2 != 0 && length>1) {
//			System.out.println(word.charAt(midPoint));
//		}
//		if (length == 1) {
//			System.out.println(word.charAt(0) + "" + word.charAt(0) + "" + word.charAt(0));
//		}
//		if (length % 2 == 0 && length!=2) {
//
//			//System.out.println(midPoint);
//			
//			//System.out.println( name2.substring(midPoint,count) );
//			
//			System.out.println(word.substring(midPoint-1, midPoint+1));
//		}
//
//		if (length==2) {
//			System.out.println(word.substring(0,2)+""+word.substring(0,2));
//		}
//		

	}

}
