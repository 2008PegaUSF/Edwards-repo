package Calculator;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CalculatorTest cl = new CalculatorTest();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter an equation!");
		
		String equation = sc.nextLine();
		
		sc.close();
		
		
		int answer = cl.calculate(equation);
		
		System.out.println(answer);
	
	
	}

}