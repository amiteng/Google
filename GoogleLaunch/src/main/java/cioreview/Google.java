package cioreview;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Google {

	@Test
	public void check()
	{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver","D:\\seleniumfile\\geckodriver-v0.21.0-win32\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.gmail.com");
	}

}
