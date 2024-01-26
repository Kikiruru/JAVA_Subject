package Week07;

public class exam {
	public static void main(String[] args) {
		Week today = Week.SUNDAY;
		
		String name = today.name();
		System.out.println(name);
		
		int ordinal = today.ordinal();
		System.out.println(ordinal);
		
		Week day1 = Week.MONDAY; Week day2 = Week.WEDNESDAY;
		int result1 = day1.compareTo(day2);
		int result2 = day2.compareTo(day1);
		System.out.println(result1);
		System.out.println(result2);
		
		if(args.length == 1) {
			String strDay = args[0]; // 예) 매개변수는 SUNDAY
			Week weekDay = Week.valueOf(strDay);
			if(weekDay == Week.SATURDAY || weekDay == Week.SUNDAY) {
				System.out.println("주말 이군요");
			} else {
				System.out.println("평일 이군요");
			}
		}
		//value()메소드: 모든 열거 객체를 배열로 리턴
		Week[] days = Week.values()	;
		for(Week day : days) {
			System.out.println(day);
		}
	}
}
