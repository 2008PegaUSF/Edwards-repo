package ThreadChallenge;


public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		
		

	
	}
	
	public static boolean checkPrime(int testNum) {
		boolean isPrime = true;
		
		for(int i = 2; i < testNum; ++i) {
			
			if(testNum%i == 0) {
				isPrime = false;
				return isPrime;
			}
			
		}
		
		return isPrime;		
		
	}
	
}
