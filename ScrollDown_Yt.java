package selenium.assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollDown_Yt 
{

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver = new ChromeDriver();
	     driver.get("https://www.youtube.com/");
	     driver.manage().window().maximize();
	     
	     JavascriptExecutor jse = driver;//upcasting the driver to the JavascriptExecutor
	     
	     
	   //  for(int i=0;i<=1;i--)
	     for(int i=1;i>0;i++)
	     {
	    	jse.executeScript("window.scrollBy (0,6000)");
	    	 Thread.sleep(2000);
	     }
	     
	
	
	
	}

}
