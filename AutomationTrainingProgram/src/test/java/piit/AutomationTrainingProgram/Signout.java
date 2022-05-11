package piit.AutomationTrainingProgram;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import M.common.Utility;
import PageObjectModel.ForgotPasswordPage;
import PageObjectModel.Home;
import io.opentelemetry.exporter.logging.SystemOutLogExporter;
import junit.framework.Assert;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertEquals;

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

public class Signout extends Utility {
	WebDriver driver;
  @Test(priority = 1)
  public void f() throws InterruptedException, IOException {
	  Home ob=new Home(driver);
	  ob.Email();
	  Pictures();
	  ob.PsswordFieldsEnters();
	  Thread.sleep(6000);
	  Pictures();
	  Thread.sleep(6000);
	  ob.ForgotLinkClick();
	  ForgotPasswordPage id=new ForgotPasswordPage(driver);
	  id.IdsSendKeys();
	  id.SearchButtonClick();
	  Thread.sleep(6000);
	  Pictures();
  }
  @Test(priority = 2,dependsOnMethods = "f")
 public void TextVerificationMethod() throws InterruptedException {
	  driver.navigate().back();
	  Thread.sleep(6000);
	  ForgotPasswordPage id=new ForgotPasswordPage(driver);
String Questions=id.QuestionOfText();
SoftAssert softit=new SoftAssert();
	  softit.assertEquals("Please enter your email or mobile number to search for your account.", Questions);
	  System.out.println("This is After assertion");
	  softit.assertAll();
 }
 
}
