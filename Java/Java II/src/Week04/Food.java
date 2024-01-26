package Week04;

class Food {
	private int cal, cost, kg; //칼로리, 가격, 중량
	
	Food() {}
	Food(int cal, int cost, int kg){
		this.cal = cal;
		this.cost = cost;
		this.kg = kg;
	}
	
	public int getCal() {
		return cal;
	}
	public int getCost() {
		return cost;
	}
	public int getKg() {
		return kg;
	}
	public void setCal(int cal) {
		this.cal = cal;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
	public void setKg(int kg) {
		this.kg = kg;
	}
	
	public String toString() {
		return "cost="+ cost +"\tkg="+ kg;
	}
}

class Melon extends Food{
	private String info;
	
	Melon(int cal, int cost, int kg, String info){
		super(cal, cost, kg);
		this.info = info;
	}

	public String getInfo() {
		return info;
	}

	public void setInfo(String info) {
		this.info = info;
	}
	
	public String toString() {
		return "[ "+ super.toString() +"\t경작농원="+ info +" ]";
	}
}