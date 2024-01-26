package Week09;
public class Answer1 {
	public static void main(String[] args) {
		char[] ch = new char[10];
		char temp;
		
		for(int i = 0; i < ch.length; i++) {
			ch[i] = (char)((int)(Math.random()*26)+65); //65~90
			System.out.print(ch[i] +"  ");
		}
		
		System.out.println("\n==== 정렬 후 데이터 ====");
		for(int i = 0; i < ch.length-1; i++) {
			for(int j = i+1; j < ch.length; j++) {
				if(ch[i] > ch[j]) {
					temp = ch[j];
					ch[j] = ch[i];
					ch[i] = temp;
				}
			}
		}
		
		for(char value : ch) {
			System.out.print(value +"  ");
		}
	}
}
