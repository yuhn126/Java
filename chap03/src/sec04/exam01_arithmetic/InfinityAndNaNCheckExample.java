package sec04.exam01_arithmetic;

public class InfinityAndNaNCheckExample {

	public static void main(String[] args) {
		int x = 5;
		double y = 0.0;
		
		double z = x / y;
		//double z = x % y; 
		
		//검사 방법
		System.out.println(Double.isInfinite(z));
		System.out.println(Double.isNaN(z));
		//double타입의 값을 매개값으로 받았을 때 이 값이 Infinity 또는 NaN이면 true리턴, 그렇지않으면 false리턴

		System.out.println(z + 2);			//NaN이나 Infinity값은 연산 불가
		
		if(Double.isInfinite(z) || Double.isNaN(z)) {
			System.out.println("값 산출 불가");
		} else {
			System.out.println(z + 2);
		}
		
		
		//예외 발생 확인
		int x2 = 5;
		int y2 = 0;
		
		try {
		int z2 = x2 / y2;
			System.out.println("z2=" + z2);			//0으로 나누려고 해서 에러남
		} catch(ArithmeticException e) {
			System.out.println("0으로 나누면 안됨");
		}
	}

}
