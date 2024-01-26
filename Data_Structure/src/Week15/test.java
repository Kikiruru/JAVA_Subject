package Week15;
import java.util.Scanner;

import Week14.Stack;
public class test {
	public void parenTest() {
		
	}
	
	public static boolean check(String exp) {
		for(int i = 0; i < exp.length(); i++) {
			char c = exp.charAt(i);
		return true;
		}
		return true;
	} //오류때문에 리턴문 집어넣음 의미없음
	
	public static int evalPostFix(String exp) {
		Stack st;
		Scanner sc = new Scanner(exp);
		while(sc.hasNext()) {
			String token = sc.next();
			//Interger.parseInt(token)
		}
		return 0; //오류때문에 집어넣음
	}
	
	/*중위 표기식 후위 표기식으로 변환
	A + B * C - D / E
	연산자 스택, 표기식
	1. +, A
	2. +보다 *가 우선순위가 높으면 push : * -> + *, AB
	3. 우선순위가 낮으면 pop : * -> +, ABC*
	우선순위가 같으면 pop : + -> ABC*+
	push -
	즉 우선순위 같거나 낮으면 pop/push
	4. 우선순위 높으면 push : / -> /, ABC*+D
	5. 아무것도 없으면 모두 pop -> ABC*DE/-
	수식끝 pop/push
	왼쪽괄호 무조건 push(우선순위 높다)
	비교할때는 우선순위가 낮다
	오른 괄호 -> 왼쪽 괄호까지 pop/push
	A + (B - C * D + E / F) + G
	1. + | A
	2. +, ( | AB
	3. +, (, - | ABC
	4. +, (, -, * | ABCD
	5. +, (, + | ABCD*-E
	6. +, (, +, / | ABCD*EF
	7. + | ABCD*EF/+
	8. + | ABCD*EF/++G
	9. ABCD*-EF/++G+
	
	public static String makePostFix(String exp){ //in class PostFix
		String res = "";
		res += res topString + " ";
	}
	
	Scanner input = new Scanner();
	String inFix = input.nextLine();
	String postFix = PostFix.makePostFix(inFix);
	System._____(PostFix.ecalFostFix(PostFix));
	*/
}