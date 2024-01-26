package JFx_Week13;

public class Audio implements RemoteControl {

	@SuppressWarnings("unused")
	private int volume;
	@SuppressWarnings("unused")
	private boolean mute;

	public String turnOn() {
		return "Audio를 켭니다.";
	}

	public String turnOff() {
		return "Audio를 끕니다.";
	}

	public String setVolume(int volume) {
		if (volume > RemoteControl.MAX_VOLUME) {
			this.volume = RemoteControl.MAX_VOLUME;
		} else if (volume < RemoteControl.MIN_VOLUME) {
			this.volume = RemoteControl.MIN_VOLUME;
		} else {
			this.volume = volume;
		}
		return "현재 Audio 볼륨: " + volume;
	}

	@Override
	public String setMute(boolean mute) {
		this.mute = mute;
		if (mute) {
			return "Audio 무음 처리합니다.";
		} else {
			return "Audio 무음 해제합니다.";
		}
	}

}
