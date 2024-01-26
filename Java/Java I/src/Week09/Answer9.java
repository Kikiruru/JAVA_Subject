package Week09;

public class Answer9 {
	public static void main(String[] args) {
		String[] title = {"자바", "파이썬", "코딩", "자바스크립트", "자료구조"};
		int[] pages = {150, 100, 120, 200, 180};
		int index = 0, max = 0;
		
		for(int i = 0; i < pages.length; i++) {
			if(max < pages[i]) {
				max = pages[i];
				index = i;
			}
		}

		System.out.println("최대 페이지 수 : "+ pages[index]);
		System.out.println("최대 페이지수를 가진 책 : "+ title[index]);
	}
}
