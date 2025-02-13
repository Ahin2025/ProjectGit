package page;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Signup_page {
    WebDriver driver;

    // Constructor to initialize WebDriver
    public Signup_page(WebDriver drv) {
        this.driver = drv;  
     // Assign the WebDriver to the class instance
    }

    // Click the "Login" button to navigate to the login page
    public void setfirst() {
        WebElement Login = driver.findElement(By.xpath("//button[text()='Login']"));
        Login.click();  
    }

    // Click the "New User? Register" link to navigate to the registration page
    public void setSecond() {
        WebElement Newuser = driver.findElement(By.linkText("New User? Register"));
        Newuser.click();  
    }

    // Enter the user's name into the Name field in the form
    public void setName(String Name) {
        WebElement name = driver.findElement(By.xpath("//input[@type='text' and @placeholder='Name']"));
        name.sendKeys(Name);  // Input the Name into the text field
    }

    // Enter the user's email into the Email field in the form
    public void setEmail(String Email) {
        WebElement email = driver.findElement(By.xpath("//input[@type='email' and @placeholder='Email']"));
        email.sendKeys(Email);  // Input the Email into the text field
    }

    // Enter the user's password into the Password field in the form
    public void setPassword(String Pass) {
        WebElement pass = driver.findElement(By.xpath("//input[@type='password' and @placeholder='Password']"));
        pass.sendKeys(Pass); 
    }

    // Enter the user's phone number into the Phone Number field in the form
    public void setPhoneno(String phone) {
        WebElement Phone = driver.findElement(By.xpath("//input[@type='text' and @placeholder='Phone Number']"));
        Phone.sendKeys(String.valueOf(phone));  // Input the Phone Number into the text field
    }

    // Enter the batch name into the Batch Name field in the form
    public void setBatchname(String Batch) {
        WebElement batch = driver.findElement(By.xpath("//input[@type='text' and @placeholder='Batch Name']"));
        batch.sendKeys(Batch);  // Input the Batch Name into the text field
    }

    // Select the checkbox (if it is not already selected)
    public void setcheckbox() {
        WebElement checkbox = driver.findElement(By.xpath("//input[@type='checkbox']"));
        if (!checkbox.isSelected()) {  // If checkbox is not selected
            checkbox.click();  // Click the checkbox to select it
        }
    }

    // Click the "Submit" button to continue to the next step
    public void Continuee() {
        WebElement contin = driver.findElement(By.xpath("//button[@type='submit']"));
        contin.click();  // Click the Continue button
    }

    // Handle any pop-up alert by accepting it
    public void popup() {
        try {
            // Wait for an alert to appear and accept it
            new WebDriverWait(driver, Duration.ofSeconds(5)).until(ExpectedConditions.alertIsPresent()).accept();
            System.out.println("Popup handled successfully!");  // Success message if alert is accepted
        } catch (NoAlertPresentException e) {
            // If no alert appears, print this message
            System.out.println("No popup appeared.");
        }
    }
}
