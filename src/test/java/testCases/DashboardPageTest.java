package testCases;

import static org.testng.Assert.assertEquals;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.TestBase;
import stoodeoPages.DashboardPage;

public class DashboardPageTest extends TestBase {
	
	DashboardPage dash;

	public DashboardPageTest() throws IOException {
		super();
		
	}
	
	 @BeforeMethod
	 public void setup() throws IOException, InterruptedException
	 {
		 initialisation();
		 dash =new DashboardPage();
		 
	 }
	 
	 @Test
	 public void validateDashBoardPagetitlTest()
	 {
		String name=dash.validateDashBoardPagetitle();
		System.out.println("Title=" +name);
		Assert.assertEquals(name,"Stoodeo | Affordable SEO & Web Design Tyler TX");
	 }
	 
	 @Test
	 public void validateLogoTest()
	 {
		 boolean logoPresent=dash.validateLogo();
		 Assert.assertEquals(logoPresent, true);
	 }
	 
	 @Test
	 public void validateWorkPageBtnTest()
	 {
		 boolean workpageBtnPresent=dash.validateWorkPageBtn();
		 Assert.assertEquals(workpageBtnPresent, true);
	 }
	 
	 @Test
	 public void validateServicePageBtnTest()
	 {
		 boolean serviceBtnTestPresent=dash.validateServicePageBtn();
		 Assert.assertEquals(serviceBtnTestPresent, true);	 
	 }
	 
	 @Test
	 public void validateBlogPageBtnTest()
	 {
		 boolean blogpagebtnTestPresent=dash.validateBlogPageBtn();
		 Assert.assertEquals(blogpagebtnTestPresent, true);
	 }
	 
	 @Test
	 public void validateAboutPageBtnTest()
	 {
		 boolean aboutPageBtnPresent=dash.validateAboutPageBtn();
		 Assert.assertEquals(aboutPageBtnPresent, true);
	 }
	 
	 @Test
	 public void validateContactsPageBtnTest()
	 {
		 boolean contactsPageBtnPresent= dash.validateContactsPageBtn();
		 Assert.assertEquals(contactsPageBtnPresent, true);
	 }
	 @AfterMethod
	 public void exit()
	 {
        driver.close();
	 }
	

}
