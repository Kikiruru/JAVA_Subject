package Week15_exam4;

import JFx_Week13.RemoteControl;

public class Television implements RemoteControl {

	@SuppressWarnings("unused")
	private int volume;

	public String turnOn() {
		return "TV를 켭니다.";
	}

	public String turnOff() {
		return "TV를 끕니다.";
	}

	public String setVolume(int volume) {
		if (volume > RemoteControl.MAX_VOLUME) {
			this.volume = RemoteControl.MAX_VOLUME;
		} else if (volume < RemoteControl.MIN_VOLUME) {
			this.volume = RemoteControl.MIN_VOLUME;
		} else {
			this.volume = volume;
		}
		return "현재 TV 볼륨: " + volume;
	}
}
