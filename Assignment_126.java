package selenium.assignments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment_126 
{

	public static void main(String[] args) 
	{
		ChromeDriver driver = new ChromeDriver();
	       driver.get("https://www.amazon.in");
	       driver.manage().window().maximize();
	       
	  List <WebElement> linkcount =     driver.findElements(By.tagName("a"));
	  int totallinks = linkcount.size();
	 System.out.println("Total No.of Links in a webpage:" +totallinks);
	}

}
