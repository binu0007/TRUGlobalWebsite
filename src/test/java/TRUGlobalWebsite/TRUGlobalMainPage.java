package TRUGlobalWebsite;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TRUGlobalMainPage 
{
	public static WebDriver driver;

	public TRUGlobalMainPage(WebDriver driver) 
	{
		driver.findElement(By.linkText("Home")).click();
		String Expected = "Page Comes First";
		System.out.println("Expected:" + Expected);
		String Actual = driver.findElement(By.xpath("//h1[text()='Page Comes First']")).getText();
		System.out.println("Actual:" + Actual);
		if (Expected.equals(Actual)) {
			System.out.println("Waoooo we are in Home Page");
		}

	}

	
	  public void VerifiServicesPage() {
	  driver.findElement(By.linkText("Services")).click();
	  
	  String Expected="Page Comes First"; System.out.println("Expected:"+Expected);
	  String Actual =
	  driver.findElement(By.xpath("//h1[text()='Page Comes First']")).getText();
	  System.out.println("Actual:"+Actual); if(Expected.equals(Actual)) {
	  System.out.println("Waoooo we are in Home Page"); } driver.quit();
	  
	  }
	 

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "../TruGlobal/src/main/resources/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebDriverWait wait = new WebDriverWait(driver, 10);
		driver.get("https://www.truglobal.com/");

		TRUGlobalMainPage mainCall = new TRUGlobalMainPage(driver);
	
//		mainCall.VerifiServicesPage();

		driver.quit();
	}

}
