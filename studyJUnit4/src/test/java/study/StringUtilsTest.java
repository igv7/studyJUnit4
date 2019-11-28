package study;

import static org.junit.Assert.*;

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
	public void testBubblXeSort() {
		int[] arr = {4, 12, -17, 3};
		int[] expected = {-17, 3, 4, 12};
		study.Test.bubbleSort(arr);
		assertArrayEquals(expected, arr);
	}


}
