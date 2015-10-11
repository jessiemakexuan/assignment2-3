package digits;

import org.junit.Assert;
import org.junit.Test;

public class DigitsTest {

	@Test
	public void test() {
		Digits testdigit=new Digits();
		int test1=testdigit.findDigits(5432);
		Assert.assertEquals(4, test1); 
	}

}
