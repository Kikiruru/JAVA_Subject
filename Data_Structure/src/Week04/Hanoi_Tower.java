package Week04;

class E{
	public static void move(int n, char orig, char dest, char temp) {
		if(n <= 1) {
			System.out.printf("%d: %c -> %c\n", n, orig, dest);
			return;
		}
		else
			move(n-1, orig, temp, dest);
			//n번째 디스크 위에 있는 디스크를 temp로 옮기는 작업
			System.out.printf("%d: %c -> %c\n", n, orig, dest);
			//orig에 있는 디스크를 dest로 옮김
			move(n-1, temp, dest, orig);
			//temp에 있는 디스크를 다시 dest로 옮기는 작업
	}
}

public class Hanoi_Tower {
	public static void main(String[] args) {
		E.move(5, 'A', 'C', 'B');
	}
}
