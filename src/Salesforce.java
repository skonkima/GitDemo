import java.util.List;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Salesforce {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Selenium code - 
		//Create Driver Object for chrome browser
		//We will strictly implement methods of webdriver.
		/*Class name = X
				
				X driver=new X();*/
		
		//Class name= ChromeDriver,
		//invoke .exe file first
		 	System.setProperty("webdriver.chrome.driver", "C:\\2020\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			
		//Finding element by ID and LINKTEXT
			driver.get("https://login.salesforce.com/");
			driver.findElement(By.id("username")).sendKeys("Enter Username");
			driver.findElement(By.name("pw")).sendKeys("12345");
			//driver.findElement(By.className("button r4 wide primary")).click();
			driver.findElement(By.xpath("//*[@id=\'Login\']")).click();
			System.out.println(driver.findElement(By.cssSelector("div#error.loginError")).getText());
			
			//driver.close(); //closes current browser
			//driver.quit(); //closes all browsers opened by selenium script
	}

}
