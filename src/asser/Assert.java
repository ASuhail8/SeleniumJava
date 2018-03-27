package asser;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Assert {

	@Test
	public void Assert()
	{
		
				System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
				ChromeDriver driver = new ChromeDriver();
				driver.manage().window().maximize();
				driver.get("https://demo.actitime.com/login.do");
				WebElement login = driver.findElement(By.xpath("//div[.='Login ']"));
				boolean v = login.isDisplayed();
				SoftAssert sa = new SoftAssert();
				sa.assertTrue(v);
				driver.close();
				sa.assertAll();
				driver.quit();
				
			}

}
