package piit.AutomationTrainingProgram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SecondAssignment {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sultan\\eclipse-workspace\\AutomationTrainingProgram\\Drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.navigate().to("https://www.pizzahut.com");
		driver.manage().window().maximize();
		WebElement clickonmenu= driver.findElement(By.id("menu"));
		clickonmenu.click();
		WebElement clickonpizza= driver.findElement(By.xpath("/html/body/div/header/div/div/div/div/div"));
		Thread.sleep(6000);
		clickonpizza.clear();
	}
}
