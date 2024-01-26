package Week07;

public class Answer6 {
	public static void main(String[] args) {
		String[] card = {"Clubs", "Diamonds", "Hearts", "Spades"};
		String[] order = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
		int index1, index2; //카드 인덱스, 숫자 인덱스 
		
		for(int i = 0; i < 5; i++)
		{
			index1 = (int)(Math.random()*card.length); //0~3 정수 
			index2 = (int)(Math.random()*order.length); //0~13 정수
			System.out.printf("%d : %s 의 %s\n", i+1, card[index1], order[index2]);
		}
	}
}
