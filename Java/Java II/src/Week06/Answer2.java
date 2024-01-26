package Week06;

public class Answer2 {
	public static void main(String[] args) {
		RemoteControl rc = new TV();
		 
		rc.turnOn();
		rc.setVolume(10);
		rc.setVolume(0);
		
		rc = new SmartPhone();
		
		rc.turnOn();
		rc.setVolume(50);
		RemoteControl.changeBattery();
	}
}
