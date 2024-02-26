package selenium.assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment_130
{
	public static void main(String[] args) 
	{
		ChromeDriver driver = new ChromeDriver();
	       driver.get("https://retail.onlinesbi.sbi/retail/login.htm");
	       driver.manage().window().maximize();
	       
	     WebElement clickoncontinue = driver.findElement(By.xpath("(//a[.='CONTINUE TO LOGIN'])[1]"));
	  	 clickoncontinue.click();
	  	 
	  	WebElement enter_username = driver.findElement(By.id("username"));
	  	enter_username.sendKeys("Gayathri");
	  	
	  	WebElement enter_pass = driver.findElement(By.id("label2"));
	  	enter_pass.sendKeys("pass@123");
	  	
	  	WebElement enter_captcha = driver.findElement(By.id("loginCaptchaValue"));
	  	enter_captcha.sendKeys("5eee4k");
	}

}
