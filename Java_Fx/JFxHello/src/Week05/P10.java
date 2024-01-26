package Week05;

public class P10 {
	public static void main(String[] args) {
		for(int i=1; i <= 10; i ++) {
			switch(i) {
			case 1:
				i = 3;
				System.out.println("Java");
			case 2:
				i = 2;
				System.out.println("and");
			case 3:
				System.out.print("Love");
			default:
				break;
			}
		}
	}
}
