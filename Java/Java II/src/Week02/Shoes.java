package Week02;

class Shoes{
	private int size, cnt;
	private String name;
	
	public Shoes() {}
	
	public Shoes(int size, int cnt, String name) {
		this.size = size; this.cnt = cnt; this.name = name;
	}
	
	public int getCnt() {
		return cnt;
	}
	
	public void sell(int num) {
		cnt -= num;
	}
	
	public void add(int num) {
		cnt += num;
	}
	
	public String toString() {
		return "Shoes [size="+ size +", cnt="+ cnt +", type="+
	 name +"]";
	}
}