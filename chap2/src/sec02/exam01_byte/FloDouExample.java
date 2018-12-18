package sec02.exam01_byte;

public class FloDouExample {

	public static void main(String[] args) {
		double var1 = 3.14;
		//float var2 = 3.14;	//실수 리터럴을  float에 저장하려면 리터럴 뒤에 'f'를 붙여야 함.
		float var3 = 3.14f;
		
		//정밀도 테스트
		double var4 = 0.1234567890123456789;	//float보다 대략 2배정도 정밀도가 높음
		float var5 = 0.1234567890123456789F;
		
		System.out.println(var1);
		System.out.println(var3);
		System.out.println(var4);
		System.out.println(var5);
		
		//e(지수) 사용하기
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
