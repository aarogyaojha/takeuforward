// Example 1:
// Input: N = 3
// Output: 
// * * *
// * * *
// * * *


// Example 2:
// Input: N = 6
// Output:
// * * * * * *
// * * * * * *
// * * * * * *
// * * * * * *
// * * * * * *
// * * * * * *



package learn_ques;

import java.util.Iterator;
import java.util.Scanner;

public class pattern1 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		for (int i = 0; i < num; i++) {
			for (int j = 0; j < num; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
