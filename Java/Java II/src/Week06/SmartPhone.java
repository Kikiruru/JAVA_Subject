package Week06;

public class SmartPhone implements RemoteControl{
	private int volume = 10;
	private boolean mute = false;
	public void turnOn() {
		System.out.println("SmartPhone을 켭니다.");
	}
	
	public void turnOff() {
		System.out.println("SmartPhone을 끕니다.");
	}
	
	public void setVolume(int volume) {
		this.volume = volume;

		if(volume <= MIN_VOLUME)
		{
			System.out.println("---- SmartPhone 볼륨을 무음으로 합니다 ----");
			setMute(true);
			mute = true;
			//System.out.println("현재 SmartPhone 볼륨: 무음");
		}
		else if(volume >= MAX_VOLUME) 
		{
			System.out.println("---- SmartPhone 볼륨을 최대로 합니다 ----");
			if(mute) 
			{
				setMute(false);
				mute = false;
			}
			System.out.println("현재 SmartPhone 볼륨: 최대");
		}
		else 
		{
			System.out.println("---- SmartPhone 볼륨을 "+ volume +"으로 합니다 ----");
			if(mute) 
			{
				setMute(false);
				mute = false;
			}
			System.out.println("현재 SmartPhone 볼륨: "+ this.volume);
		}
	}
}
