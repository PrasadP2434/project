package base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBase {
	public static WebDriver driver;
	public static Properties prop;
	
	
 public TestBase() throws IOException {
	 
	 prop= new Properties();
	 FileInputStream con=new FileInputStream("C:\\Users\\LENOVO\\eclipse-workspace\\EdamamaAssignment\\src\\main\\java\\config\\config.properties");
	 prop.load(con);
	
	 
 }
	
	
	public static void initialisation() throws InterruptedException {
		String browsername= prop.getProperty("browser");
		if(browsername.equals("chrome"))
		{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\LENOVO\\eclipse-workspace\\EdamamaAssignment\\chromeedamama\\chromedriver.exe");
		driver= new ChromeDriver();
	    }
		driver.manage().window().maximize();
		driver.get(prop.getProperty("url"));
		
			
	}

}
