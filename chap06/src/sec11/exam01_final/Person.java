package sec11.exam01_final;

public class Person {
	final String nation = "Korea";		//수정 불가
	final String ssn;
	String name;
	
	public Person(String ssn, String name) {
		this.ssn = ssn;
		this.name = name;
		//nation = "America";		수정 불가
	}
}
