package sec03.exam02_casting;

public class FromIntToFloat {

	public static void main(String[] args) {
		int num1 = 123456780;
		int num2 = 123456780;
		
		//int에서 float으로
		float num3 = num2;		//float : 부호(1) + 지수(8) + 가수(23)
		num2 = (int)num3;		//123456780을 23비트로 표현 할 수 없어서 근사치로 변환됨

		int result1 = num1 - num2;
		System.out.println(result1);
		
		//int에서 double으로
		num2 = 123456780;
		
		double num4 = num2;		//double : 부호(1) + 지수(11) + 가수(52)
		num2 = (int)num4;
		
		int result2 = num1 - num2;
		System.out.println(result2);
		
	}

}
