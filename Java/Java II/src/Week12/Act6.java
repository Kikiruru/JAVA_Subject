package Week12;

class CharThread extends Thread{
	char[] ch;
	int num;
	
	public CharThread(char[] ch, int num) {
		this.ch = ch;
		this.num = num;
	}
	
	public void run() {
		for(int i = 0; i < num; i++) {
			int cnt = (int)(Math.random()*ch.length);
			System.out.print(ch[cnt] +" ");
		}
	}
}

class NumThread extends Thread{
	int num;
	
	public NumThread(int num) {
		this.num = num;
	}
	
	public void run() {
		int n = 1;
		while(true) {
			System.out.print(n++ +" ");
			if(n > num) break;
		}
	}
}

public class Act6 {
	public static void main(String[] args) {
		int num = (int)(Math.random() *21 +1);
		Thread cht = new CharThread(new char[] {'◇', '□'} ,num);
		Thread nut = new NumThread(num);
		cht.start();
		nut.start();
	}
}
