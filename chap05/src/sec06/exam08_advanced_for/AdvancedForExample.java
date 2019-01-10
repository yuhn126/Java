package sec06.exam08_advanced_for;

public class AdvancedForExample {

	public static void main(String[] args) {
		int[] scores = {95,71,84,93,87};
		
		int sum = 0;
		for(int score : scores) {		//항목의 갯수만큼 반복
			sum += score;
		}
		System.out.println("점수 종합  = " + sum);
		
		double avg = (double)sum/scores.length;
		System.out.println("점수 평균  = " + avg);
	}

}
