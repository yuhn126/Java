package sec02.exam01_byte;

public class LongExample {
	public static void main(String[] args) {
		long var1 = 10;
		long var2 = 20L;
		//long var3 = 100000000000;		//int의 저장 범위를 넘어서는 정수 리터럴에 'L'을 붙이지않아 에러
		long var4 = 100000000000L;
		
		System.out.println(var1);
		System.out.println(var2);
		System.out.println(var4);
	}
}
