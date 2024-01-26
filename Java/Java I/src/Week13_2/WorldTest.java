package Week13_2;
import java.util.Scanner;
class Word{
	private String word, mean; //단어, 뜻
	
	Word(String word, String mean){
		this.word = word;
		this.mean = mean;
	}
	
	String getWord() {
		return word;
	}
	
	String getMean() {
		return mean;
	}
	
	public String toString() {
		return word +":"+ mean;
	}
}

public class WorldTest {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Word[] w = new Word[7];
		String word;
		
		for(int i = 0; i < w.length; i++) {
			System.out.print(i+1 +" : 영단어와 뜻을 입력하세요 >>>>>> ");
			w[i] = new Word(in.next(), in.next());
		}
		
		while(true) {
			System.out.println("찾고자 하는 단어를 입력하세요. 종료(f) >>");
			word = in.next();
			
			if(word.equals("f"))
				break;
			
			boolean exis = true;
			for(int i = 0; i < w.length; i++) {
				if(word.equals(w[i].getWord())) {
					System.out.println(w[i]);
					exis = false;
				}
			}
			if(exis == true)
				System.out.println("해당 단어가 없습니다");
		}
		System.out.println("프로그램 종료");
		in.close();
	}
}
