package sec06.exam01_field_declaration;

public class CarExample {

	public static void main(String[] args) {
		Car myCar = new Car();

		System.out.println("제작회사 : " + myCar.company);		//참조 변수(myCar)가 참조하는 객체의 company필드 값 읽기!
		System.out.println("모델명 : " + myCar.model);
		System.out.println("색깔 : " + myCar.color);
		System.out.println("최고속도 : " + myCar.maxSpeed);
		System.out.println("현재속도 : " + myCar.speed);
		
		myCar.speed = 60;
		System.out.println("현재속도 : " + myCar.speed);
	}

}
