// Input Format: N = 3
// Result: 
// * 
// * * 
// * * *

// Input Format: N = 6
// Result:
// * 
// * * 
// * * *
// * * * *
// * * * * *
// * * * * * *


package learn_ques;

import java.util.Scanner;

public class rigt_angled_pattern {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		for (int i = 0; i < num; i++) {
			for (int j = 0; j <=i; j++) {
				System.out.print("* ");
			}
			System.out.println();

		}

	}

}
