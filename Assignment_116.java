package selenium.assignments;
import java.util.Scanner;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class Assignment_116 
{
	public static void main(String[] args)
	{
		 FirefoxDriver driver = new FirefoxDriver();
		 String links[] = {"Arab","Kingdom","States"};
		 
		 for(int i=0;i<links.length;i++)
		 {
		  driver.get("https://www.amazon.in/");
		  driver.manage().window().maximize();
		  driver.findElement(By.partialLinkText(links[i])).click();
		 }
	}
}
















//driver.close();

//United Arab Emirates - Arab
//United Kingdom - Kingdom
//United States - States













