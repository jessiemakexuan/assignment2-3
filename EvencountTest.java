package evencount;

import org.junit.Assert;
import org.junit.Test;

public class EvencountTest {

	@Test
	public void test() {
		Evencount counttest=new Evencount();
		int[] test3=counttest.count(6);
		int[] expected = new int[]{2,4,6};
		Assert.assertArrayEquals(expected,test3);
	}

}
