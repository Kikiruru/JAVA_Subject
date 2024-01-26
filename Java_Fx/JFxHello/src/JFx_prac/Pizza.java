package JFx_prac;

public class Pizza extends Food{
	int num;
	
	public Pizza(String name, int num) {
		super(name);
		this.num = num;
	}
	
	@Override
	public String eat() {
		double cutDegree = 0.0;
		cutDegree = 360.0 / num;
		return name +"를 "+ num +"명이서 나누어 먹으려면 "+ cutDegree +"도로 잘라야 합니다.";
	}
}
