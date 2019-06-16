package day54;

import java.util.Arrays;

class data1{

	static double num2=100;


}

public class initilizerPractice {

	int a;
	String b;
	boolean c;
	double d;

	static {
		// a=500;
		initilizerPractice  obj5 = new initilizerPractice();
				obj5.a=500;
System.out.println(obj5.a);
System.out.println(obj5.b);
	}

//	{
//		a=30;
//		b="cybertek";
//		c= 10 > 9;
//		d = 100_11;
//		
//		// 100, 000, 0000,09000
//	}


	static int a1;
	static String b1;




	 {

		int a1=100;
		String b1="Cybertek";

	}


	public static void main(String[] args) {
		data1 obj=new data1();
		System.out.println( obj.num2 );  // static should not be called through object
		System.out.println("-------------------");
		System.out.println(data1.num2);   



		System.out.println(a1+"  "+b1);

		initilizerPractice   obj4 = new initilizerPractice();
			System.out.println(obj4.a);
			System.out.println("-------------");

		initilizerPractice   obj1 = new initilizerPractice();
		
		System.out.println( obj1.a );
		System.out.println( obj1.b );
		System.out.println( obj1.c );
		System.out.println( obj1.d );



	}





}