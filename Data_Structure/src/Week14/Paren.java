package Week14;
import java.io.*;
import java.util.*;

public class Paren { //괄호가 올바로 쓰였으면 true 반환
	public static boolean check(String exp) {
		Stack parenStack = new Stack();
		for(int i = 0; i < exp.length(); i++) {
			char c = exp.charAt(i);
			if (c == '(' || c == '[' || c == '{')
			{
				parenStack.push(c);
			}
			else if (c == ')' || c == ']' || c == '}')
				if(parenStack.isEmpty()) return false;
			else if (c == ')')
			{
				if (!parenStack.pop().equals('('))
					return false;
			}
			else if (c == ']')
			{
				if (!parenStack.pop().equals('['))
					return false;
			}
			else if (c == '}')
			{
				if (!parenStack.pop().equals('{'))
					return false;
			}
		}
		if(parenStack.isEmpty())
			return true;
		else
			return false;
	}
}
