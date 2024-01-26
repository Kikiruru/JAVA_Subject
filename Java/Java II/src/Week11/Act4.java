package Week11;

import java.util.Random;

public class Act4 {
	public static void main(String[] args) {
		Random random = new Random();
		int dice_num;
		
		for(int i = 0; i < 5; i++) {
			dice_num = random.nextInt(6) + 1;
			System.out.print(i+1 +"번째 주사위 면 : ");
			System.out.println(dice_num);
		}
	}
}
