package testCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.TestBase;
import stoodeoPages.ContactsPage;
import stoodeoPages.DashboardPage;

public class ContactsPageTest extends TestBase{
	
      DashboardPage dash;
      ContactsPage contact; 
	public ContactsPageTest() throws IOException {
		super();
	}
	
	@BeforeMethod
	
	public void setup() throws InterruptedException, IOException
	{
		initialisation();
		dash= new DashboardPage();
		contact= new ContactsPage();
		contact.contactBtnClick();
		
	}
	
	@Test
	public void validatenameTextBoxTest() throws InterruptedException
	{
	      contact.validateTextBox();
	
	}
	
	
	@AfterMethod
	public void exit()
	{
		driver.close();
	}

}
