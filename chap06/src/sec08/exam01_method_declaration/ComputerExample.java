package sec08.exam01_method_declaration;

public class ComputerExample {

	public static void main(String[] args) {
		Computer myCom = new Computer();
		
		int[] values1 = { 1, 2, 3 };			//배열을 미리 만듦
		int result1 = myCom.sum1(values1);
		System.out.println("result1 : " + result1);
		
		int result2 = myCom.sum1(new int[] {1,2,3});		//메소드 호출 시 직접 매개값으로 배열 생성
		System.out.println("result2 : " + result2);
		
		int result3 = myCom.sum2(1,2,3);
		System.out.println("result3 : " + result3);
		
		int result4 = myCom.sum2(1,2,3,4,5,6);
		System.out.println("result4 : " + result4);
	}

}
