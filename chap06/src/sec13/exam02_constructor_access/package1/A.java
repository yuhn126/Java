package sec13.exam02_constructor_access.package1;

public class A {
	A a1 = new A(true);
	A a2 = new A();
	A a3 = new A("문자열");
	
	public A(boolean b) {}		//접근 제한x
	A() {}						//같은 패키지에서만 사용 가능
	private A(String s) {}		//자기 자신 클래스 내부에서만 사용 가능
}