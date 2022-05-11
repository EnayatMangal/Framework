package piit.AutomationTrainingProgram;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.decorators.WebDriverDecorator;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class Execution {
 WebDriver driver;
	@Test
  public void f() {
	  System.out.println("This is test annotation");
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("This is before test annotation");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("This is after method annotation");
  }

  @Test
  public void Test2() {
	  System.out.println("This is test");
  }
  
  @BeforeClass
  public void beforeClass() throws IOException {
	 Browser("Chrome");
	File screenshots= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	FileHandler.copy(screenshots,new File("C:\\Users\\Sultan\\eclipse-workspace\\AutomationTrainingProgram\\Pictures\\ShotofPage.jpg"));
	  
  }

  @AfterClass
  public void afterClass() {
	 
  }
	 public void Browser(String window) {
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
		     
		     
		 }else if (window.equalsIgnoreCase("Firefox")) {
			 System.setProperty("webdriver.gecko.driver","C:\\Users\\Sultan\\eclipse-workspace\\AutomationTrainingProgram\\Drivers\\geckodriver.exe");
	    	driver=new FirefoxDriver();
	    	 driver.navigate().to("https://www.facebook.com");
		     driver.manage().window().maximize();   
	     }   
		 }
	 

  @BeforeTest
  public void beforeTest() {
	  System.out.println("This is before test annotation");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("This is after test annotation");
  }

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("This is before suite annotation");
	  
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("This is after suite annotation");
  }

}
