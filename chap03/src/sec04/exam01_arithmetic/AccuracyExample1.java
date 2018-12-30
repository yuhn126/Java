package sec04.exam01_arithmetic;

public class AccuracyExample1 {

	public static void main(String[] args) {
		int apple = 1;
		double pieceUnit = 0.1;
		int number = 7;
		
		double result = apple - number * pieceUnit;
		
		System.out.println("사과 한 개 에서");
		System.out.println("7조각을 빼면");
		System.out.println(result + "조각이 남는다.");
		/*정확한 계산은 정수를 사용하는 것이 좋다.
		 부동소수점(실수)타입은 0.1을 정확히 표현하지 못함*/
	}

}
