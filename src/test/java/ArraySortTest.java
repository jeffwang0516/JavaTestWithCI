import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ArraySortTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		int[] arr = {13, 7, 6, 45, 21, 9, 101, 102}; 
		int[] orderedArray = {6, 7, 9, 13, 21, 45, 101, 102};
        Arrays.sort(arr); 
        assertTrue("Array should be in correct order", Arrays.equals(arr, orderedArray));
	}

}
