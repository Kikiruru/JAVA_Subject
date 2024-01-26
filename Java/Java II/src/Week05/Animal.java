package Week05;

abstract class Animal { // new연산자를 이용해 객체생성 불가능(자식 객체로 생성해야 함)
	private String type;
	public Animal(String type) {
		this.type = type;
	}
	
	public String getType() {
		return type;
	}
	
	abstract void run();
	abstract void sound();
}

class Dog extends Animal{
	Dog(String type){
		super(type);
	}
	
	public void run() {
		System.out.println(super.getType() +" : 네 발로 다닙니다.");
	}
	
	public void sound() {
		System.out.println(super.getType() +" : 멍멍 소리를 냅니다.");
	}
}

class Baby extends Animal{
	Baby(String type){
		super(type);
	}
	
	public void run() {
		System.out.println(super.getType() +" : 기어 다닙니다.");
	}
	
	public void sound() {
		System.out.println(super.getType() +" : 옹알이를 합니다.");
	}
}