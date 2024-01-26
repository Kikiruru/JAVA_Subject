package Week06;
import java.util.Scanner;
public class App1_loop {
 public static void main(String[] args) {
	 Scanner in = new Scanner(System.in);
	 boolean flag = true;
	 char ch;
	 int data1, data2, count = 0;
	 
	 while(flag) {
		 for(int i = 0; i<5; i++) {
			 data1 = (int)(Math.random()*9)+1;
			 data2 = (int)(Math.random()*9)+1;
			 
			 System.out.printf(" %d) %d * %d = ",(i+1), data1, data2);
			 int gop = in.nextInt();
			 
			 if(data1 * data2 == gop) {
				 System.out.println("정답입니다");
				 count++;
			 } else
				 System.out.println("오답입니다");
		 }
		 
		 System.out.print("종료하려면 N 또는 n을 입력하세요 >>");
		 ch = in.next().charAt(0);
		 if(ch == 'N' || ch == 'n')
			 flag = false;
	 }
	 System.out.println("정답 횟수 = "+ count);
	 in.close();
 }
}
