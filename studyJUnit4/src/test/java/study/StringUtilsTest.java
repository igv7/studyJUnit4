package study;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class StringUtilsTest {
	
	StringUtils su = new StringUtils(); //Live object (if our methods aren't static)

	// "  **" ---> "**", " **" ---> "**", "****" ---> "****", "**  " ---> "**  "	
//	@Test
//	public void testChopOff2SpacesAtHead() {
//		fail("Not yet implemented");
		
//		String expected = "**";
//		String actual = study.StringUtils.chopOff2SpacesAtHead("  **");
//		assertEquals(expected, actual);
		
//		assertEquals("**", study.StringUtils.chopOff2SpacesAtHead("  **"));
//		assertEquals("**", study.StringUtils.chopOff2SpacesAtHead(" **"));
//		assertEquals("****", study.StringUtils.chopOff2SpacesAtHead("****"));
//		assertEquals("**  ", study.StringUtils.chopOff2SpacesAtHead("**  "));
//	}
	
	@Test
	public void testChopOff2SpacesAtHead_BothAtLeft() {
		assertEquals("**", study.StringUtils.chopOff2SpacesAtHead("  **"));
//		assertEquals("**", su.chopOff2SpacesAtHead("  **"));
	}
	
	@Test
	public void testChopOff2SpacesAtHead_Single() {
		assertEquals("**", study.StringUtils.chopOff2SpacesAtHead(" **"));
//		assertEquals("**", su.chopOff2SpacesAtHead(" **"));
	}
	
	@Test
	public void testChopOff2SpacesAtHead_None() {
		assertEquals("****", study.StringUtils.chopOff2SpacesAtHead("****"));
//		assertEquals("****", su.chopOff2SpacesAtHead("****"));
	}
	
	@Test
	public void testChopOff2SpacesAtHead_BothAtRight() {
		assertEquals("**  ", study.StringUtils.chopOff2SpacesAtHead("**  "));
//		assertEquals("**  ", su.chopOff2SpacesAtHead("**  "));
	}
	
	
	
	//****************************************************************************************************************************
	
	// "1234" --> false, "1212" ---> true, "12" --> true, "1" --> false
//	@Test
//	public void testAre2CharsAtHeadAndTailEqual() {
//		assertEquals(false, study.StringUtils.are2CharsAtHeadAndTailEqual("1234"));
//		assertEquals(true, study.StringUtils.are2CharsAtHeadAndTailEqual("1212"));
//		assertEquals(true, study.StringUtils.are2CharsAtHeadAndTailEqual("12"));
//		assertEquals(false, study.StringUtils.are2CharsAtHeadAndTailEqual("1"));
//		assertEquals(true, study.StringUtils.are2CharsAtHeadAndTailEqual("13713"));
//		assertEquals(false, study.StringUtils.are2CharsAtHeadAndTailEqual("13714"));
//	}
	
	@Test
	public void testAre2CharsAtHeadAndTailEqual_AllDifferentSymbols() {
//		assertFalse("All Different Symbols", su.are2CharsAtHeadAndTailEqual("1234"));
		assertFalse(su.are2CharsAtHeadAndTailEqual("1234"));
	}
	
	@Test
	public void testAre2CharsAtHeadAndTailEqual_AllSameSymbols() {
		assertTrue(su.are2CharsAtHeadAndTailEqual("1212"));
	}
	
	@Test
	public void testAre2CharsAtHeadAndTailEqual_TwoSymbols() {
		assertTrue(su.are2CharsAtHeadAndTailEqual("12"));
	}
	
	@Test
	public void testAre2CharsAtHeadAndTailEqual_OneSymbol() {
		assertFalse(su.are2CharsAtHeadAndTailEqual("1"));
	}
	
	//***************************************************************************************************************************
	
	@Test
	public void testBubbleSort() {
		int[] arr = {4, 12, -17, 3};
		int[] expected = {-17, 3, 4, 12};
		study.Test.bubbleSort(arr);
		assertArrayEquals(expected, arr);
	}
	
	//***************************************************************************************************************************
	
	static User user = new User("Moshe", 24);
	
	@BeforeClass
	public static void setUpBeforeClass() {
		System.out.println("in setUpBeforeClass()");
		user.setAge(25);
	}
	
//	@Before
//	public void setUp() {
//		System.out.println("in setUp()");
//		user.setAge(25);
//	}
	
	@Test
	public void test1() {
		System.out.println("in test1()");
		System.out.println(user.getAge());
	}
	
	@Test
	public void test2() {
		System.out.println("in test2()");
		System.out.println(user.getAge());
	}
	
//	@After
//	public void tearDown() {
//		System.out.println("in tearDown()");
//		user.setAge(24);
//	}
	
	@AfterClass
	public static void tearDownAfterClass() {
		System.out.println("in tearDownAfterClass()");
		user.setAge(24);
	}
	
	//***************************************************************************************************************************
	
	@Test
	public void testBubbleSort_2() {
		int[] arr = null;
		int[] expected = {-17, 3, 4, 12};
		try {
			study.Test.bubbleSort(arr);
		} catch (NullPointerException npe) {
			System.out.println("Caught an NPE!");
		}
		assertArrayEquals(expected, arr);
	}
	
	@Test(expected = NullPointerException.class)
	public void testBubbleSort_3() {
		int[] arr = null;
		int[] expected = {-17, 3, 4, 12};
		study.Test.bubbleSort(arr);
		assertArrayEquals(expected, arr);
	}


}
