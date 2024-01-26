package Week12;

class Thread1 implements Runnable{
	char[] ch = {'ß', '¶', '¢', '√', 'Ω', 'π', '¥', '§', '∑', '◊'};
	public void run(){
		for(int cnt = 0; cnt < 10; cnt++) {
			System.out.println("lamda1 : "+ ch[cnt]);
			try {
				Thread.sleep(500);
			} catch (Exception e) {}
		}
	}
}

class Thread2 implements Runnable{
	public void run() {
		for(int cnt = 0; cnt < 10; cnt++) {
			char ch = (char)((int)(Math.random()*26 + 97));
			System.out.println("lamda2 : "+ ch);
			try {
				Thread.sleep(500);
			} catch (Exception e) {}
		}
	}
}

public class Act4 {
	public static void main(String[] args) {
		Thread th1 = new Thread(new Thread1());
		Thread th2 = new Thread(new Thread2());
		th1.start();
		th2.start();
	}
}
