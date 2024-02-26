package selenium.assignments;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class Assignment_123 
{
	public static void main(String[] args)
	{
		ChromeDriver driver = new ChromeDriver();
	       driver.get("https://grotechminds.com/registration/");
	       driver.manage().window().maximize();
	       
	  WebElement skills_dd =  driver.findElement(By.id("Skills")); 
	     Select s1 = new Select(skills_dd);
	     s1.selectByVisibleText("Technical Skills");
	    
	  WebElement techskills_dd =    driver.findElement(By.id("technicalskills"));
	  Select s2 = new Select(techskills_dd);
	  s2.selectByValue("Selenium");
	  
	  WebElement country_dd =    driver.findElement(By.id("Country"));
	  Select s3 = new Select(country_dd);
	  s3.selectByValue("India");
	  
	  WebElement religion_dd =    driver.findElement(By.id("Relegion"));
	  Select s4 = new Select(religion_dd);
	  s4.selectByValue("Hindu");
	
	
	   
	     
	}

}
