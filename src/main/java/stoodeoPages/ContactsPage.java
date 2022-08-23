package stoodeoPages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import base.TestBase;

public class ContactsPage extends TestBase {
	//Object Repository
	@FindBy(xpath="//span[text()='Contact']") private WebElement contactBtn;
	@FindBy(xpath="//input[@name='name']") private WebElement nameTxtBox;
	@FindBy(xpath="//input[@name='organization']") private WebElement orgTxtBox;
	@FindBy(xpath="//input[@name='goals']")private WebElement goalTxtBox;
	@FindBy(xpath="//select[@name='completion']")private WebElement completionDropdwnBtn;
	@FindBy(xpath="//select[@name='budget']") private WebElement budgetDropdwnBtn;
	@FindBy(xpath="//input[@name='email']") private WebElement emailtxtBox;
	@FindBy(xpath="//input[@name='phone']") private WebElement mobiletxtBox;
	@FindBy(xpath="//span[text()='Send It!']") private WebElement sendItBtn;
	@FindBy(xpath="//img[@title='Success']") private WebElement successElement;
	
	
	public ContactsPage() throws IOException {
		super();
		PageFactory.initElements(driver, this);
	}
	
	public void contactBtnClick()
	{
		contactBtn.click();
	}
	
	public void validateTextBox() throws InterruptedException
	{
        // return nameTxtBox.getText();
         nameTxtBox.sendKeys(prop.getProperty("name"));
         orgTxtBox.sendKeys(prop.getProperty("orginame"));
         goalTxtBox.sendKeys(prop.getProperty("goal"));
         
         Select sl=new Select(completionDropdwnBtn);
         sl.selectByIndex(3);
         
         Select sp=new Select(budgetDropdwnBtn);
         sp.selectByIndex(3);
         
         emailtxtBox.sendKeys(prop.getProperty("mailid"));
         mobiletxtBox.sendKeys(prop.getProperty("contact"));
         sendItBtn.click();
         
         if(successElement.isDisplayed())
         {
        	 System.out.println("data entered Successfully");
         }
         else
         {
        	 System.out.println("data not entered");
         }
         
	}

}
