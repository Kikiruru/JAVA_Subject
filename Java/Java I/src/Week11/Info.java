package Week11;

public class Info {
	String id;
	int pass;
	
	public Info(String id) {
		this.id = id;
		pass = (int)(Math.random()*9000)+1000;
	}
	
	public void display() {
		System.out.println("id : "+ id +"\tpassword : "+ pass);
	}
}
