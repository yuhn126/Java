package sec01.exam01_variable;

public class LiteralExample {
	public static void main (String[] args) {
		int var1 = 10;
		System.out.println(var1);
		
		int var2 = 010;
		System.out.println(var2);
		//1x8^2+0x8^0 = 8
		
		int var3 = 0x10;
		System.out.println(var3);
		//1x16^1+0x16^0 = 16
		
		double var4 = 0.25;
		System.out.println(var4);
		
		double var5 = 2E5;
		System.out.println(var5);
		//2x10^5
		//�������� ������ ������ �����Ǿ��ֱ� ������  int���� ������!
		
		char var6 = 'A';
		System.out.println(var6);
		
		char var7 = '��';
		System.out.println(var7);
		
		System.out.println('\t' + "�鿩����");
		System.out.println("����" + '\n' + "�α�"); //\r�� ���� ��� ����
		System.out.println("�̰���" + '\"' + "�߿�" + '\"' + "�մϴ�");
		
		char var8 = '\u0041'; //�����ڵ��Է� 4x16^1+1x16^0 = 65
		System.out.println(var8);
		
		System.out.println("����" + "�α�");
		System.out.println("Java" + 8);
		
		String var9 = "�ڹ�";
		System.out.println(var9);
		
		
	}
}