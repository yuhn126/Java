package sec03.exam05_continue;

public class ContinueExample {

	public static void main(String[] args) {
		for(int i=1; i<=10; i++) {
			if(i%2 != 0) {
				continue;			//반복문의 처음으로 돌아간다
			}
			
			System.out.println(i);
		}

	}

}
