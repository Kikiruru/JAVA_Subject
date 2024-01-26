package Week05;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("문장을 입력하세요. >> ");
		String text = scanner.nextLine();
		byte[] b = text.getBytes(StandardCharsets.UTF_8); //해당 String의 문자들을 UTF-8 인코딩 기준으로 byte타입으로 변환
		byte[] c = new byte[b.length];
		Random rd = new Random();
		rd.nextBytes(c); // 배열 c의 값을 전부 랜덤한 값으로 채움
		int count = 0;
		int rdn = 0;
		
		while(true) {
			rdn = (int)Math.random() * 4;
			if(count != 0 && rdn == 0) {
				break;
			}
			
			count++;
			for(int i = 0; i < b.length; i++) {
				if(b[i] < 0 && c[i] < 0 && count % 2 == 0) {
					break;
				}
				b[i] = (byte)(b[i]^c[i]);
			}
		}
		
		System.out.println(Arrays.toString(b));
		System.out.println(Arrays.toString(c));
		System.out.println(count);
		scanner.close();
	}
}
