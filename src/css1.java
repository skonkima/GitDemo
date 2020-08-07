import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class css1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	System.setProperty("webdriver.chrome.driver", "C:\\2020\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://login.salesforce.com/");
		driver.findElement(By.cssSelector("input[id='username']")).sendKeys("user");
		driver.findElement(By.cssSelector("input[id='password']")).sendKeys("passwd");
		//driver.findElement(By.xpath("//input[@type='submit']")).click();
		driver.findElement(By.cssSelector("#Login")).click();
		
		//using classname
		//driver.findElement(By.cssSelector("#button.r4.wide.primary")).click();
	}

}
