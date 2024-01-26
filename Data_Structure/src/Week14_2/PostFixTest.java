package Week14_2;
import java.util.Scanner;

public class PostFixTest {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String inFix = input.nextLine();
		String postFix = PostFix.makePostFix(inFix);
		//String postFix = input.nextLine();
		System.out.println(PostFix.evalPostFix(postFix));
		input.close();
	}
}
