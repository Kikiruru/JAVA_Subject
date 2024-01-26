package Week07;

interface Operation{
	void cut();
	void wash();
}

class Hair implements Operation{
	private String type;
	
	public Hair(String type) {
		this.type = type;
	}
	
	public void cut() {
		System.out.println(type +"를 자르다");
	}
	
	public void wash() {
		System.out.println(type +"를 감다");
	}
	
	public void tint(String color) {
		System.out.println(type +"를 "+ color +"색으로 염색하다");
	}
}

class Fruit implements Operation{
	private String type;
	
	public Fruit(String type) {
		this.type = type;
	}
	
	public void cut() {
		System.out.println(type +"를 자르다");
	}
	
	public void wash() {
		System.out.println(type +"를 씻다");
	}
	
	public void pack(int cnt) {
		System.out.println(type +"를 "+ cnt +" 개 포장하다");
	}
}

public class Answer3 {
	public static void run(Operation oper) {
		oper.cut();
		oper.wash();
		if(oper instanceof Hair) {
			((Hair) oper).tint("brown");
		}
		else if(oper instanceof Fruit) {
			((Fruit) oper).pack(10);
		}
	}
	
	public static void main(String[] args) {
		Operation oper = null;
		oper = new Hair("긴머리");
		run(oper);
		oper = new Fruit("사과");
		run(oper);
	}
}
