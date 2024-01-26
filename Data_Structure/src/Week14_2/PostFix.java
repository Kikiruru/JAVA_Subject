package Week14_2;
import java.io.*;
import java.util.*;

public class PostFix {
	public static int evalPostFix(String exp) {
		//Scanner sc = new Scanner(exp);
		exp += " "; //음수처리를 위한 공백
		Stack s = new Stack();
		String temp = "";
		boolean is_push = false;
		int num;
		int i = 0;
		
		while(i < exp.length()) { //sc.hasNext()
			char c = exp.charAt(i);
			int a; int b;
			/*
			if (c >= '0' && c <= '9')
				s.push(Character.getNumericValue(c));
			*/
			
			if (c == '-')
			{
				if((exp.charAt(i+1) >= '0' && exp.charAt(i+1) <= '9') && temp.equals(""))
				{
					temp += c;
					i++;
					continue;
				}
			}
			
			if (c >= '0' && c <= '9') 
			{
				temp += c;
				is_push = false;
			}
			
			if (c == ' ' && !is_push) {
				num = Integer.parseInt(temp);
				s.push(num);
				//System.out.println(num);
				is_push = true;
				temp = "";
			}
			
			if(c == '+' || c == '-' || c == '/' || c == '*') {
				a = s.pop();
				b = s.pop();
				//System.out.println("a : "+ a +", b : "+ b);
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
			}
			i++;
		}
		//sc.close();
		return s.pop();
	}
	// A * (B + C) -> BC+A*
	public static String makePostFix(String exp){
		String res = "";
		exp += " ";
		int length = exp.length();
		char[] mini_stack = new char[length]; // 연산자를 저장할 배열
		int minisp = 0;
		String num = "";
		boolean is_push = false;
		int i = 0;
		//res += res topString + " ";
		while(i < length) {
			char c = exp.charAt(i);
			
			if (c >= '0' && c <= '9') {
				num += c;
				is_push = false;
			}
			
			if (c == ' ' && !is_push) {
				res += num;
				res += " ";
				is_push = true;
				num = "";
			}
			
			if (c == '(' || c == '{' || c == '[') {
				mini_stack[minisp] = c;
				minisp++;
			}
			
			if(c == '+' || c == '-' || c == '/' || c == '*') {
				if (minisp == 0) {
					mini_stack[minisp] = c;
					minisp++;
				}
				else 
				{
					if (c == '-' || c == '+') {
						while(true) {
							if (c == '{' || c == '[' || c == '(' || minisp == 0) {
								mini_stack[minisp] = c;
								minisp++;
								break;
							}
							else {
								res += mini_stack[minisp-1];
								minisp--;
							}	
						}
					}
					else if(c == '*' || c == '/') {
						while(true) {
							if (c == '{' || c == '[' || c == '(' ||
									c == '-' || c == '+') {
								mini_stack[minisp] = c;
								minisp++;
								break;
							}
							else {
								res += mini_stack[minisp-1];
								minisp--;
							}
						}
					}
				}
			}
			
			if (c == ')' || c == ']' || c == '}') {
				while(true){
					if (mini_stack[minisp] == '(' || mini_stack[minisp] == '[' || mini_stack[minisp] == '{' || minisp == 0)
					{
						minisp--;
						break;
					}
					res += mini_stack[minisp-1];
					minisp--;
				}
			}
		}
		return res;
	}
}
