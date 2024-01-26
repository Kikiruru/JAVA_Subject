package Week13_quiz;

import java.awt.Toolkit;

public class Number8 {
	public static void main(String[] args) {
		Toolkit toolkit = Toolkit.getDefaultToolkit(); // a
		for(int i=0; i<10; i++) { // b
			toolkit.beep(); // c
			try {
				Thread.sleep(300); // d
				System.out.println("띵");
			}catch (InterruptedException e) { // e
				
			}
		}
	}
}