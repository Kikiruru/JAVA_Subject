package Week09;

import java.util.Scanner;

class NotUseId extends Exception{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1150482647564465848L;

	NotUseId(String message){
		super(message);
	}
}

public class IDTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String id;
		
		try {
			System.out.println("아이디를 입력하세요");
			id = sc.nextLine();
			System.out.print(id +"는 ");
			creatID(id);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		sc.close();
	}
	
	public static void creatID(String id) throws NotUseId {
		if(id.length() >= 8) {
			if((id.charAt(0) >= 'A' && id.charAt(0) <= 'Z') || 
					(id.charAt(0) >= 'a' && id.charAt(0) <= 'z'))
			{
				System.out.println("사용 가능한 아이디 입니다.");
			}
			else
				throw new NotUseId("사용할 수 없는 아이디");
		}
		else
			throw new NotUseId("사용할 수 없는 아이디");
	}
}
