// Write a program to input an integer 'n' and print the sum of all its even digits and sum of all its odd digits separately.
// Digits mean numbers, not the places! That is, if the given integer is "132456", even digits are 2, 4 and 6 and odd digits are 1, 3 and 5.


// Example :
// Input: 'n' = 132456

// Output: 12 9

// Explanation:
// The sum of even digits = 2 + 4 + 6 = 12
// The sum of odd digits = 1 + 3 + 5 = 9

package learn_ques;

import java.util.Scanner;

public class sum_of_even_odd {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String num=sc.next();
		int sum_of_even=0;
		int sum_of_odd = 0;
		char[] chars=num.toCharArray();
		int[] numarr=new int[chars.length];
		
		for (int i = 0; i < chars.length; i++) {
			numarr[i] = Character.getNumericValue(chars[i]);
			if (numarr[i]%2==0) {
				sum_of_even=sum_of_even+numarr[i];
			}
			else {
				sum_of_odd=sum_of_odd+(numarr[i]);
			}
		}
		System.out.println(sum_of_even);
		System.out.println(sum_of_odd);
	}
}
