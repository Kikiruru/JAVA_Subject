package Week04;
import java.util.Scanner;
public class Answer4 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int orange, box, last; // 오렌지개수, 박스개수, 나머지개수
		
		System.out.print("오렌지의 개수를 입력하시오: ");
		orange = in.nextInt();
		
		box = orange / 10;
		last = orange % 10;
		
		System.out.println(box +"박스가 필요하고 "+ last +"개가 남습니다.");
		in.close();
	}
}
