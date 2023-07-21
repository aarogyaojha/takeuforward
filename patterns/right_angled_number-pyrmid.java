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

public class right_angled_number {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		for (int i = 0; i <= num; i++) {
			for (int j = 1; j <=i; j++) {
				System.out.print(j);
				System.out.print(" ");
			}
			System.out.println();
		}
	}

}
