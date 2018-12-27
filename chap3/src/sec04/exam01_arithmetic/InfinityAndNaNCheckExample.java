package sec04.exam01_arithmetic;

public class InfinityAndNaNCheckExample {

	public static void main(String[] args) {
		int x = 5;
		double y = 0.0;
		
		double z = x / y;
		//double z = x % y; 
		
		//�˻���
		System.out.println(Double.isInfinite(z));
		System.out.println(Double.isNaN(z));
		//doubleŸ���� ���� �Ű������� �޾��� �� �� ���� Infinity �Ǵ� NaN�̸� true����, �׷��������� false����

		System.out.println(z + 2);			//NaN�̳� Infinity���� ���� �Ұ�
		
		if(Double.isInfinite(z) || Double.isNaN(z)) {
			System.out.println("�� ���� �Ұ�");
		} else {
			System.out.println(z + 2);
		}
		
		
		//���ܹ߻�Ȯ��
		int x2 = 5;
		int y2 = 0;
		
		try {
		int z2 = x2 / y2;
			System.out.println("z2=" + z2);			//0���� �������� �ؼ� ������
		} catch(ArithmeticException e) {
			System.out.println("0���� ������ �ȵ�");
		}
	}

}
