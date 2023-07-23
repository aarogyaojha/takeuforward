// Input Format: N = 3
// Result: 
// 1
// 2 2 
// 3 3 3

// Input Format: N = 6
// Result:
// 1
// 2 2
// 3 3 3
// 4 4 4 4
// 5 5 5 5 5
// 6 6 6 6 6 6
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
