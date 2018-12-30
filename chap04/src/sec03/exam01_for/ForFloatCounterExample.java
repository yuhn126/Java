package sec03.exam01_for;

public class ForFloatCounterExample {

	public static void main(String[] args) {

		for(float x = 0.1f; x<=1.0f; x+=0.1f) {
			System.out.println(x);		//부동소수점 타입은 정확도가 떨어짐, 웬만하면 정수 사용!
		}

	}

}
