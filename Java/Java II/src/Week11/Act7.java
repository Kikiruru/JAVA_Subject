package Week11;

import java.util.StringTokenizer;
import java.util.Random;
import java.util.Scanner;

class Manage {
	String[] word = new String[3];
	
	public void splitString(String[] str, String num) {
		StringTokenizer st = new StringTokenizer(num, "-");
		
		for(int i = 0; i < 3; i++) {
			word[i] = st.nextToken();
		}
		while(st.hasMoreTokens()) {
			word[2] += " "+ st.nextToken();
		}
		
		for(int i = 0; i < 3; i++) {
			System.out.println(str[i] +" : "+ word[i]);
		}
	}
	
	public void startChar() {
		Random random = new Random();
		Scanner sc = new Scanner(System.in);
		char word;
		
		for(int i = 0; i < 3; i++) {
			int k = random.nextInt(26)+65; // 65 ~ 90 까지 정수
			word = (char)k;//(random.nextInt(65)+21);
			System.out.print(word +"로 시작하는 단어 >> ");
			sc.next();
		}
		sc.close();
	}
	
	public int calChar(String number) { // 연산순서 왼쪽에서 오른쪽
		StringTokenizer st = new StringTokenizer(number, " ");
		String[] words = new String[st.countTokens()];
		
		for(int i = 0; i < words.length; i++) {
			words[i] = st.nextToken();
		}
		
		double[] num = new double[2];
		num[0] = Double.parseDouble(words[0]);
		for(int i = 1; i < words.length; i+=2) {
			num[1] = Double.parseDouble(words[i+1]);
			switch(words[i]) {
			case "+":
				num[0] += num[1];
				break;
			case "-":
				num[0] -= num[1];
				break;
			case "*":
				num[0] *= num[1];
				break;
			case "/":
				num[0] /= num[1];
				break;
			}
		}
		return (int)num[0];
	}
}

public class Act7 {
	public static void main(String[] args) {
		Manage manage = new Manage();
		manage.splitString(new String[] {"국가번호", "도시식별번호", "가입자 번호"},
				"082-2-777-5566");
		manage.startChar();
		System.out.println("34 + 56 - 12 * 2 = "+ manage.calChar("34 + 56 - 12 * 2"));
		System.out.println("프로그램 종료");
	}
}
