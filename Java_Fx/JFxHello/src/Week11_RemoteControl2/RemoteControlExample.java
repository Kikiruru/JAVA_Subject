package Week11_RemoteControl2;

class Television implements RemoteControl {
	private int volume;
	@SuppressWarnings("unused")
	private boolean mute;
	
	//B
	public void turnOn() {
		System.out.println("TV를 켭니다.");
	}
	public void turnOff() {
		System.out.println("TV를 끕니다.");
	}
	
	public void setVolume(int volume) {
		if(volume>RemoteControl.MAX_VOLUME) {
			this.volume = RemoteControl.MAX_VOLUME;
		} else if(volume<RemoteControl.MIN_VOLUME) {
			this.volume = RemoteControl.MIN_VOLUME;
		} else {
			this.volume = volume;
		}
		System.out.println("현재 TV 볼륨: " + this.volume);
	}
	
	public void setMute(boolean mute) {
		this.mute = mute;
		if(mute) {
			System.out.println("TV 무음 처리합니다.");
		} else {
			System.out.println("TV 무음 해제합니다.");
		}
	}
}

class Audio implements RemoteControl {
	private int volume;
	@SuppressWarnings("unused")
	private boolean mute;
	
	// B
	public void turnOn() {
		System.out.println("Audio를 켭니다.");
	}

	public void turnOff() {
		System.out.println("Audio를 끕니다.");
	}
	public void setVolume(int volume) {
		if(volume>RemoteControl.MAX_VOLUME) {
			this.volume = RemoteControl.MAX_VOLUME;
		} else if(volume<RemoteControl.MIN_VOLUME) {
			this.volume = RemoteControl.MIN_VOLUME;
		} else {
			this.volume = volume;
		}
		System.out.println("현재 Audio 볼륨: " + this.volume);
	}
	
	public void setMute(boolean mute) {
		this.mute = mute;
		if(mute) {
			System.out.println("Audio 무음 처리합니다.");
		} else {
			System.out.println("Audio 무음 해제합니다.");
		}
	}	
}

public class RemoteControlExample {
	public static void main(String[] args) {
		RemoteControl rc = null;
		
		rc = new Television();
		rc.turnOn();
		rc.setMute(true);	
		//C
		rc.turnOff();

		rc = new Audio();
		rc.turnOn();
		rc.setMute(true);
		//D
		rc.setMute(false);
		rc.setVolume(10);
		rc.setVolume(30);
		rc.turnOff();
	}
}
