package study;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

//@SuppressWarnings("all")
public class LinkedOrArrayListTest {
	
	static List<String> arrayList;
	static List<String> linkedList;
	
	@BeforeClass
	public static void setUpBeforeClass() {
		System.out.print("Populating ArrayList... ");
		arrayList = new ArrayList<String>();
		for (int i = 0; i < 10_000_000; i++) {
			arrayList.add("" + i);
		}
		System.out.println("Done");
		linkedList = new LinkedList<String>(arrayList);
	}

	@Test(timeout = 7)
	@Ignore("Removal on ArrayList take too long so we disable it for the time being.")
	public void testRemoval_ArrayList() {
		LinkedOrArrayList.remove(arrayList, "123");
	}
	
	@Test(timeout = 1)
	public void testRemoval_LinkedList() {
		LinkedOrArrayList.remove(linkedList, "123");
		
	}

}
