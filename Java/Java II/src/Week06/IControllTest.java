package Week06;

interface IControll{
	void play();
	void stop();
}

public class IControllTest{
	public static void main(String[] args) {
		IControll ic = new IControll() {
			public void play() {
				System.out.println("시작");
			}
			public void stop() {
				System.out.println("정지");
			}
		};
		
		ic.play();
		ic.stop();
	}
}