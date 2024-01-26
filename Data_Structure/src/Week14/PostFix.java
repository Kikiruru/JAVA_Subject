package Week14;
import java.io.*;
import java.util.*;

public class PostFix {
	public static int evalPostFix(String exp) {
		//Scanner sc = new Scanner(exp);
		Stack s = new Stack();
		int i = 0;
		
		while(i < exp.length()) { //입력이 있으면 true반환
			char c = exp.charAt(i);
			String number = "";
			
			if (c == ' ') continue;
			
			if (c >= '0' && c <= '9') {
				number += c;
				continue;
			}
			s.push(number);
			int a, b;
			a = (int)s.pop();
			b = (int)s.pop();
			switch(c) {
			case '+':
				s.push(b + a);
				break;
			case '-':
				s.push(b - a);
				break;
			case '*':
				s.push(b * a);
				break;
			case '/':
				s.push(b / a);
			}
			i++;
		}
		//sc.close();
		return (int)s.pop();
	}
}
