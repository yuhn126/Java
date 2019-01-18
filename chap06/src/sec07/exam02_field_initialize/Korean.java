package sec07.exam02_field_initialize;

public class Korean {
	String nation = "대한민국";
	String name;
	String ssn;
	
	public Korean(String name, String ssn) {
		this.name = name;		//this를 넣어 필드임을 명시
		this.ssn = ssn;
	}
}
