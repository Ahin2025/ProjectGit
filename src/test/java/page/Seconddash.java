package page;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.lang.reflect.Method;
import java.time.Duration;

public class Seconddash {
	  WebDriver driver;

	    public Seconddash(WebDriver driver) {
	        this.driver = driver;
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
		public void getProjectDashboard1()
		{
		 JavascriptExecutor js = (JavascriptExecutor) driver;
		 js.executeScript("window.scrollTo(0, 0);");  // Scroll to top

		 WebElement prjdash=driver.findElement((By.xpath("//u[text()='PROJECT DASHBOARD']")));
		 System.out.println(prjdash.getText());
		 
		}
	     //Method to click on "REFERENCE MATERIALS"
	    public void clickReferenceMaterials() throws InterruptedException {
	        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	        WebElement referenceMaterials = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//u[text()='REFERENCE MATERIALS']")));
	        
	        JavascriptExecutor js = (JavascriptExecutor) driver;
	        js.executeScript("arguments[0].scrollIntoView(true);", referenceMaterials);
	        Thread.sleep(1000);  // Ensures scrolling completes
	        
	        referenceMaterials.click();
	        System.out.println("Navigated to Reference Materials.");
	    }

	    // Method to click on "WEEKLY SUBMISSION"
	    public void clickWeeklySubmission() throws InterruptedException {
	        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	        WebElement weeklySubmission = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//u[text()='WEEKLY SUBMISSION']")));
	        
	        JavascriptExecutor js = (JavascriptExecutor) driver;
	        js.executeScript("arguments[0].scrollIntoView(true);", weeklySubmission);
	        Thread.sleep(1000);  // Ensures scrolling completes
	        
	        weeklySubmission.click();
	        System.out.println("Navigated to Weekly Submission.");
	    }

	    // Method to click on "DISCUSSION FORUM"
	    public void clickDiscussionForum() throws InterruptedException {
	        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	        WebElement discussionForum = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//u[text()='DISCUSSION FORUM']")));
	        
	        JavascriptExecutor js = (JavascriptExecutor) driver;
	        js.executeScript("arguments[0].scrollIntoView(true);", discussionForum);
	        Thread.sleep(1000);  // Ensures scrolling completes
	        
	        discussionForum.click();
	        System.out.println("Navigated to Discussion Forum.");
	    }

	    // Method to click on "MY GRADES"
	    public void clickMyGrades() throws InterruptedException {
	        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	        WebElement myGrades = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//u[text()='MY GRADES']")));
	        
	        JavascriptExecutor js = (JavascriptExecutor) driver;
	        js.executeScript("arguments[0].scrollIntoView(true);", myGrades);
	        Thread.sleep(1000);  // Ensures scrolling completes
	        
	        myGrades.click();
	        System.out.println("Navigated to My Grades.");
	    }

	    // Method to click on "FINAL PROJECT SUBMISSION"
	    public void clickFinalProjectSubmission() throws InterruptedException {
	        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	        WebElement finalProjectSubmission = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//u[text()='FINAL PROJECT SUBMISSION']")));
	        
	        JavascriptExecutor js = (JavascriptExecutor) driver;
	        js.executeScript("arguments[0].scrollIntoView(true);", finalProjectSubmission);
	        Thread.sleep(1000);  // Ensures scrolling completes
	        
	        finalProjectSubmission.click();
	        System.out.println("Navigated to Final Project Submission.");
	    }

	    // Method to click on "VIVA VOCE"
	    public void clickVivaVoce() throws InterruptedException {
	        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	        WebElement vivaVoce = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//u[text()='VIVA VOCE']")));
	        
	        JavascriptExecutor js = (JavascriptExecutor) driver;
	        js.executeScript("arguments[0].scrollIntoView(true);", vivaVoce);
	        Thread.sleep(1000);  // Ensures scrolling completes
	        
	        vivaVoce.click();
	        System.out.println("Navigated to Viva Voce.");
	    }
	}


