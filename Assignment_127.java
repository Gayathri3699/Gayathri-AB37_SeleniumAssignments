package selenium.assignments;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Assignment_127 
{
	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver = new ChromeDriver();
	       driver.get("https://www.flipkart.com/");
	       driver.manage().window().maximize();
	       WebElement enter = driver.findElement(By.name("q"));
	       enter.sendKeys("books");
	       
	      Thread.sleep(1000);
////form[@class='_2rslOn header-form-search OpXDaO']/ul/li	      
	      List <WebElement> result = driver.findElements(By.xpath("//form[@class='_2rslOn header-form-search OpXDaO']/ul/li"));
	      
	      int count = result.size();
	      System.out.println(count);
	      
	      Thread.sleep(2000);
	      result.get(count -6).click();	      	      
	}

}
