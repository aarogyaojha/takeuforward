// Input Format: N = 3
// Result: 
// 1
// 1 2 
// 1 2 3

// Input Format: N = 6
// Result:
// 1
// 1 2
// 1 2 3
// 1 2 3 4
// 1 2 3 4 5
// 1 2 3 4 5 6
package learn_ques;

import java.util.Scanner;

public class RightAngled_Number2 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for (int i = 1; i <=n; i++) {
			for (int j = 0; j <i; j++) {
				System.out.print(i+" ");
			}
			System.out.println();
		}
	}
}