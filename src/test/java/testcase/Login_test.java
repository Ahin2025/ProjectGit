package testcase;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import base.Testbase;
import page.Loginpage;

public class Login_test extends Testbase{
	 Loginpage obj;
	    // This method runs before all tests in the class to initialize the necessary resources
	    @BeforeClass
	    public void call() {
	        obj = new Loginpage(driver);  // Initialize the Signup_page with the WebDriver instance
	    }

	    // This is the test method that will execute the signup process
	    @Test
	    public void sign() {
	    	obj.setfirst();
	        obj.setLogemail("princy@gmail.com");
	    	obj.setLogpass("123456");
	    	obj.setLogin();
	    }
}
