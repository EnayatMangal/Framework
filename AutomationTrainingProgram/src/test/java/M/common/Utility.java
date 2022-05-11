package M.common;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.AfterClass;

public class Utility {
	public WebDriver driver;
 
  @BeforeClass
  public void beforeClass(String window) {
	  if(window.equalsIgnoreCase("Chrome")) {
		     System.setProperty("webdriver.chrome.driver","C:\\Users\\Sultan\\eclipse-workspace\\AutomationTrainingProgram\\Drivers\\chromedriver.exe");
		     driver=new ChromeDriver();
		     driver.navigate().to("https://www.facebook.com");
		     driver.manage().window().maximize();
			 } else if (window.equalsIgnoreCase("Edge")) {
				 System.setProperty("webdriver.edge.driver","C:\\Users\\Sultan\\eclipse-workspace\\AutomationTrainingProgram\\Drivers\\msedgedriver.exe" );
			     driver=new EdgeDriver();
			     driver.navigate().to("https://www.facebook.com");
			     driver.manage().window().maximize();
  }
  }
  @AfterClass
  public void afterClass() {
	  driver.close();
  }
 
  public void Pictures () throws IOException {
	  Date dt=new Date();
	 String sk= dt.toString().replace(" ", "_").replace(":", "_");
	 System.out.println(sk);
	  File screenshots= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	  FileHandler.copy(screenshots, new File("C:\\Users\\Sultan\\eclipse-workspace\\AutomationTrainingProgram\\Pictures\\"+sk+"ShotOfPage.jpg") );  
  }
}
