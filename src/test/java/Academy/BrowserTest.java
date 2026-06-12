package Academy;

import static org.junit.Assert.assertEquals;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;



public class BrowserTest {

	
	@Test
	public void getData() throws InterruptedException
	{
		System.out.println("Hello Guys");
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--headless", "--remote-allow-origins=*", "--no-sandbox", "--disable-dev-shm-usage");
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://demoazuredevops.azurewebsites.net/webapp/");
		String text =driver.findElement(By.cssSelector("h1")).getText();
		System.out.println(text);
		Assert.assertTrue(text.equalsIgnoreCase("RahulShettyAcademy.com Learning"));
		driver.close();
	
		
		
	}
}
