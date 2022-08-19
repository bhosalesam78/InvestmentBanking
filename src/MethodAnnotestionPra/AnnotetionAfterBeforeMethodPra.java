package MethodAnnotestionPra;

import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class AnnotetionAfterBeforeMethodPra {
    @Test (priority=2)
    public void messege() {
    System.out.println("messege");
    }
    
    @Test  (priority=3)
    public void notification() {
    System.out.println("Notification");
    }
    @Test (priority=1)
    public void post() {
    Reporter.log("Start Tc");
    System.out.println("Post something");
    Reporter.log("End TC");
    }
    
    
	@BeforeMethod
	public void Login () {
		
	System.out.println("login fb");
	
	}
	@AfterMethod
	public void LogOut() {
	
	System.out.println("logout fb");

	
	}

}
