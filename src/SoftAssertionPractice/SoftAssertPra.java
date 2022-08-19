package SoftAssertionPractice;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertPra {
	@Test
	public void m1() {
	SoftAssert s= new SoftAssert();
	String a="sam";
	String b="sam";
	
	s.assertNotEquals(a, b);
	System.out.println(s);
	}
	@Test
	public void m2() 
{
		SoftAssert a= new SoftAssert();
	String h="sam";
	String f="samhb";
	
	a.assertEquals(h, f);
	System.out.println(a);

}
}