package Week11;

import java.util.*;

public class Act3 {
	public static void main(String[] args) {
		Calendar now = Calendar.getInstance();
		
		System.out.print("오늘 날짜 : ");
		System.out.println(now.get(Calendar.YEAR)+"년 "+ (now.get(Calendar.MONTH) + 1)+
				"월 "+ now.get(Calendar.DAY_OF_MONTH)+ "일");
	}
}
