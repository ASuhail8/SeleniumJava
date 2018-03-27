package asser;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SNOW

{

	public static void main(String[] args) throws InterruptedException
	{
		String key = "webdriver.gecko.driver";
		String value = "./drivers/geckodriver.exe";
		System.setProperty(key, value);
		FirefoxDriver driver = new FirefoxDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://unisysmtuat.service-now.com/navpage.do");
		String title = driver.getTitle();
		System.out.println(title);
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.titleIs("IT SERVICE MANAGEMENT SYSTEM"));
		Thread.sleep(1000);
		driver.findElement(By.id("user_name")).sendKeys("mohammed.suhail@in.unisys.com");
		driver.findElement(By.id("user_password")).sendKeys("Suhail@1");
		driver.findElement(By.id("sysverb_login")).click();		
		Thread.sleep(1000);
		
		driver.findElement(By.id("filter")).sendKeys("groups");
		driver.close();
		
	}
}