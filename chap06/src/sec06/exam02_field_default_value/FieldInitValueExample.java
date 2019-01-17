package sec06.exam02_field_default_value;

public class FieldInitValueExample {

	public static void main(String[] args) {
		//실행 클래스
		FieldInitValue fiv = new FieldInitValue();
		
		System.out.println("byteField : " + fiv.byteField);
		System.out.println("shortField : " + fiv.shortField);
		System.out.println("intField : " + fiv.intField);
		System.out.println("longField : " + fiv.longField);
		
		System.out.println("booleanField : " + fiv.booleanField);
		System.out.println("charField : " + fiv.charField);		//유니코드로 0번 저장(빈 문자열)
		
		System.out.println("floatField : " + fiv.floatField);
		System.out.println("doubleField : " + fiv.doubleField);
		
		System.out.println("arrField : " + fiv.arrField);
		System.out.println("referenceField : " + fiv.referenceField);
	}

}
