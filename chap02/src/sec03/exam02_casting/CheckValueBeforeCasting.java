package sec03.exam02_casting;

public class CheckValueBeforeCasting {

	public static void main(String[] args) {
	
		int i = 128;
		
		byte b = (byte)i;				//byte�� ���� = -128 ~ 127
		System.out.println(b +"\n");			//������ �� ����
		
		if(i<-128 || i>127) {				//(i<Byte.MIN_VALUE || i>Byte.MAX_VALUE) �ᵵ �� (���)
			System.out.println("byteŸ������ ��ȯ �� �� �����ϴ�.");
			System.out.println("���� �ٽ� Ȯ�� �� �ּ���.");
		} else {
			b = (byte)i;
			System.out.println(b);
		}
		
	}

}
