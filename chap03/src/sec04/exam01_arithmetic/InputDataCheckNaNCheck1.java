package sec04.exam01_arithmetic;

public class InputDataCheckNaNCheck1 {

	public static void main(String[] args) {
		String userInput = "NaN";		//����ڷκ��� �Է� ���� ��
		double val = Double.valueOf(userInput);		//�Է°��� doubleŸ������ ��ȯ
		
		double currentBalance = 10000.0;
		
		//NaN �˻�
		if(Double.isNaN(val)) {
			System.out.println("NaN�� �ԷµǾ� ó���� �� ����.");
			val = 0.0;
		}		//NaN�� ��� ����Ǵ� �ڵ�
		
		currentBalance += val;		//currentB�� �������� ������!
		
		System.out.println(currentBalance);

	}

}
