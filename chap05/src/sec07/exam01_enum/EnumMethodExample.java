package sec07.exam01_enum;

public class EnumMethodExample {

	public static void main(String[] args) {
		//name() 메소드
		Week today = Week.SUNDAY;		//열거 상수 대입
		String name = today.name();		//name() : 열거 객체의 문자열 리턴
		System.out.println(name);

		//ordinal() 메소드
		int ordinal = today.ordinal();		//ordinal() : 열거 상수의 선언된 순번 리턴
		System.out.println(ordinal);
		
		//compareTo() 메소드
		Week day1 = Week.MONDAY;
		Week day2 = Week.WEDNESDAY;
		int result1 = day1.compareTo(day2);		//compareTo() : 순번 차 리턴
		int result2 = day2.compareTo(day1);
		System.out.println(result1);
		System.out.println(result2);
		
		//valueOf() 메소드
		Week weekDay = Week.valueOf("SUNDAY");	//동일한 문자열을 가지고 있는 열거 객체 리턴
		if(weekDay == Week.SATURDAY || weekDay == Week.SUNDAY) {
			System.out.println("주말이군요");
		} else {
			System.out.println("평일이군요");
		}
	
		//values() 메소드 (for문 사용에 편이)
		Week[] days = Week.values();//열거 객체의 배열 리턴
		for (Week day : days) {
			System.out.println(day);
		}
	}
}
