package Week06;
import java.util.Scanner;
// 검색 
public class App3_array_basic {
	public static void main(String[] agrs) {
		Scanner scan = new Scanner(System.in);
		int s[] = { 10, 20, 30, 40, 50, 60, 70, 80 ,90, 100};
		int value, index = -1;
		
		System.out.print("탐색할 값을 입력 하시오: ");
		value = scan.nextInt();
		
		for(int i = 0; i < s.length; i++) {
			if(s[i] == value) {
				index = i;
				break;
			}
		}
		if(index < 0)
			System.out.println("해당 자료가 존재하지 않습니다");
		else
			System.out.println(value +"값은 "+ index +"위치에 있습니다.");
		scan.close();
	}
}
