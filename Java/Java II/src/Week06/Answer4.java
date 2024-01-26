package Week06;

public class Answer4 {
	public static Person getMaximum(Person[] arr) {
		Person ic = arr[0];
		for(int i = 1; i < arr.length; i++) {
			if(ic.compareTo(arr[i]) == -1)
				ic = arr[i];
		}
		
		return ic;
	}
	
	public static void main(String[] args) {
		Person[] p = new Person[3];
		p[0] = new Person("Benny", 180.0f);
		p[1] = new Person("Daniel", 178.0f);
		p[2] = new Person("Joon", 188.0f);
		
		System.out.println("----------- Person List -----------");
		for(Person pp : p) {
			System.out.println(pp);
		}
		System.out.println("가장 키 큰 : "+ getMaximum(p));
	}
}
