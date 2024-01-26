package Week07;

public class quiz12 {
	public static void main(String[] args) {
		String[] strArray = new String[5];
		
		strArray[0] = "Java";
		strArray[1] = "Java";
		strArray[2] = strArray[0];
		strArray[3] = new String("Java");
		strArray[4] = new String("Java");
		
		System.out.println("1번 : "+ (strArray[0]==strArray[1]));
		System.out.println("2번 : "+ (strArray[0]==strArray[2]));
		System.out.println("3번 : "+ (strArray[0]==strArray[3]));
		System.out.println("4번 : "+ (strArray[2]==strArray[3]));
		System.out.println("5번 : "+ (strArray[3]==strArray[4]));
		
		System.out.println("----------equals()----------");
		System.out.println("6번 : "+ (strArray[0].equals(strArray[1])));
		System.out.println("7번 : "+ (strArray[0].equals(strArray[2])));
		System.out.println("8번 : "+ (strArray[0].equals(strArray[3])));
		System.out.println("9번 : "+ (strArray[3].equals(strArray[4])));
	}
}
