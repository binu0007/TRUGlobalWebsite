package TestingTGApp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;


public class MouseOverOnServise {

	public static void main(String[] args) throws Throwable 
	{
			System.setProperty("webdriver.chrome.driver", "../TruGlobal/src/main/resources/chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
			WebDriverWait wait=new WebDriverWait(driver, 10);
			driver.get("https://www.truglobal.com/colibri-wp-2/");
			Actions actions=new Actions(driver);
			
		//	@FindBy(By.id("(//*[text()='Services'])[1]"));
			
			WebElement mouseOver = driver.findElement(By.xpath("(//*[text()='Services'])[1]"));
			actions.moveToElement(mouseOver);
			Thread.sleep(5000);
		//	driver.findElement(By.xpath("(//a[text()='Robotic Process Automation' and @class=''])")).click();
			wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//a[text()='Robotic Process Automation' and @class=''])")));
					
			driver.quit();
	}

}
