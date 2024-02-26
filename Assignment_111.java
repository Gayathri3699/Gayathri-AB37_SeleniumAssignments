package selenium.assignments;
import java.util.Arrays;
import org.openqa.selenium.chrome.ChromeDriver;
public class Assignment_111 
{
	public static void main(String[] args)
	{
      ChromeDriver driver = new ChromeDriver();
      driver.get("https://www.flipkart.com");
      driver.manage().window().maximize();
      
      String pageTitle = driver.getTitle();
      
      String[] titlesArray = {pageTitle};
      
 //Arrays.toString(titlesArray);
      System.out.println(Arrays.toString(titlesArray));
      
    }

}
