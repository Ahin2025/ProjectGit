package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Loginpage {
	WebDriver driver;
	public Loginpage(WebDriver drv) {
        this.driver = drv;  
     // Assign the WebDriver to the class instance
    }
	public void setfirst() {
        WebElement Login = driver.findElement(By.xpath("//button[text()='Login']"));
        Login.click();  
    }

	  public void setLogemail(String email ) {
	        WebElement Email = driver.findElement(By.xpath("//input[@type='email' and @placeholder='Email']"));
	        Email.sendKeys(email);  
	    }
	  public void setLogpass(String Pass) {
	        WebElement LPass = driver.findElement(By.xpath("//input[@type='password' and @placeholder='Password']"));
	        LPass.sendKeys(Pass);  
	    }
	  public void setLogin() {
	        WebElement login = driver.findElement(By.xpath("//button[@type='submit']"));
	        login.click();  // Click the Continue button
	    }

}
