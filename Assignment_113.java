package selenium.assignments;


import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Assignment_113
{

	public static void main(String[] args) 
	{
	  ChromeDriver driver = new ChromeDriver();
	 driver.get("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3Ftag%3Dmsndeskstdin-21%26ref%3Dnav_signin%26adgrpid%3D1328211703591630%26hvadid%3D83013495293827%26hvnetw%3Do%26hvqmt%3De%26hvbmt%3Dbe%26hvdev%3Dc%26hvlocint%3D%26hvlocphy%3D149496%26hvtargid%3Dkwd-83014163759883%3Aloc-90%26hydadcr%3D5621_2377279&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
	 driver.manage().window().maximize();
     driver.findElement(By.id("ap_email")).sendKeys("archana@gmail.com");
     driver.findElement(By.id("continue-announce")).click();
     driver.findElement(By.id("ap_password")).sendKeys("archana");
     driver.findElement(By.id("signInSubmit")).click();


	}
//not done
}
