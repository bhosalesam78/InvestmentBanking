package SoftAssertionPractice;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SoftAssert {

//==> To overcome the drawbacks of Hard asserts we need to use soft assert.
//==> It is a class which contains non static methods to do the verification.
//==> Soft Assert will do verification, if any verification is failed, notifies and executes the rest of the verification  in the test method.

	@Test
	public void sample3() {
		SoftAssert soft1 = new SoftAssert();
		
	String str1="Hi";
	String str2="Hi";
	
	
	

	
	
	String str3="hello";
	Assert.assertEquals(str3, "Sam");

	}
	@Test
	public void sample4() {
		System.out.println("Automation");
	}
}