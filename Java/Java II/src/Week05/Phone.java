package Week05;

abstract class Phone {
	private String maker; //메이커
	private int price, type; //가격, 통신타입(2G, 3G)
	
	public Phone(String maker, int price, int type) {
		this.maker = maker; this.price = price; this.type = type;
	}

	public String getMaker() {
		return maker;
	}

	public int getPrice() {
		return price;
	}

	public int getType() {
		return type;
	}

	public void setMaker(String maker) {
		this.maker = maker;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public void setType(int type) {
		this.type = type;
	}
	
	@Override
	public String toString() {
		return "maker="+ maker +"\nprice="+ price +"\ntype="+ type;
	}
}

class SmartPhone extends Phone{
	private int memory; // 내부 메모리 크기
	private boolean hasBluetooth; // 블루투스 지원여부
	
	public SmartPhone() {
		super("None", 0, 0);
		memory = 0;
		hasBluetooth = false;
	}
	
	public SmartPhone(String maker, int price, int type, int memory, boolean hasBluetooth) {
		super(maker, price, type);
		this.memory = memory;
		this.hasBluetooth = hasBluetooth;
	}

	public int getMemory() {
		return memory;
	}

	public boolean isHasBluetooth() {
		return hasBluetooth;
	}

	public void setMemory(int memory) {
		this.memory = memory;
	}

	public void setHasBluetooth(boolean hasBluetooth) {
		this.hasBluetooth = hasBluetooth;
	}
	
	@Override
	public String toString() {
		return super.toString();
	}
}