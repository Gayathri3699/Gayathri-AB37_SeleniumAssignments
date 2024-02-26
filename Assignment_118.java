package selenium.assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment_118
{

	public static void main(String[] args)
	{
       ChromeDriver driver = new ChromeDriver();
       driver.get("https://www.facebook.com/");
       driver.findElement(By.xpath("(//input)[3]")).sendKeys("archana123@gmail.com");
       driver.findElement(By.xpath("(//input)[4]")).sendKeys("pass123");
       driver.findElement(By.xpath("(//button)")).click();
	}

}
