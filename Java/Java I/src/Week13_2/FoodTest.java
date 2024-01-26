package Week13_2;

class Food{
	private int price, weight; // 가격, 중량
	
	Food(int price, int weight){
		this.price = price;
		this.weight = weight;
	}
	
	int getPrice() {
		return price;
	}
	
	void setPrice(int price) {
		this.price = price;
	}
	
	int getWeight() {
		return weight;
	}
	
	void setWeight(int weight) {
		this.weight = weight;
	}
	
	public String toString() {
		return "cost="+ price +"\tkg="+ weight;
	}
}

class Melon extends Food{
	String pos; // 경작 농원 정보
	Melon(int cost, int kg, String pos){
		super(cost, kg);
		this.pos = pos;
	}
	
	String getPosition() {
		return pos;
	}
	
	void setPosition(String pos) {
		this.pos = pos;
	}
	
	public String toString() {
		return super.toString() +"\t경작 농원="+ pos;
	}
}

public class FoodTest {
	public static void main(String[] args) {
		Melon m1 = new Melon(2500,21,"Hallym_farm");
		Melon m2 = new Melon(2000,10,"Software_farm");
		
		System.out.println("m1 객체 정보 [ "+ m1 +" ]"	);
		System.out.println("m2 객체 정보 [ "+ m2 +" ]"	);
		System.out.println(">> m2 객체의 cost와 경작농원 정보 변경 후");
		m2.setPrice(3000); //setCost
		m2.setPosition("java_farm"); // setInfo	
		System.out.println(m2 +"\n");
		System.out.println("m1 : 중량 >> "+ m1.getWeight()); //getKg
		System.out.println("프로그램 종료");
	}
}
