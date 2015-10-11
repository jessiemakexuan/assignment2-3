package modifycounta;

import org.junit.Assert;
import org.junit.Test;

public class CountLetterTest {

	@Test
	public void test5() {
		CountLetter counttest5=new CountLetter();
		int test5=counttest5.countletter("northeastern", 'o');
		Assert.assertEquals(1, test5);
	}
	public void test4(){
		CountLetter counttest4=new CountLetter();
		int test4=counttest4.countlettera("northeastern");
		Assert.assertEquals(1, test4);
	}

}
