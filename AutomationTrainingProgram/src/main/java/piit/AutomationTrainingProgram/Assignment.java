package piit.AutomationTrainingProgram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sultan\\eclipse-workspace\\AutomationTrainingProgram\\Drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.navigate().to("https://www.homedepot.com");
		driver.manage().window().maximize();
		WebElement linktext= driver.findElement(By.linkText("My Account"));
		linktext.click();
		WebElement clickonregister= driver.findElement(By.className("bttn_content"));
		clickonregister.click();
		
		
	}

}
