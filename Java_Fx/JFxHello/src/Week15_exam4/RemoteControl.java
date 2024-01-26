package Week15_exam4;

public interface RemoteControl {
	// 상수
	int MAX_VOLUME = 10;
	int MIN_VOLUME = 0;

	// 추상 메소드
	String turnOn();

	String turnOff();

	String setVolume(int volume);

	// 디폴트 메소드
	default String setMute(boolean mute) {
		if (mute) {
			return "무음 처리합니다.";
		} else {
			return "무음 해제합니다.";
		}
	}

	// 정적 메소드
	static String changeBattery() {
		return "건전지를 교환합니다.";
	}
}