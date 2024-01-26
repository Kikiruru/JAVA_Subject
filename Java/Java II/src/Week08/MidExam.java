package Week08;

abstract class Food{
	private String type;
	private static int cnt = 0; //총 구매량
	private int num; //구매 순서
	
	public Food(String type) {
		this.type = type;
		cnt++;
		num = cnt;
	}
	
	abstract void cooking();
	
	public String getType() {
		return type;
	}
	
	public String toString() {
		return "구입 순서 : "+ num +") type >> "+ type;
	}
}

class Fish extends Food{
	private int num;
	
	public Fish(String type, int num) {
		super(type);
		this.num = num;
	}
	
	public void cooking() {
		System.out.println("fry or bake");
	}
	
	public int getNum() {
		return num;
	}
	
	public String toString() {
		return super.toString() +",   구입량>> "+ num;
	}
}

class Fruit extends Food{
	private String farm;
	
	public Fruit(String type, String farm) {
		super(type);
		this.farm = farm;
	}
	
	public void cooking() {
		System.out.println("cut fruit");
	}
	
	public String toString() {
		return super.toString() + ",   경작농원>> "+ farm;
	}
}

public class MidExam {
	public static int info(Food[] f) {
		int num = 0;
		
		for(Food v : f) {
			if(v instanceof Fish) {
				num += ((Fish) v).getNum();
			}
		}
		
		return num;
	}
	
	public static void main(String[] args) {
		Food[] f = {new Fish("오징어", 5), new Fish("고등어", 2)
				, new Fruit("딸기", "산청"), new Fruit("사과", "보람")
				, new Fish("새우", 20)
		};
		
		System.out.println("--------- 배열 원소 출력 ---------");
		for(Food v : f) {
			System.out.println(v);
		}
		
		System.out.println("\n--------- 조리법 출력 ---------");
		for(Food v : f) {
			System.out.print(v.getType() + ">>");
			v.cooking();
		}
		
		System.out.println("\n구입한 Fish는 모두 "+ info(f) +"마리 입니다.");
	}
}
