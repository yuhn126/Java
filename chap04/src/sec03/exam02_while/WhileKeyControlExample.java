package sec03.exam02_while;

public class WhileKeyControlExample {

	public static void main(String[] args) throws Exception {
		boolean run = true;			//run�� false�� �Ǹ� �ݺ� ����x
		int speed = 0;
		int keyCode = 0;
		
		while(run){
			if(keyCode!=13 && keyCode!=10) {		//����Ű�� ������ �� �ԷµǴ� 10�� 13
				System.out.println("---------------------------------");
				System.out.println("1.���� |2.����|3.����");
				System.out.println("---------------------------------");
				System.out.print("����: ");
			}
			
			keyCode = System.in.read();		//�Է¹��� Ű�� ������ ����
			
			if(keyCode == 49) {		//1����
				speed++;
				System.out.println("���� �ӵ� = " + speed);
			} else if (keyCode == 50) {		//2����
				speed--;
				System.out.println("���� �ӵ� = " + speed);
			} else if (keyCode == 51) {
				run = false;		//while�� ����
			}
		}
		System.out.println("���α׷� ����");
	}
}
