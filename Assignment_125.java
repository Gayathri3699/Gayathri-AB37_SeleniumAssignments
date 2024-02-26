package selenium.assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment_125 
{

	public static void main(String[] args)
	{
		ChromeDriver driver = new ChromeDriver();
	       driver.get("file:///C:/Users/Asus/Desktop/JSAM.html");
	       driver.manage().window().maximize();
	       
	       WebElement performaction = driver.findElement(By.name("lname"));
	       performaction.sendKeys("Gayathri");
	}

}
//ElementNotInteractableException