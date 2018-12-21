package sec03.exam01_promotion;

public class OperationsPromotionExample {
	public static void main(String[] args) {
		int intValue = 10;
		double doubleValue = 5.5;
		double result = intValue + doubleValue;		//int가 double로 자동변환 됨, int로 연산하려면 double앞에 (int)추가
		
		byte byteValue1 = 10;
		byte byteValue2 = 20;
		//byte byteValue3 = byteValue1 + byteValue2;	//에러남
		int intValue1 = byteValue1 + byteValue2;
		System.out.println(intValue1);
		
		char charValue1 = 'A';
		char charValue2 = 1;
		//char charValue3 = charValue1 +charValue2;		//에러남
		int intValue2 = charValue1 + charValue2;
		System.out.println("유니코드=" + intValue2);
		System.out.println("출력문자=" + (char)intValue2);
		
		int intValue3 = 10;
		int intValue4 = intValue3/4;		//10/4=2.5
		System.out.println(intValue4);
		
		int intValue5 = 10;
		//int intValue6 = 10/4.0;	//에러
		double doubleValue2 = intValue5 / 4.0;
		System.out.println(doubleValue2);
	}
}
