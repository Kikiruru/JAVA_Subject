package Week04;
import java.util.Scanner;

class P{
	public static boolean determinePalindrome(String s) {
		return thePalindrome(s, 0, s.length()-1);
	}
	
	private static boolean thePalindrome(String s, int min, int max) {
		if(max <= min)
			return true;
		if(s.charAt(min) == s.charAt(max))
			return thePalindrome(s, min+1, max-1);
		else
			return false;
	}
}

public class Palindrome {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("단어를 입력하시요:");
		String s = input.next();
		
		if(P.determinePalindrome(s))
			System.out.printf("%s는 Palindrome입니다.",s);
		else
			System.out.printf("%s는 Palindrome이 아닙니다.", s);
		input.close();
	}

}
