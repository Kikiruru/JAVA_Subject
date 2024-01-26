package Week06;

public class Answer5 {
	public static void main(String[] args) {
		Person2[] p = new Person2[6];
		
		p[0] = new Person2("anonymous", 0);
		p[1] = new Person2("benny", 20);
		p[2] = new Student("anonymous", 0, 0, 0.0);
		p[3] = new Student("benny", 20, 2015, 3);
		p[4] = new Staff("anonymous", 0, 0.0);
		p[5] = new Staff("benny", 20, 8);
		
		for(Person2 pp : p) {
			System.out.println(pp);
		}
	}
}
