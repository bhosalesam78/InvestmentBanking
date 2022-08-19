package ThreadPoolSizePractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
// Parallel execution 
public class ThreadPoolSize {
	@Test (invocationCount = 5,threadPoolSize = 5)
	public void openBrowser() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sambodhi\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		driver.close();
	}

}

