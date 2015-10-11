package maxandmin;

import static org.junit.Assert.*;

import org.junit.Test;

public class MaxandMinTest {

	@Test
	public void test() {
		MaxandMin maxandmin=new MaxandMin();
		int a = maxandmin.findMax("1,13,3131,2");
		assertEquals(a,3131);
		int b = maxandmin.findMin("1,13,3131,2");
		assertEquals(b,1);
	}

}
