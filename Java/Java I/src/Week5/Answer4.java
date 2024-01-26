package Week5;

public class Answer4 {
	public static void main(String[] args) {
		int random;
		
		random = (int)(Math.random()*4)+1;
		
		System.out.println("생성된 난수 : "+ random);
		if(random == 1)
			System.out.println("동쪽");
		else if(random == 2)
			System.out.println("서쪽");
		else if(random == 3)
			System.out.println("남쪽");
		else
			System.out.println("북쪽");
	}
}
