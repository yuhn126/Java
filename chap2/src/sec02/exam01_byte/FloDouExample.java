package sec02.exam01_byte;

public class FloDouExample {

	public static void main(String[] args) {
		double var1 = 3.14;
		//float var2 = 3.14;	//�Ǽ� ���ͷ���  float�� �����Ϸ��� ���ͷ� �ڿ� 'f'�� �ٿ��� ��.
		float var3 = 3.14f;
		
		//���е� �׽�Ʈ
		double var4 = 0.1234567890123456789;	//float���� �뷫 2������ ���е��� ����
		float var5 = 0.1234567890123456789F;
		
		System.out.println(var1);
		System.out.println(var3);
		System.out.println(var4);
		System.out.println(var5);
		
		//e(����) ����ϱ�
		int var6 = 3000000;
		double var7 = 3e6;			//3x10^6
		float var8 = 3e6f;			//3x10^6
		double var9 = 2e-3;			//2x10^-3
		
		System.out.println(var6);
		System.out.println(var7);
		System.out.println(var8);
		System.out.println(var9);
	}

}
