
public class MathEquation {

	private double oprand1;
	private double oprand2;
	private double result;
	private char operator;
	
	
	
	public MathEquation(double oprand1, double oprand2, char operator) {
		
		this.oprand1 = oprand1;
		this.oprand2 = oprand2;
		
		this.operator = operator;
	}
	
	
	
	public MathEquation(double oprand1) {
		
		this.oprand1 = oprand1;
	}


	

	public MathEquation() {
		
	}

	
	
	public void calculate() {
		result= oprand1 + oprand2;
		
		switch (operator) {
		case '+':
			result=oprand1 + oprand2;
		     break;
		     
		case '-':
			result=oprand1 - oprand2;
		     break;
		case '*':
			result=oprand1 * oprand2;
		     break;
		case '/':
			result=oprand1 / oprand2;
		     break;
		       
		}
	}


	
	public String toString() {
		return "MathEquation [oprand1=" + oprand1 + ", oprand2=" + oprand2 + ", result=" + result + ", operator="
				+ operator + "]";
	}


	
	
	

	public double getOprand1() {
		return oprand1;
	}
	public void setOprand1(double oprand1) {
		this.oprand1 = oprand1;
	}
	public double getOprand2() {
		return oprand2;
	}
	public void setOprand2(double oprand2) {
		this.oprand2 = oprand2;
	}
	public double getResult() {
		return result;
	}
	public void setResult(double result) {
		this.result = result;
	}
//	public char getOperator() {
//		return operator;
//	}
	public void setOperator(char operator) {
		this.operator = operator;
	}
	
	public void main () {
		System.out.println();
		
	}
	
	
	
	
	
}
