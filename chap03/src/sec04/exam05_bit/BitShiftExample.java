package sec04.exam05_bit;

public class BitShiftExample {

	public static void main(String[] args) {
		System.out.println("1 << 3 = " + (1 << 3));			//왼쪽으로 3bit 이동
		System.out.println("-8 >> 3 = " + (-8 >> 3));			//오른쪽으로 3bit 이동
		System.out.println("-8 >>> 3 = " + (-8 >>> 3));			//오른쪽으로 3bit 이동하되 0으로 채움
		
		System.out.println();
		System.out.println(toBinaryString(-8));	
		System.out.println(">> 3 = ");
		System.out.println(toBinaryString(-8 >> 3));
		System.out.println();
		System.out.println(toBinaryString(-8));	
		System.out.println(">>> 3 = ");
		System.out.println(toBinaryString(-8 >>> 3));
	}
	
	public static String toBinaryString(int value) {
		String str = Integer.toBinaryString(value);
		while(str.length()<32) {
			str = "0" + str;
		}
		return str;
	}

}
