package sec04.exam03_compare;

public class CompareOperatorExample1 {

	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 10;
		
		boolean result1 = (num1 == num2);
		boolean result2 = (num1 != num2);
		boolean result3 = (num1 <= num2);
		
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
		
		char char1 = 'A';			//65
		char char2 = 'B';			//66
		boolean result4 = (char1 < char2);		//65 < 66?
		
		System.out.println(result4);
	}

}
