package Week11;
/*
제품 관리를 위한 클래스 Product를 작성하시오
Product 클래스는 제품명과 가격을 가지며,
매개변수로 구입 개수를 받아 구입가격을 반환하는 calCost() 메소드,
제품정보를 출력하는 toString() 메소드로 이루어진다.
 */
public class Product {
	/*
	private String name; //제품명 
	private int cost; //가격 
	// ProductExample 용 
	*/
	String name;
	int cost;
	
	Product(String name, int cost){
		this.name = name;
		this.cost = cost;
	}
	
	public String getName() {
		return name;
	}
	
	int calCost(int cnt) {
		return cost*cnt;
	}
	
	public String toString() {
		return "name :"+ name +"\tcost :"+ cost;
	}
	
	public void write() {
		System.out.println("제품명 : "+ name +"\t제품가격 : "+ cost);
	}
}
