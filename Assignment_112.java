package selenium.assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment_112 
{

	public static void main(String[] args) 
	{

	       ChromeDriver driver = new ChromeDriver();
	       driver.get("https://www.facebook.com");
	       driver.manage().window().maximize();//used to maximize the window
	       driver.findElement(By.id("email")).sendKeys("archana1301994@gmail.com");
	       driver.findElement(By.id("pass")).sendKeys("archana");
	       driver.findElement(By.name("login")).click();
	      
	}

}
