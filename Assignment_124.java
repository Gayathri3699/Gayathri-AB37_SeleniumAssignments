package selenium.assignments;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment_124 
{
	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver = new ChromeDriver();
	       driver.get("https://grotechminds.com/x-path/");
	       driver.manage().window().maximize();
	       
	      WebElement product = driver.findElement(By.xpath("(//span[@class='folder'])[1]"));    
	      product.click();

	      WebElement openbooks =  driver.findElement(By.xpath("/html/body/div)[2]/div[2]/div/div[3]/div/div[1]/div/nav/ul/li/ul/li[1]/span"));	       
	      openbooks.click();
	      
	     WebElement openmobile = driver.findElement(By.xpath("(/html/body/div)[2]/div[2]/div/div[3]/div/div[1]/div/nav/ul/li/ul/li[2]/span"));	
	      openmobile.click();
	      
	      
	      Thread.sleep(3000);
	     WebElement openclothes = driver.findElement(By.xpath("(/html/body/div)[2]/div[2]/div/div[3]/div/div[1]/div/nav/ul/li/ul/li[3]/span"));	       
	      openclothes.click();
	      
	      WebElement openchocalate = driver.findElement(By.xpath("(/html/body/div)[2]/div[2]/div/div[3]/div/div[1]/div/nav/ul/li/ul/li[4]/span"));	       
	      openchocalate.click();	
	}

}
