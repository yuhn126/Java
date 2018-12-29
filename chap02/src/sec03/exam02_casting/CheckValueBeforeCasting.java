package sec03.exam02_casting;

public class CheckValueBeforeCasting {

	public static void main(String[] args) {
	
		int i = 128;
		
		byte b = (byte)i;				//byte의 범위 = -128 ~ 127
		System.out.println(b +"\n");			//엉뚱한 값 저장
		
		if(i<-128 || i>127) {				//(i<Byte.MIN_VALUE || i>Byte.MAX_VALUE) 써도 됨 (상수)
			System.out.println("byte타입으로 변환 할 수 없습니다.");
			System.out.println("값을 다시 확인 해 주세요.");
		} else {
			b = (byte)i;
			System.out.println(b);
		}
		
	}

}
