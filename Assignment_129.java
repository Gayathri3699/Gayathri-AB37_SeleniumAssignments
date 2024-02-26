package selenium.assignments;

import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment_129 
{

	public static void main(String[] args)
	{
		ChromeDriver driver = new ChromeDriver();
	      driver.get("https://grotechminds.com/javascript-popup/");
	      
	      driver.switchTo().alert().accept();
	      
	      driver.manage().window().maximize();
	      
	      String Title = driver.getTitle();
	      System.out.println(Title);
	}

}
