package Week05;

public class BreakOutterExample {
	public static void main(String[] args) throws Exception {
		Outer:
			for(char upper='A'; upper <= 'Z'; upper++) {
				for(char lower='a'; lower<='z'; lower++) {
					System.out.println(upper + "-"+ lower);
					if(lower=='g') {
						break Outer;
					}
				}
			}
		System.out.println("프로그램 실행 종료");
	}
}