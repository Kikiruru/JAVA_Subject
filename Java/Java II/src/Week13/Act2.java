package Week13;

public class Act2 {
	public static <T> void displayType(T obj){
			System.out.println(obj.getClass().getName());
	}
	public static void main(String[] args) {
		int x=0;
		float y=0.0F;
		Act2.<Object>displayType(x);
		Act2.<Object>displayType(y);
	}
}

