public class Solution {
    public static String compareIfElse(int a, int b) {
        String result;
        if (a>b) {
			result="greater";
		}
		else if(a==b) {
			result="equal";
		}
		else {
			result="smaller";
		}
        return result;
    }
}
