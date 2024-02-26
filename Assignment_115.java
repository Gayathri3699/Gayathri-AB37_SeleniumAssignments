package selenium.assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Assignment_115 {

	public static void main(String[] args) 
	{
	    FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.gooogle.com");
	      driver.manage().window().maximize();
	      driver.findElement(By.linkText("Gmail")).click();
	      
	}

}
