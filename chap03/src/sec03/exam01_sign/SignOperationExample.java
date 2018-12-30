package sec03.exam01_sign;

public class SignOperationExample {

	public static void main(String[] args) {
			int x = -100;
			int result1 = +x;
			int result2 = -x;		//부호 바뀜
			
			System.out.println(result1);
			System.out.println(result2);

			short s = 100;
			//short result3 = -s;		//부호 연산자가 붙으면 결과값이 int로 나옴
			int result3 = -s;
			
			System.out.println(result3);
	}

}
