package chap06_Exercise.Exercise14;

public class Member {
	/*클래스 생성자 추가, 외부에서 받은 값으로 초기화 하기 위한 생성자 선언*/
	String name;
	String id;
	String password;
	int age;
	
	Member(String name, String id){
		this.name = name;
		this.id = id;
	}
}
