package selenium.assignments;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class Assignment_133 
{
	public static void main(String[] args)
	{
		ChromeDriver driver = new ChromeDriver();
	      driver.get("https://grotechminds.com/registration/");
	      driver.manage().window().maximize();
	      
	      WebElement skills = driver.findElement(By.id("Skills"));
	    
	      
	      Select s1 = new Select(skills);
	      List <WebElement> all_skills = s1.getOptions();
	      int total_count =  all_skills.size();
	      System.out.println(total_count);
	      
	      String print_all =  skills.getText();
	      System.out.println(print_all);
	      
	      
	}

}
