package Week5;

public class Answer5 {
	public static void main(String[] args) {
		int random, one, two;
		
		System.out.println("1~99 사이의 정수형 난수를 생성합니다");
		random = (int)(Math.random()*99)+1;
		System.out.println("생성된 난수는 "+ random +" 입니다");
		
		if(random < 10)
			random += 10;
		else if(random%10 == 0)
			random += 1;
		
		one = random/10;
		two = random%10;
		
		if(one%3 == 0 && two%3 != 0)
			System.out.println("박수짝");
		else if(one%3 != 0 && two%3 == 0)
			System.out.println("박수짝");
		else if(one%3 == 0 && two%3 == 0)
			System.out.println("박수짝짝");
		else
			System.out.println("박수 없음");
	}
}
