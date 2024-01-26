package JFx_prac;

public class Car {
	String company = "현대자동차";
	String model = "그랜져";
	String color = "검정";
	String year = "2018";
	String distance = "251643km";
	String fuel = "가솔린";
	String type = "대형";
	
	@Override
	public String toString() {
		return String.format("제작회사 : %-10s\n"
							+ "모델명 : %-10s\n"
							+ "색상 : %-10s\n"
							+ "연식 : %-10s\n"
							+ "주행거리 : %-10s\n"
							+ "사용연료 : %-10s\n"
							+ "차종 : %-10s\n", company, model, color, year,
							distance, fuel, type);
	}
}
