import java.util.List;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class chromebrowsertest2 {

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
			driver.get("http://facebook.com");
			/* System.out.println(driver.getTitle()); //validate title
		 	System.out.println(driver.getCurrentUrl()); //validates if u landed on correct URL
		 	driver.findElement(By.id("email")).sendKeys("This is my first code");
		 	driver.findElement(By.name("pass")).sendKeys("123456");
		 	driver.findElement(By.linkText("Forgot account?")).click(); */
			
			driver.findElement(By.cssSelector("#email")).sendKeys("emailaddress");
			driver.findElement(By.xpath("//*[@id='pass']")).sendKeys("password");
			driver.findElement(By.xpath("//*[@id=\'login_form']/table/tbody/tr[3]/td[2]/div/a")).click();
			
			
			
			
			//driver.close(); //closes current browser
			//driver.quit(); //closes all browsers opened by selenium script
	}

}
