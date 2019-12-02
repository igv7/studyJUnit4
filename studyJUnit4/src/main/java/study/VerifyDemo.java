package study;

import java.lang.reflect.*;

public class VerifyDemo {

	public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		
		@SuppressWarnings("rawtypes")
		Class clazz = Class.forName("study.Pupil");
		Pupil pupil = new Pupil();
		
		for (Method method: clazz.getMethods()) {
			Verify verify = method.getAnnotation(study.Verify.class);
			if (verify != null) {
				Object result = method.invoke(pupil);
				if ((Boolean)result == true) {
					System.out.println(method.getName()+ " passed");
				} else {
					System.out.println(method.getName()+ " faild");
				}
			}
		}

	}

}
