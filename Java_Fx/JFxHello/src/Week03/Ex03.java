package Week03;

import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) {
		int tool;
		Scanner scanner = new Scanner(System.in);
		System.out.println("1. 대나무 헬리콥터\n2. 투명 망토\n3. 공기포\n4. 빅라이트");
		while(true) {
			System.out.print("빌릴 도구의 번호를 입력하세요 : ");
			tool = scanner.nextInt();
			if(tool == 1) {
				System.out.println("도라에몽, 대나무 헬리콥터 빌려줘.");
				break;
			}
			else if (tool == 2) {
				System.out.println("도라에몽, 투명 망토 빌려줘.");
				break;
			}
			else if (tool == 3) {
				System.out.println("도라에몽, 공기포 빌려줘.");
				break;
			}
			else if (tool == 4) {
				System.out.println("도라에몽, 빅라이트 빌려줘.");
				break;
			}
			else {
				System.out.println("그런 도구는 없어.");
			}
		}
		System.out.println("그만 좀 빌려가, 진구야.");
		scanner.close();
	}
}
