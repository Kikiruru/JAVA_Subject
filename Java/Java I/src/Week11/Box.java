package Week11;

public class Box {
	int width, length, height; //가로 세로 높이 
	
	public Box(int width, int length, int height) {
		this.width = width;
		this.length = length;
		this.height = height;
	}
	
	public void volume() {
		int vol;
		vol = width * length * height;
		System.out.println("부피 : "+ vol);
	}
}
