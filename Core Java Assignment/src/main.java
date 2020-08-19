
public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String testString = "supercalifragilisticexpialidocious";
		
		System.out.println("Q1: Example of Bubble Sort:");
		bubbleSortEx();
		
		System.out.println("\n\nQ2: 1st 25 digits of Fibonacci sequence including 0:");
		fibNumPrint(25);
		
		System.out.println("\n\nQ3: How do you spell "+ testString +" backwards?");
		reverseString(testString);
		
		System.out.println("\n\nQ4: Factorial of a given number:");
		System.out.println(factorialN(20));
		
		
	}
	
	//example of bubble sort on a predefined array
	public static void bubbleSortEx() {
		
		int bubAry[] = {1,0,5,6,3,2,3,7,9,8,4};
		
		for(int i : bubAry) {
			System.out.print(i);
		}
		
		System.out.println("");
		
		  int n = bubAry.length;  
	        int temp = 0;  
	         for(int i=0; i < n; ++i){  
	                 for(int j=1; j < (n-i); ++j){  
	                          if(bubAry[j-1] > bubAry[j]){  
	                                 //swap elements  
	                                 temp = bubAry[j-1];  
	                                 bubAry[j-1] = bubAry[j];  
	                                 bubAry[j] = temp;  
	                         }  
	                          
	                 }  
	         }
	         
	         for(int i : bubAry) {
	 			System.out.print(i);
	 		}
		
	}

	//prints out a designated number of digits of the fibonacci sequence
	public static void fibNumPrint(int fibNum) {
		
		//initialize the starting number
		int num1 = 0;
		int num2 = 1;
		
		//Since we already have the 2 starting digits the required number can be -2
		fibNum-=2;
		
		//print out existing numbers to console
		System.out.print(num1 + ", " + num2);
		
		//run for loop to keep adding number until required amount of numbers
		for(int i = 0; i<fibNum; ++i) {
			
			//prints to separate numbers neatly
			System.out.print(", ");
			
			//creates tmp int to hold the added numbers together
			//Fibonacci is the 2 previous digits added together
			int tmp = num1 + num2;
			
			//prints out new digit to list
			System.out.print(tmp);
			
			//rearranges the number for the next iteration
			num1 = num2;
			
			num2 = tmp;
		}
		
		
	}

	//reverses inserted string
	public static void reverseString(String reverseMe) {
		
		//fun lil message
		System.out.println("Now flip it and reverse it:");
		
		//uses the charAt function of strings to pull each char in reverse and print to console
		for(int i=reverseMe.length()-1; i>=0; --i) {
			System.out.print(reverseMe.charAt(i));
		}
		
	}

	//calculates a factorial for a given number
	public static long factorialN(int n) {
		
		if (n <= 2) {
	        return n;
	    }
	    return n * factorialN(n - 1);

		
	}
	
	
}
