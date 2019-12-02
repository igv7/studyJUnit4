package study;

import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

@Retention(RUNTIME)
@Target(METHOD)
public @interface SwitchingAnnotation {
	boolean flag();
}

class Worker {
	public void doThis() {
		System.out.println("Doing this");
	}
	public void doThat() {
		System.out.println("Doing that");
	}
	
	public void work(boolean flag) {
		if (flag) {
			doThis();
		} else {
			doThat();
		}
	}
	
static class Test {
	public static void main(String[] args) {
		try {
			SwitchingAnnotation switchingAnnotation = Worker.class.getMethod("work", boolean.class)
					.getAnnotation(SwitchingAnnotation.class);
			new Worker().work(switchingAnnotation.flag());
		} catch (NoSuchMethodException name) {
			System.out.println(name);
		}
	}
}
	
}
