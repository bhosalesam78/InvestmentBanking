package HardAssertionsPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class aseertTrue {
	
	@Test 
	
	public void AssertTrue() {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Sambodhi\\Downloads\\chromedriver_win32\\chromedriver.exe" );
	
	WebDriver w= new ChromeDriver();
	
	w.get("https://www.facebook.com");
	
//    WebElement	Username=w.findElement(By.xpath("//input[@name='email']"));
//	
//	Username.sendKeys("bhosalesam");
	
	//Password
	
//	WebElement Password=w.findElement(By.xpath("//input[@name='pass']"));
//      Password.sendKeys("//input[@name='pass']");
	
//		 WebElement LoginBtn = w.findElement(By.xpath("//button[@type='submit']"));
//		 LoginBtn.click();
    //2. click():- clicking ==> buttons/ radiobutton/ checkbox/ link 
      //click
//      	WebElement SignupLink = w.findElement(By.xpath("//a[text()='Sign Up']"));
//		SignupLink.click();
	
	
		//3. isEnabled :- state of  the element.
		 WebElement Username = w.findElement(By.xpath("//input[@id='email']"));
		 System.out.println(Username.isEnabled());
		 Assert.assertTrue(Username.isEnabled());
//		 if(Username.isEnabled()==true) {
//			 System.out.println("User name field is enabled");
//		 }else {
//			 System.out.println("Username field is disabled");
//		 }
//			//3. isDisplayed :- visualization of an element.
			WebElement FbLogo = w.findElement(By.xpath("//img[@class='fb_logo _8ilh img']"));
			Assert.assertTrue(FbLogo.isDisplayed());
//			if(FbLogo.isDisplayed()== true) {
//				System.out.println("FB Logo is displayed");
//			}else {
//				System.out.println("FB Logo is not displayed");
//			}
//			//4. isSelected :- checkbox and radioButton
			WebElement SignupLink = w.findElement(By.xpath("//a[text()='Sign Up']"));
			SignupLink.click();
			WebElement WomenRadioBtn = w.findElement(By.xpath("//input[@value='1']"));
			WomenRadioBtn.click();
			Assert.assertTrue(WomenRadioBtn.isSelected());
//			
//			if(WomenRadioBtn.isSelected()==true) {
//				System.out.println("Women Radio button is selected");
//			}else {
//				System.out.println("Women Radio button is not selected");
//			}
	
		
		}
}
