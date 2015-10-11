package prime;

import static org.junit.Assert.*;

import org.junit.Test;


public class PrimeTest {

	@Test
	public void test() {
		Prime primetest=new Prime();
		boolean test2=primetest.check(13);
		assertTrue(test2);
	}

}
