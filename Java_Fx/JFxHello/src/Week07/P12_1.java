package Week07;

import java.util.Calendar;

public class P12_1 {
	public static void main(String[] args) {
		Week today = null;
		
		Calendar cal = Calendar.getInstance();
		
		int week = cal.get(Calendar.DAY_OF_WEEK);

		switch(week) {
			case 1:
				today = Week.SUNDAY; break;
			case 2:
				today = Week.MONDAY; break;
			case 3:
				today = Week.TUESDAY; break;
			case 4:
				today = Week.WEDNESDAY; break;
			case 5:
				today = Week.THURSDAY; break;
			case 6:
				today = Week.FRIDAY; break;
			case 7:
				today = Week.SATURDAY; break;
		}
		
		if(today == Week.SUNDAY) {
			System.out.println("축구를 합니다.");
		} else if (today == Week.MONDAY) {
			System.out.println("Java 공부합니다.");
		} else if (today == Week.TUESDAY) {
			System.out.println("C 공부합니다.");
		} else if (today == Week.WEDNESDAY) {
			System.out.println("Python 공부합니다.");
		} else if (today == Week.THURSDAY) {
			System.out.println("여행을 갑니다.");
		} else if (today == Week.FRIDAY) {
			System.out.println("동아리 활동을 합니다.");
		} else if (today == Week.SATURDAY) {
			System.out.println("복습을 합니다.");
		}
	}
}
