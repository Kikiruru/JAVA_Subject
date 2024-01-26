package Week06;

public class Answer6 {
	public static void main(String[] args) {
		int ran1, ran2, hap = 0, cnt = 0;
		
		do {
			ran1 = (int)(Math.random()*6)+1;
			ran2 = (int)(Math.random()*6)+1;
			cnt++;
			hap = ran1 + ran2;
			
			System.out.printf("%d 회:(%d,%d) = %d\n",cnt,ran1,ran2,hap);
		}while(hap != 6);
		System.out.println("프로그램 종료");
	}
}
