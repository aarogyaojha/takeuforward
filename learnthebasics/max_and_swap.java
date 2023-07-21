// Functions - Take this coding challenge to test your coding skills to


// -define a function
// -pass arguments by value to a function
// -pass arguments by reference to a function


// This coding challenge is organized in the following way:


// First line of input reads an integer to select the coding challenge:


// -Reading value '1' selects the coding-challenge 1 ( tests the ability to define a function and pass arguments by value.)


// -Reading value '2' selects the coding challenge 2 (tests the ability to pass arguments by reference to a function)


// Coding Challenge -1
// Define a function named "Maximum" that accepts two integers (pass by value) as arguments and returns the greatest of the two arguments.


// Coding Challenge -2
// Define a function named "Swap" that accepts two integers (pass by reference) as arguments and swaps their value.

// Sample Input 1:
// 1
// 2 3


// Sample Output 1:
// 3

// Sample Input 2:
// 2
// 4 5


// Sample Output 2:
// 5 4




package learn_ques;

import java.util.Scanner;

public class maximum {
	
	public int max(int a,int b) {
		if(a>b) {
			return a;
		}
		else {
			return b;
		}
	}

	public void swap(int a,int b) {
		int temp=a;
		a=b;
		b=temp;
		System.out.println(a+" "+b);
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		maximum m=new maximum();
		int ch=sc.nextInt();
		int a=sc.nextInt();
		int b=sc.nextInt();
		switch(ch) {
		case 1:
			int res=m.max(a,b);
			System.out.println(res);
			break;
		case 2:
			m.swap(a, b);
		}

	}

}
