package Week02;

class CellPhone {
	private String telNum; //폰 번호
	private String power; // 전원
	
	public CellPhone() {
		telNum = "010-0000-0000";
		power = "on";
	}
	
	public CellPhone(String ph) {
		telNum = ph;
		power = "on";
	}
	
	public CellPhone(String ph, String power) {
		telNum = ph;
		power = this.power;
	}
	
	public void powerToggle() {
		if(power.equals("on"))
			power = "off";
		else
			power = "on";
	}
	
	public String toString() {
		return "휴대폰 번호 : "+ telNum +"\n"
				+ "현재 전원 상태 : "+ power;
	}
}
