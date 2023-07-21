// Provided 'n' you have to find out the n-th Fibonacci Number. Handle edges cases like when 'n' = 1 or 'n' = 2 by using conditionals like if else and return what's expected
// Input: 6

// Output: 8

// Explanation: The number is ‘6’ so we have to find the “6th” Fibonacci number.
// So by using the given formula of the Fibonacci series, we get the series:    
// [ 1, 1, 2, 3, 5, 8, 13, 21]
// So the “6th” element is “8” hence we get the output.

package learn_ques;

import java.util.Scanner;

public class fibonacci {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int a=1;
		int b=1;
		int c=0;
		for (int i = 0; i < num-2; i++) {
			c=a+b;
			a=b;
			b=c;
		}
		System.out.println(c);
		
	}
}
