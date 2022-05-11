package piit.AutomationTrainingProgram;

import org.testng.annotations.Test;

import M.common.Utility;

import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class Browsersd extends Utility {
	
  @Test
  public void f() {
	  WebElement id=driver.findElement(By.name("email"));
	  id.sendKeys("Silem@piit");
	  WebElement pssword=driver.findElement(By.name("pass"));
	  pssword.sendKeys("johnsilver");
	  WebElement looginbutton=driver.findElement(By.name("login"));
	  looginbutton.click();
  }
 

}
