package sec04.exam01_arithmetic;

public class AccuracyExample1 {

	public static void main(String[] args) {
		int apple = 1;
		double pieceUnit = 0.1;
		int number = 7;
		
		double result = apple - number * pieceUnit;
		
		System.out.println("��� �� �� ����");
		System.out.println("7������ ����");
		System.out.println(result + "������ ���´�.");
		/*��Ȯ�� ����� ������ ����ϴ� ���� ����.
		 �ε��Ҽ���(�Ǽ�)Ÿ���� 0.1�� ��Ȯ�� ǥ������ ����*/
	}

}
