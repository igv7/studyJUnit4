package study;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JDialog;

@FunctionalInterface
interface InterFaceble {
	void run();
//	default void run() {
//		
//	}
}


//@SuppressWarnings("all")
public class AnnotationsDemo {

	@Override
	public boolean equals(Object str) {
		return this.equals(str);
	}
	
//	@SuppressWarnings("all")
	@SuppressWarnings({"unchecked", "deprecation"})
	public void run() {
		List list = new ArrayList();
		list.add(""); //unchecked warning
		
		JDialog jd = new JDialog();
		jd.show(); //deprecation warning
//		jd.setVisible(true);
	}
	
	public static void main(String[] args) {
		AnnotationsDemo annotationsDemo = new AnnotationsDemo();
		annotationsDemo.run();
	}
	
}
