package testCases;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class EdamamUserMenu {
	
	
	
	@Test
	
	public void userMenuValidate()
	{
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\LENOVO\\eclipse-workspace\\EdamamaAssignment\\chromeedamama\\chromedriver.exe");
	    WebDriver driver=new ChromeDriver(options);
	    driver.manage().window().maximize();
	    driver.get("https://www.edamama.ph/shop");
	    driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS); 
	    
	  /*  Set<String> handler = driver.getWindowHandles();
	     Iterator<String> itr = handler.iterator();
	     
	     String parentwindowid= itr.next();
	     System.out.println("Parent window id=" +parentwindowid);
	     
	     String childid=itr.next();
	     System.err.println("chilid" +childid);
	     
	     driver.switchTo().window(childid); */
	     
	     
	    
	    
	    
     //  driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS); 
	    
	    Alert alt=driver.switchTo().alert();
	    alt.dismiss();
	    
	    WebElement loginBtn=driver.findElement(By.xpath("//span[text()='Login']"));
	    loginBtn.click(); 
	     
	     
	     
	    
	}

}
