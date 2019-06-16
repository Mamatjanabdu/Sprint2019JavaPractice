
public class MathOperations {

	
	private double num1;
	private double num2;
	private double result;
	private char operator;
	
	public MathOperations(double num1, double num2, char operator) {
		
		this.num1 = num1;
		this.num2 = num2;
		this.operator = operator;
	
	}

	public MathOperations() {
		super();
	}

	public double getNum1() {
		return num1;
	}

	public void setNum1(double num1) {
		this.num1 = num1;
	}

	public double getNum2() {
		return num2;
	}

	public void setNum2(double num2) {
		this.num2 = num2;
	}

	public double getResult() {
		return result;
	}

	

	public double getOperator() {
		return operator;
	}

	public void setOperator(char operator) {
		this.operator = operator;
	}

	
	public String toString() {
		return "MathOperations [num1=" + num1 + ", num2=" + num2 + ", result=" + result + ", operator=" + operator
				+ "]";
	}
	
	public void calculate() {
		switch (this.operator) {
		case '+':
			this.result = this.num1 + this.num2;
			break;
		case '-':
			this.result = this.num1 - this.num2;
			break;
		case '*':
			this.result = this.num1 * this.num2;
			break;
		case '/':
			this.result = this.num1 / this.num2;
			break;
		case '%':
			this.result = this.num1 % this.num2;
			break;
		default:
			System.out.println("Invalid operation!");
		}
	}

	
	
	
	
	
	
	
}
