package sec04.exam01_arithmetic;

public class InfinityAndNaNCheckExample {

	public static void main(String[] args) {
		int x = 5;
		double y = 0.0;
		
		double z = x / y;
		
		System.out.println(Double.isInfinite(z));
		System.out.println(Double.isNaN(z));
		/*
		double타입의 값을 매개값으로 받았을 때 이 값이 Infinity 또는 NaN이면 true 리턴
		그렇지않으면 false 리턴
		 */

	}

}
