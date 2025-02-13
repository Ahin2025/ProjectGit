package testcase;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import base.Testbase;
import page.Seconddash;

public class Secondtest extends Testbase {
 Seconddash obj;
 @BeforeClass
 public void call() {
     obj = new Seconddash(driver); 
 }
     @Test
     public void fun() throws InterruptedException {
    	  obj.setfirst();
   	   obj.Emaill("princy@gmail.com");
   	   obj.Pass("123456");
   	   obj.Submitt();
   	   obj.projectTopicClick();
   	   obj.checkAgree();
   	   obj.checkProceed();
   	   obj.getProjectDashboard1();
    	 obj.clickReferenceMaterials();
    	 obj.clickWeeklySubmission();
    	 obj.clickDiscussionForum();
    	 obj.clickMyGrades();
    	 obj.clickFinalProjectSubmission();
    	 obj.clickVivaVoce();

    	 // Close the driver after the operations
    	 driver.quit();
}
}