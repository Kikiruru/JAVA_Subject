package Week09;
import java.util.Scanner;
public class Answer6 {
	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		boolean[] lent = {false, false, false, false, false,
				false, false, false, false, false};
		int status, num;
		
		while(true) {
			System.out.print("1. 대여 2. 대여현황 3. 종료 >> ");
			status = key.nextInt();
			if(status == 3) {
				break;
			}
			else if(status == 1) {
				System.out.print("대여하고자 하는 사물함 번호를 입력하세요 >>");
				num = key.nextInt() - 1;
				if(lent[num] == true) {
					System.out.println("대여된 사물함");
				}
				else {
					System.out.println("대여완료");
					lent[num] = true;
				}
			}
			else if(status == 2) {
				System.out.println("---------------대여 현황 출력---------------");
				for(int i = 0; i < lent.length; i++) {
					System.out.print(i+1 +") "+ lent[i] +"  ");
				}
				System.out.println("\n------------------------------");
			}
		}
		System.out.println("프로그램 종료");
		key.close();
	}
}
