package selenium.assignments;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Assignment_121
{

	public static void main(String[] args) 
	{
		ChromeDriver driver = new ChromeDriver();
	       driver.get("https://grotechminds.com/registration/");
	       driver.manage().window().maximize();
	       WebElement peformaction_fname = driver.findElement(By.name("fname"));
	       peformaction_fname.sendKeys("Gayathri");
	       
	       WebElement peformaction_lname = driver.findElement(By.name("lname"));
	       peformaction_lname.sendKeys("Rao");
	       
	       WebElement peformaction_Username = driver.findElement(By.name("Username"));
	       peformaction_Username .sendKeys("Gayathri123");
	       
	       WebElement peformaction_pass = driver.findElement(By.name("password"));
	       peformaction_pass.sendKeys("Pass123");
	       
	       WebElement peformaction_Click = driver.findElement(By.name("Male"));
	       peformaction_Click.click();
	       
	       WebElement peformaction_Click1 = driver.findElement(By.name("FeMale"));
	       peformaction_Click1.click();
	       
	       WebElement peformaction_enteradd = driver.findElement(By.name("w3review"));
	       peformaction_enteradd.sendKeys("Navi Mumbai -410210");
	       
	       WebElement peformaction_enteradd1 = driver.findElement(By.id("Address"));
	       peformaction_enteradd1 .sendKeys("Navi Mumbai -410210");
	       
	       WebElement peformaction_enterpin = driver.findElement(By.name("Pincode"));
	       peformaction_enterpin.sendKeys("410210");
	       
	       WebElement peformaction_click = driver.findElement(By.name("Agree"));
	       peformaction_click.click();
	       
	//submit button check  
	       /*WebElement peformaction_click = driver.findElement(By.name("Agree"));
	       peformaction_click.click();*/
	      
	       
	}

}
