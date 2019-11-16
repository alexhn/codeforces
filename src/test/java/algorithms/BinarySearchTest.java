package algorithms;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class BinarySearchTest {

	@Test
	public void testLeftmost() {
		BinarySearch binarySearch = new BinarySearch();
		assertEquals(1, binarySearch.searchLeftmost(new int[] {1, 2}, 2));
		assertEquals(0, binarySearch.searchLeftmost(new int[] {1, 2}, 1));
		assertEquals(1, binarySearch.searchLeftmost(new int[] {1, 2, 2, 2, 5, 5, 5}, 2));
		assertEquals(-1, binarySearch.searchLeftmost(new int[] {1, 2, 2, 2, 5, 5, 5}, 4));
		assertEquals(-1, binarySearch.searchLeftmost(new int[] {1, 2, 2, 2, 5, 5, 5}, -15));
		assertEquals(0, binarySearch.searchLeftmost(new int[] {1, 2, 2, 2, 5, 5, 5}, 1));
		assertEquals(7, binarySearch.searchLeftmost(new int[] {1, 2, 2, 2, 5, 5, 5, 10, 10}, 10));
	}
	
	@Test
	public void testRightmost() {
		BinarySearch binarySearch = new BinarySearch();
		assertEquals(1, binarySearch.searchRightmost(new int[] {1, 2}, 2));
		assertEquals(0, binarySearch.searchRightmost(new int[] {1, 2}, 1));
		assertEquals(3, binarySearch.searchRightmost(new int[] {1, 2, 2, 2, 5, 5, 5}, 2));
		assertEquals(-1, binarySearch.searchRightmost(new int[] {1, 2, 2, 2, 5, 5, 5}, 4));
		assertEquals(-1, binarySearch.searchRightmost(new int[] {1, 2, 2, 2, 5, 5, 5}, -15));
		assertEquals(0, binarySearch.searchRightmost(new int[] {1, 2, 2, 2, 5, 5, 5}, 1));
		assertEquals(8, binarySearch.searchRightmost(new int[] {1, 2, 2, 2, 5, 5, 5, 10, 10}, 10));
	}
	
}
