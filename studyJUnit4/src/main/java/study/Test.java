package study;

import java.lang.reflect.Modifier;

public final class Test {
	
	public static void bubbleSort(int[] arr) {
		int n = arr.length;
		for (int i = 0; i < n-1; i++) {
			for (int j = 0; j < n-i-1; j++) {
				if (arr[j] > arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
	}

	public static void main(String[] args) {
		
		int a = 9;
		assert a == 10 : "a is not 10";
		
//		@SuppressWarnings("rawtypes")
		Class<?> clazz = Test.class;
		System.out.println(clazz.getModifiers());
		System.out.println(Modifier.isFinal(clazz.getModifiers()));
		System.out.println(Modifier.isPublic(clazz.getModifiers()));
		System.out.println(Modifier.isInterface(clazz.getModifiers()));
		System.out.println(clazz.getPackageName());
		System.out.println(clazz.getName());

	}

}
