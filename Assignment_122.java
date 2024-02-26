package selenium.assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment_122 
{

	public static void main(String[] args) 
	{
		ChromeDriver driver = new ChromeDriver();
	       driver.get("https://grotechminds.com/registration/");
	       driver.manage().window().maximize();
	       
	      WebElement enter_input = driver.findElement(By.name("fname"));
	      
	      enter_input.sendKeys("Manish Kumar Tiwari");
	      enter_input.sendKeys(Keys.CONTROL +"a");
	      enter_input.sendKeys(Keys.CONTROL +"c");
	      
	      WebElement enter_input1 = driver.findElement(By.name("lname"));
	      enter_input1.sendKeys(Keys.CONTROL +"v");
	      
	      WebElement enter_input2 = driver.findElement(By.name("Username"));
	      enter_input2.sendKeys(Keys.CONTROL +"v");

	      WebElement enter_input3 = driver.findElement(By.name("password"));
	      enter_input3.sendKeys(Keys.CONTROL +"v");

	}

}
