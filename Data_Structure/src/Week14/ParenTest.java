package Week14;
import java.util.Scanner;

public class ParenTest {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String exp = input.nextLine();
		System.out.println(Paren.check(exp));
		input.close();
	}
}
