package Week12;

public class Act5 {
	public static void main(String[] args) {
		Thread th1 = new Thread(() -> 
		{
			char[] ch = {'ß', '¶', '¢', '√', 'Ω', 'π', '¥', '§', '∑', '◊'};
			for(int cnt = 0; cnt < 10; cnt++) {
				System.out.println("lamda1 : "+ ch[cnt]);
				try {
					Thread.sleep(500);
				} catch (Exception e) {}
			}
		});
		Thread th2 = new Thread(() ->
		{
			for(int cnt = 0; cnt < 10; cnt++) {
				char ch = (char)((int)(Math.random()*26 + 97));
				System.out.println("lamda2 : "+ ch);
				try {
					Thread.sleep(500);
				} catch (Exception e) {}
			}
		});
		
		th1.start();
		th2.start();
	}
}
