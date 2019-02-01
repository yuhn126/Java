package sec15.exam01_annotation;

import java.lang.reflect.*;

public class PrintAnnotationExample {

	public static void main(String[] args) {
		//Service 클래스로부터 메소드 정보를 얻음
		Method[] declaredMethods = Service.class.getDeclaredMethods();

		for(Method method : declaredMethods) {
			if(method.isAnnotationPresent(PrintAnnotation.class)) {
				System.out.println(method.getName() + "에는 적용되어 있음.");
			} else {
				System.out.println(method.getName() + "에는 적용되어 있지 않음.");
			}
		}
		
	}

}
