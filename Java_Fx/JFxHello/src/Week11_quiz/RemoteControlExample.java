package Week11_quiz;

interface RemoteControl{
	int MAX_VOLUME=10;
	int MIN_VOLUME=0;
	
	void turnOn();
	void turnOff();
	void setVolume(int volume);
	
	default void setMute(boolean mute) {
		if(mute)
			System.out.println("무음 처리합니다.");
		else
			System.out.println("무음 해제합니다.");
	}
	
	static void changebattery() {
		System.out.println("건전지를 교체합니다.");
	}
	
}
public class RemoteControlExample {
	public static void main(String[] args) {
		RemoteControl.changebattery();
		System.out.println("MAX_VOLUME: "+ RemoteControl.MAX_VOLUME);
		}
}
