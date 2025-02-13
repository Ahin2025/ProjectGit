package testcase;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import base.Testbase;
import page.Signup_page;

public class Signup_test extends Testbase {
     // Declare the Signup_page object
    Signup_page obj;
    // This method runs before all tests in the class to initialize the necessary resources
    @BeforeClass
    public void call() {
        obj = new Signup_page(driver);  // Initialize the Signup_page with the WebDriver instance
    }

    // This is the test method that will execute the signup process
    @Test
    public void sign() {
        // Call the method to click the "Login" button to go to the login page
        obj.setfirst();

        // Call the method to click the "New User? Register" link to go to the registration page
        obj.setSecond();

        // Call the method to input the user's name
        obj.setName("Ahin");

        // Call the method to input the user's email address
        obj.setEmail("princy@gmail.com");

        // Call the method to input the user's password
        obj.setPassword("123456");

        // Call the method to input the user's phone number
        obj.setPhoneno("9128374567");

        // Call the method to input the batch name
        obj.setBatchname("ST");

        // Call the method to check the checkbox if it's not already selected
        obj.setcheckbox();

        // Call the method to click the "Submit" button and proceed
        obj.Continuee();

        // Call the method to handle any popup that may appear
        obj.popup();
    }
}
