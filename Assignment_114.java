package selenium.assignments;


import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Assignment_114
{

	public static void main(String[] args) 
	{
	  FirefoxDriver driver = new FirefoxDriver();
	 driver.get("https://www.amazon.in/");
	 driver.manage().window().maximize();
	 driver.findElement(By.linkText("Mobiles")).click();
     
	}
}
