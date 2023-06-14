package fibonacci;

//

import java.util.*;

public class fibonacci {
	
public static int fibonacciiterative(int n) {
		
	//Beginning of fibonacci, start at 1
		if (n<=1)
			return n;
		
		// initialize variable for iterative sequence
		int fib = 1, prevFib = 1;
		
			
		// for loop for iteration
		for (int i = 1; i < n; i++) {
			int last = fib;
			fib += prevFib;
			prevFib = last;
		}
			return fib;	
	}

public static int fibonaccirecursive(int n) {
		
		//Beginning of fibonacci, start at 1
				if (n<=1) {
					return n;
					}
				else
				{
					return fibonaccirecursive(n-1) + fibonaccirecursive(n-2);
				}
}
	

	
public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Set time to nanoseconds, assumingly doing a time comparison between iterative and recursive
		
		
			// User input needed 
				Scanner input = new Scanner(System.in);
	    	
			// User input to determine how many characters out to display function results
	        System.out.print("How many digits (integer) out did you want the Fibonacci sequence to go?  \n");
	        int a = input.nextInt();
	        System.out.println("You entered " + a);

	        // closing the scanner object
	        input.close();
		
	        
	    System.out.println("\n\nIterative");    
	    System.out.println("\nFibonacci: Nanoseconds");
	    
	    //
	    Map<Integer, Long> fibonaccitree = new TreeMap<>();
	    long start = System.nanoTime();
	    // Loop outputs according to how many digits user wants - Iterative
	    for (int j=1; j<= a; j++ ) {
	        	
	    	
	    	// Set time to nanoseconds, assuringly doing a time comparison between iterative and recursive
	    	int iterative = fibonacci.fibonacciiterative(j);
		
	    //Time taken to complete
	    long finish = System.nanoTime();
	    long timeElapsed = finish - start;
	    
	    //System.out.println(iterative);
	    
	    
	    // Output in two columns
	    fibonaccitree.put(iterative, timeElapsed);
	    }
	    fibonaccitree.entrySet().stream()
        .forEach(entry -> System.out.println(entry.getKey() + " : " + entry.getValue()));
	    	
	    
	  // Loop outputs according to how many digits user wants - Recursive
	    System.out.println("\n\nRecursive");
	    System.out.println("\nFibonacci: Nanoseconds");
	    for (int j=1; j<= a; j++ ) {
	    	
	    	//Time taken to complete
		    long finish = System.nanoTime();
		    long timeElapsed = finish - start;
	    	
			int recursive = fibonacci.fibonaccirecursive(j);
	    	fibonaccitree.put(recursive, timeElapsed);	
	    }
	    // Add to map
	    fibonaccitree.entrySet().stream()
        .forEach(entry -> System.out.println(entry.getKey() + " : " + entry.getValue()));
	    
	    
		return ;
				
		
	}}



