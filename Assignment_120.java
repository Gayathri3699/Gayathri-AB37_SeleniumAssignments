package selenium.assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment_120 
{

	public static void main(String[] args) 
	{
		ChromeDriver driver = new ChromeDriver();
	       driver.get("file:///C:/Users/Asus/Desktop/learningHTML1.html");
	       driver.manage().window().maximize();
	       driver.findElement(By.id("1")).sendKeys("Manish kumar Tiwari");
	       for(int i=20;i>13;i--)
	       {
	    	   driver.findElement(By.id("1")).sendKeys(Keys.BACK_SPACE);	    	   
	       }
	}

}
