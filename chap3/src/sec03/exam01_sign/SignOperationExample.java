package sec03.exam01_sign;

public class SignOperationExample {

	public static void main(String[] args) {
			int x = -100;
			int result1 = +x;
			int result2 = -x;		//��ȣ �ٲ�
			
			System.out.println(result1);
			System.out.println(result2);

			short s = 100;
			//short result3 = -s;		//��ȣ �����ڰ� ������ ������� int�� ����
			int result3 = -s;
			
			System.out.println(result3);
	}

}
