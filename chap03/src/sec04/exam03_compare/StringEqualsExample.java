package sec04.exam03_compare;

public class StringEqualsExample {

	public static void main(String[] args) {
		String strVar1 = "�ſ��";
		String strVar2 = "�ſ��";
		String strVar3 = new String("�ſ��");			//새로운 객체 생성
		
		System.out.println(strVar1 == strVar2);			//번지가 같은지 물어봄
		System.out.println(strVar1 == strVar3);
		System.out.println();
		System.out.println(strVar1.equals(strVar2));		//1의 문자열과 2의 문자열이 같은가?
		System.out.println(strVar1.equals(strVar3));

	}

}
