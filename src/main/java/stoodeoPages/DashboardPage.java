package stoodeoPages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.TestBase;

public class DashboardPage extends TestBase {

	//ObjectRepository
	@FindBy(xpath="//a[@title='Stoodeo']") private WebElement logoImage;
	@FindBy(xpath="//span[text()='Work']") private WebElement workPageBtn;
	@FindBy(xpath="//span[text()='Services']")private WebElement servicePageBtn;
	@FindBy(xpath="//span[text()='About']") private WebElement aboutPageBtn;
	@FindBy(xpath="//span[text()='Blog']") private WebElement blogPageBtn;
	@FindBy(xpath="//span[text()='Contact']") private WebElement contactsPageBtn;
	
	public DashboardPage() throws IOException {
		super();
		PageFactory.initElements(driver,this);	
	}
	
	public String validateDashBoardPagetitle()
	{
		return driver.getTitle();
	}
	
	public boolean validateLogo()
	{
		return logoImage.isDisplayed();
	}
	
	public boolean validateWorkPageBtn()
	{
		return workPageBtn.isDisplayed();
	}
	
	public boolean validateServicePageBtn()
	{
		return servicePageBtn.isDisplayed();
	}
	
	public boolean validateBlogPageBtn()
	{
		 return blogPageBtn.isDisplayed();
	}
	
	public boolean validateAboutPageBtn()
	{
		return aboutPageBtn.isDisplayed();
	}
	
	public boolean validateContactsPageBtn()
	{
		return contactsPageBtn.isDisplayed();
	}

}
