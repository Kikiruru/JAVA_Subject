package Week04;
import java.util.Scanner;
public class Answer2 {
	public static void main(String[] args) {
		String name;
		int year;
		Scanner input = new Scanner(System.in);
		
		System.out.print("이름을 입력하시오: ");
		name = input.next();
		System.out.print("태어난 년도를 입력하시오: ");
		year = input.nextInt();
		
		System.out.println("저의 이름은 "+ name +"입니다.");
		System.out.println("제가 태어난 해는 "+ year +"년 입니다.");
		input.close();
	}

}
