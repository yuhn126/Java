package sec03.exam01_promotion;

public class PromotionExample {

	public static void main(String[] args) {
		byte byteValue = 10;
		int intValue = byteValue;			//int(4) <- btye(1)
		System.out.println(intValue);

		char charValue = 'B';
		intValue = charValue;				//int <- char
		System.out.println("B�� �����ڵ� = " + intValue);
		
		intValue = 500;
		long longValue = intValue;			//long(8) <- int(4)
		System.out.println(longValue);
		
		intValue = 200;
		double doubleValue = intValue;		//double(8) <- int(4)
		System.out.println(doubleValue);
		
		longValue = 10000000000L;
		float floatValue = longValue;		//float(4)�� �ε��Ҽ���������� �����ϱ� ������ long���� �޸𸮸� ���� ������ �׷��� ����X
		System.out.println(floatValue);
	}

}
