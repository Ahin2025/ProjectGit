package base;
import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class Testbase {
 // WebDriver instance declaration
 protected WebDriver driver;
 // This method will be executed before the test starts
 @BeforeTest
 // Initialize the ChromeDriver (the browser)
    public void First() {
	 driver=new ChromeDriver();
	// Open the specified URL in the browser
	 driver.get("https://internship-ictak.vercel.app/");
	// Maximize the browser window
	 driver.manage().window().maximize();
	// Set an implicit wait to handle dynamic elements loading
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
 }
}
