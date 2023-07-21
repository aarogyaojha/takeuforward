package learn_ques;

import java.util.Scanner;

public class ques2 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		String type=sc.next();
		int res=0;
		
		if (type.equals("Integer") || type.equals("Float") ){
           res=4;
        }
        else if(type.equals("Long") || type.equals("Double"))
        {
           res=8;
        }
        else{
           res=1;
        }
		System.out.println(res);
	}

}
