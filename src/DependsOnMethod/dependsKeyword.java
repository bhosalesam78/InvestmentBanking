package DependsOnMethod;

import org.testng.Assert;
import org.testng.annotations.Test;

public class dependsKeyword {
	@Test (priority = 1)
	public void openurl() {
		System.out.println("url opened");
		Assert.fail(); //fail testcase 
	}
	
	@Test(priority = 2, dependsOnMethods = "openurl")
	public void login() {
		System.out.println("Logged in to the application sucessfully");
	}
	
	@Test (priority = 3,dependsOnMethods= {"openurl","login"} )
	public void logout() {
		System.out.println("Logged out from the application");
	}
	//(all testcase fail due to dependesOnmethod)


}
