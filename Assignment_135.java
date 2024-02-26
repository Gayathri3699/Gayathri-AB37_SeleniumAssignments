package selenium.assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment_135 
{

	public static void main(String[] args) throws InterruptedException
	{
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.goibibo.com/");
		driver.manage().window().maximize();
		
		
		
		//close loginpop up
		WebElement close = driver.findElement(By.xpath("//span[@class='logSprite icClose']"));
		close.click();
		

	
		//source
		WebElement from=driver.findElement(By.xpath("(//p[.='Enter city or airport'])[1]"));
		from.click();
		WebElement from1=driver.findElement(By.xpath("//input[@type='text']"));
		Thread.sleep(2000);
		from1.sendKeys("Mumbai");

		WebElement source=driver.findElement(By.xpath("(//p[.='Enter city or airport'])[1]"));
		source.click();
		
		//destination
		WebElement to1=driver.findElement(By.xpath("//input[@type='text']"));
		Thread.sleep(2000);
		to1.sendKeys("Bangalore");
		
		WebElement dest=driver.findElement(By.xpath("(//div[@class='sc-12foipm-45 gfqMUQ'])[1]"));
		dest.click();
		
		//date selection
		WebElement journeyDate=driver.findElement(By.xpath("(//p[@class='fsw__date'])[11]"));
		journeyDate.click();
		
		//date submit
		WebElement DtSubmit=driver.findElement(By.xpath("//span[@class='fswTrvl__done']"));
		DtSubmit.click();
		
		//select adult count
		WebElement adult=driver.findElement(By.xpath("(//span[@class='sc-12foipm-64 dGRyPm'])[2]"));
		adult.click();
		
		//select premium class
		WebElement premiumClass =driver.findElement(By.xpath("(//li[@class='sc-12foipm-59 jfdntO'])[1]"));
		premiumClass.click();
		
		//submit details adult,class
		WebElement doneDetails =driver.findElement(By.xpath("//a[@class='sc-12foipm-77 jYnAuG']"));
		doneDetails.click();
		
		//select radio button
		WebElement radioBtn =driver.findElement(By.xpath("//span[.='armed forces']"));
		radioBtn.click();
		
		//search flight
		WebElement searchFlight =driver.findElement(By.xpath("//span[.='SEARCH FLIGHTS']"));
		searchFlight.click();			
			
			}


}




