package Week13;

class Container <T> {
	T value;
	
	public void set(T value) {
		this.value = value;
	}
	
	public T get() {
		return value;
	}
}

public class Act6 { //ContainerExample
	public static void main(String[] args) {
		Container<String> con1=new Container<>();
		con1.set("홍길동");
		String str=con1.get();
		System.out.println(str);
		
		Container<Integer> con2=new Container<>();
		con2.set(6);
		Integer ig = con2.get();
		System.out.println(ig);
	}
} 

