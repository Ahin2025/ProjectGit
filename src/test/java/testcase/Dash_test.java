package testcase;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import base.Testbase;
import page.Loginpage;
import page.Dashboard;

public class Dash_test  extends Testbase {
   Dashboard obj;
    Loginpage obj1;
   
   @BeforeClass
   public void call() {
       obj = new Dashboard(driver); 
       obj1= new Loginpage(driver);
      // Initialize the Signup_page with the WebDriver instance
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
	   obj.getProjectDashboard();
	   obj.getProjectOverview();
	   obj.ReferenceMaterial();
	   obj.Viva();
	   obj.viewVivaVoceGuidelines();
	   obj.submitViva();
//	   obj.getProjectOverview();
//	   obj.Getrefer();
//	   obj.Refere1();
//	   
//	   obj.ReferenceMaterial();
//	  // obj.Referencemet();
//	   obj.Getrefer();
//	   obj.Refe1();
//	   
   }
}
