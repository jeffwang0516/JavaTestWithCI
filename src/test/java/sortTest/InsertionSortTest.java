package sortTest;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import sorter.Sort;

public class InsertionSortTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		Sort sort = new Sort();
		int[] arr = {13, 7, 6, 45, 21, 9, 101, 102}; 
		int[] expectedSortedArray = {6, 7, 9, 13, 21, 45, 101, 102};
		
		int[] sorted = sort.insertion(arr);
         
        assertTrue("Array should be in correct order", Arrays.equals(sorted, expectedSortedArray));
	}

}
