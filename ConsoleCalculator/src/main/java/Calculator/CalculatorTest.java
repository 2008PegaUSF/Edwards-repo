package Calculator;

public class CalculatorTest {

	
	public int calculate(String equation) {
		
		String[] parts = equation.split("\s");
		
		int num1 = Integer.parseInt(parts[0]),
				num2 = Integer.parseInt(parts[2]);
		
		char oper = parts[1].charAt(0);
		
		
		//int num2 = Integer.parseInt(parts[2]);
		
		

	//Switch to determine which operation we're using
			switch(oper){
			case '+':
				return num1 + num2;
			case '-':
				return num1 - num2;
			case '*':
				return num1 * num2;
			case '/':
				return num1 / num2;
			case '%':
				return num1 % num2;
			default:
				System.out.println("Failure to load operator!");
				return -1;
			}
			
	}
	
	
	
	
	
	
	
	
	
	/*public int addNum(int x, int y) {
		
		return x + y;
		
	}
	
	public int subtractNum(int x, int y) {
		
		return x - y;
		
	}
	
	public int multiNum(int x, int y) {
		
		return x * y;
		
	}
	
	public int diviNum(int x, int y) {
		
		return x / y;
		
	}
	
	public int modNum(int x, int y) {
		
		return x % y;
		
	}
	*/
	
}
