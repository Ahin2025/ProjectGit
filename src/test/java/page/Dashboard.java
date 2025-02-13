package page;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Dashboard {
	WebDriver  driver;
	public Dashboard(WebDriver driver) {
		this.driver=driver;
		}
	public void setfirst() {
		WebElement Log=driver.findElement(By.xpath("//button[@class='btn' and text()='Login']"));
		Log.click();
	}
	public void Emaill(String email) {
		WebElement logg=driver.findElement(By.xpath("//input[@type='email' and @placeholder='Email']"));
		logg.sendKeys(email);
	}
		public void Pass(String passw) {
		WebElement pass=driver.findElement(By.xpath("//input[@type='password' and @placeholder='Password']"));
		pass.sendKeys(passw);
	}
	public void Submitt() {
		WebElement click=driver.findElement(By.xpath("//button[@type='submit']"));
		click.click();
	}

		 public void projectTopicClick() throws InterruptedException {
		        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		        WebElement readmore = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//button[text()='Read more']")));

		        JavascriptExecutor js = (JavascriptExecutor) driver;
		        js.executeScript("arguments[0].scrollIntoView(true);", readmore);
		        Thread.sleep(1000); // Ensure the scroll completes

		       readmore.click();
		    }

	public void checkAgree() throws InterruptedException
	{
	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	    WebElement clickcheck=driver.findElement(By.xpath("//input[@name='acceptTerms']"));

	    JavascriptExecutor js = (JavascriptExecutor) driver;
	    js.executeScript("arguments[0].scrollIntoView(true);", clickcheck);
	    Thread.sleep(1000); // Ensure the scroll completes
	    clickcheck.click();
	}
	public void checkProceed()
	{
	    driver.findElement(By.xpath("//*[text()='Proceed']")).click();
	    
	}
	
	
	
	public void getProjectDashboard()
	{
	JavascriptExecutor js = (JavascriptExecutor) driver;
	js.executeScript("window.scrollTo(0, 0);"); // Scroll to top
	WebElement prjdash=driver.findElement((By.xpath("//u[text()='PROJECT DASHBOARD']")));
	System.out.println(prjdash.getText());
	}
	public void getProjectOverview()
	{
	WebElement proover=driver.findElement(By.xpath("//button[text()='PROJECT OVERVIEW DOCUMENT']"));
	proover.click();
	}
	public void ReferenceMaterial() {
		   // Initialize WebDriverWait
		        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		        // Click "REFERENCE MATERIALS"
		        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@id='v-pills-reference-tab' and @type='button']"))).click();
		       
		       
		        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@type='text' and @value='P001']")));
		        // Click "Get Reference"
		        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Get Reference']"))).click();
		       
		// in this prg it only goes to second reference      
		        String mainWindow = driver.getWindowHandle();
	
		        // List of reference links to be clicked one by one
		        String[] references = {"Reference 1", "Reference 2", "Reference 3", "Reference 4"};
	
		        for (String ref : references) {
		            // Click on each reference link
		            WebElement reference = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[text()='" + ref + "']")));
		            reference.click();
	
		           
		           
		            // Wait for the new tab to open
		           wait.until(ExpectedConditions.numberOfWindowsToBe(2));
		           
		            // Get all window handles
		            Set<String> allWindows = driver.getWindowHandles();
	
		            // Switch to the new tab
		            for (String window : allWindows) {
		                if (!window.equals(mainWindow)) {
		                    driver.switchTo().window(window);
		                    break;
		                }
		            }
	
		            // Wait for the reference page to load and get the URL
		            wait.until(ExpectedConditions.urlContains("researchgate.net"));
		            String actres = driver.getCurrentUrl();
		            System.out.println("Redirected URL: " + actres);
	
		            // Close the new tab and switch back to the main window
		            driver.close();
		            driver.switchTo().window(mainWindow);
		        }
		        }
//	public void getProjectDashboard1()
//	{
//	JavascriptExecutor js = (JavascriptExecutor) driver;
//	js.executeScript("window.scrollTo(0, 0);"); // Scroll to top
//	WebElement prjdash=driver.findElement((By.xpath("//u[text()='PROJECT DASHBOARD']")));
//	System.out.println(prjdash.getText());
//	}
//	public void getProjectOverview1()
//	{
//	WebElement proover=driver.findElement(By.xpath("//button[text()='PROJECT OVERVIEW DOCUMENT']"));
//	proover.click();
//	
//	            // Switch to the new tab
//		            for (String window : allWindows) {	                if (!window.equals(mainWindow)) {
//	                    driver.switchTo().window(window);
//		                    break;
//		                }
//		            }
//	
//		            // Wait for the reference page to load and get the URL
//		            wait.until(ExpectedConditions.urlContains("researchgate.net"));
//		            String actres = driver.getCurrentUrl();
//		            System.out.println("Redirected URL: " + actres);
//	
//		            // Close the new tab and switch back to the main window
//		            driver.close();
//		            driver.switchTo().window(mainWindow);
//		        }
//		        
//	
//	
//public void getProjectOverview()
//{
//WebElement proover=driver.findElement(By.xpath("//button[text()='PROJECT OVERVIEW DOCUMENT']"));
//proover.click();
//}
//public void ReferenceMaterial() {
//	   // Initialize WebDriverWait
//	        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//	        // Click "REFERENCE MATERIALS"
//	        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@id='v-pills-reference-tab' and @type='button']"))).click();
//	       
//	       
//	        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@type='text' and @value='P001']")));
//	        // Click "Get Reference"
//	        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Get Reference']"))).click();
	       
	// in this prg it only goes to second reference      
//	        String mainWindow = driver.getWindowHandle();
//
//	        // List of reference links to be clicked one by one
//	        String[] references = {"Reference 1", "Reference 2", "Reference 3", "Reference 4"};
//
//	        for (String ref : references) {
//	            // Click on each reference link
//	            WebElement reference = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[text()='" + ref + "']")));
//	            reference.click();
//
//	           
//	           
//	            // Wait for the new tab to open
//	           wait.until(ExpectedConditions.numberOfWindowsToBe(2));
//	           
//	            // Get all window handles
//	            Set<String> allWindows = driver.getWindowHandles();
//
//	            // Switch to the new tab
//	            for (String window : allWindows) {
//	                if (!window.equals(mainWindow)) {
//	                    driver.switchTo().window(window);
//	                    break;
//	                }
//	            }
//
//	            // Wait for the reference page to load and get the URL
//	            wait.until(ExpectedConditions.urlContains("researchgate.net"));
//	            String actres = driver.getCurrentUrl();
//	            System.out.println("Redirected URL: " + actres);
//
//	            // Close the new tab and switch back to the main window
//	            driver.close();
//	            driver.switchTo().window(mainWindow);
//	        }
//	        }

	
	
//	public void getProjectOverview() {
//	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
//	 WebElement projOver = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='PROJECT OVERVIEW DOCUMENT']")));
//	 projOver.click();
//	}
//	public void getProjectOverview()
//	{
//	 WebElement proover=driver.findElement(By.xpath("//button[text()='PROJECT OVERVIEW DOCUMENT']"));
//	 proover.click();
//	}
//
//
//	public void Getrefer() {
//        try {
//            WebElement GRM1 = driver.findElement(By.xpath("//button[text()='Get Reference']"));
//            GRM1.click();
//            // Add some wait time here if necessary to ensure page is loaded
//        } catch (NoSuchElementException e) {
//            System.out.println("Get Reference button not found");
//        }
//    }
//
//    // Method to handle 'Project not found!' error and click on 'Reference 1'
//    public void Refere1() {
//        try {
//            // Check if the "Project not found!" message is displayed
//            WebElement errorElement = driver.findElement(By.xpath("//div[text()='Project not found!']"));
//            if (errorElement.isDisplayed()) {
//                System.out.println("Error: Project not found!");
//                return; // exit if the error message is displayed
//            }
//
//            // If no error, proceed to click on "Reference 1"
//            WebElement RM1 = driver.findElement(By.xpath("//a[text()='Reference 1']"));
//            RM1.click();
//            // Add a small wait to ensure the page is loaded before navigating back
//            Thread.sleep(2000); // Sleep for 2 seconds (you can adjust the time)
//            driver.navigate().back(); // Navigate back to previous page
//        } catch (NoSuchElementException e) {
//            System.out.println("Reference or error message not found");
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//    }
//
//    
//	public void ReferenceMaterial()
//	{
//	 WebElement refMaterial=driver.findElement(By.xpath("//button[text()='REFERENCE MATERIALS']"));
//	 refMaterial.click();
//	 
//	}
//	public void getReferenceMaterial()
//	{
//	 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
//	 WebElement refMatl=driver.findElement(By.xpath("//*[text()='Get Reference']"));
//	 refMatl.click();
//	}
//	
//	public void Refe1() {
//		WebElement RM1=driver.findElement(By.xpath("//a[text()='Reference 1']"));
//		RM1.click();
//		driver.navigate().back(); 
//	}

	 
	public void Viva() {
		WebElement vivavoce=driver.findElement(By.xpath("//button[@id='v-pills-viva-tab']"));
		vivavoce.click();
	}
   
// Add Viva Voce functionality
public void viewVivaVoceGuidelines() throws InterruptedException {
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    WebElement viewGuidelinesButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='View Detailed Guidelines']")));
    
    JavascriptExecutor js = (JavascriptExecutor) driver;
    js.executeScript("arguments[0].scrollIntoView(true);", viewGuidelinesButton);
    Thread.sleep(1000); // Ensure the scroll completes

    viewGuidelinesButton.click();
    System.out.println("Viva Voce Guidelines viewed.");
}

public void submitViva() throws InterruptedException {
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    WebElement submitButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Submit Your Viva']")));

    JavascriptExecutor js = (JavascriptExecutor) driver;
    js.executeScript("arguments[0].scrollIntoView(true);", submitButton);
    Thread.sleep(1000); // Ensure the scroll completes

    submitButton.click();
    System.out.println("Viva submitted successfully.");
}
}


