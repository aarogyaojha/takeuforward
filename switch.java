package learn_ques;

import java.util.Scanner;

public class ques4 {

	public static void main(String[] args) {
		float result = 0;
		Scanner sc=new Scanner(System.in);
		int ch=sc.nextInt();
		switch(ch) {
		case 1:
			int r=sc.nextInt();
			result=(float) (Math.PI*r*r);
			break;
		case 2:
			int l=sc.nextInt();
			int b=sc.nextInt();
			result=l*b;
			break;
		}
		System.out.println(result);
	}
}
