package sec02.exam01_if;

public class IfNestedExample {

	public static void main(String[] args) {
		int score = (int)(Math.random()*30) + 71;		//81~100
		System.out.println("점수 = " + score);
		
		String grade;
		
		if(score>=90) {
			if(score>=95) {
				grade = "A+";
			} else {
				grade = "A";
			}
		} else if (score>=80) {
			if(score>=85) {
				grade = "B+";
			} else {
				grade = "B";
			}
		} else {
			if(score>=75) {
				grade = "C+";
			} else {
				grade = "C";
			}
		}
		
		System.out.println("학점 = " + grade);
	}

}
