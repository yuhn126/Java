package sec04.exam07_conditional;

public class ConditionalOperationExample {

	public static void main(String[] args) {
		int score = 85;
		
		char grade = (score>90) ? 'A' : ((score>80) ? 'B' : 'C');
		
		System.out.println(score + "���� " + grade + "����Դϴ�.");
		
		/*
		�����ڵ�
		
		char grade;
		 
		if(score>90) {
			grade = 'A';
		} else if (score>80) {
			grade = 'B';
		} else {
			grade = 'C';
		}
		
		System.out.println(score + "���� " + grade + "����Դϴ�.");
		
		
		*/
		

	}

}
