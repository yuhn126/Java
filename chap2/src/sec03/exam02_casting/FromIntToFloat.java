package sec03.exam02_casting;

public class FromIntToFloat {

	public static void main(String[] args) {
		int num1 = 123456780;
		int num2 = 123456780;
		
		//int���� float����
		float num3 = num2;		//float : ��ȣ(1) + ����(8) + ����(23)
		num2 = (int)num3;		//123456780�� 23��Ʈ�� ǥ�� �� �� ��� �ٻ�ġ�� ��ȯ��

		int result1 = num1 - num2;
		System.out.println(result1);
		
		//int���� double����
		num2 = 123456780;
		
		double num4 = num2;		//double : ��ȣ(1) + ����(11) + ����(52)
		num2 = (int)num4;
		
		int result2 = num1 - num2;
		System.out.println(result2);
		
	}

}
