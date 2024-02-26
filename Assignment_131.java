package selenium.assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Assignment_131 
{

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver = new ChromeDriver();
	      driver.get("https://www.flipkart.com/");
	      driver.manage().window().maximize();
	      
	   WebElement fashion =driver.findElement(By.xpath("(//span[.='Fashion'])[2]"));
	   Actions a1 = new Actions(driver);
	  // Thread.sleep(2000);
	   a1.moveToElement(fashion).perform();
	   WebElement tshirt = driver.findElement(By.linkText("Men's T-Shirts"));
	   tshirt.click();
	}

}
