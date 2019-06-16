import java.util.Arrays;

public class mathCalculation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MathEquation math1= new MathEquation (120, 10, '+');
		MathEquation math3= new MathEquation (12, 10, '*');
		MathEquation math2= new MathEquation (120, 11, '/');
		
		
		MathEquation [] arr= {math1, math2, math3};
		
		for (MathEquation each : arr) {
			each.calculate();
			System.out.println(each.getResult());
			System.out.println("______________________");
			System.out.println(each);
		}
		System.out.println("*************************");
		System.out.println(Arrays.toString ( arr));
		
		
		
		
	}

}
