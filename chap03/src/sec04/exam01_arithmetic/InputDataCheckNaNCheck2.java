package sec04.exam01_arithmetic;

public class InputDataCheckNaNCheck2 {

	public static void main(String[] args) {
		String userInput = "NaN";		//����ڷκ��� �Է� ���� ��
		double val = Double.valueOf(userInput);		//�Է°��� doubleŸ������ ��ȯ
		
		double currentBalance = 10000.0;
		
		currentBalance += val;		//currentB�� NaN�� �����.
		
		System.out.println(currentBalance);

	}

}
