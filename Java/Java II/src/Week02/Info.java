package Week02;

class Info {
	private String id;
	private int pass;
		
	public Info(String id) {
		this.id = id;
		pass = (int)(Math.random()*9000) + 1000;
	}

	public int getPass() {
		return pass;
	}
	
	public void display() {
		System.out.print("id : "+ id +"\t");
		System.out.println("password : "+ pass);
	}
}
