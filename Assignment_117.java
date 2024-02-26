package selenium.assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment_117
{

	public static void main(String[] args)
	{
	  ChromeDriver driver = new ChromeDriver();
	  driver.get("file:///C:/Users/Asus/Desktop/JSAM.html");
	  
	  driver.manage().window().maximize();
	  driver.findElement(By.xpath("(/html/body/input)[1]")).sendKeys("gayathri123");
	  driver.findElement(By.xpath("(/html/body/input)[2]")).sendKeys("abc");
	  driver.findElement(By.xpath("(/html/body/input)[3]")).sendKeys("pass123");
	  driver.findElement(By.xpath("(/html/body/form)[1]/input[1]")).sendKeys("Gayathri");
	  driver.findElement(By.xpath("(/html/body/form)[2]/input[3]")).click();
	  driver.findElement(By.xpath("(/html/body/form)[2]/input[4]")).click();
	  driver.findElement(By.xpath("(/html/body/input)[5]")).click();
	  driver.findElement(By.xpath("(/html/body/input)[6]")).click();
	  driver.findElement(By.xpath("/html/body/a")).click();
	}

}






/*WebElement product = driver.findElement(By.xpath("//span[@class='folder'][1])"));
product.click();*/
