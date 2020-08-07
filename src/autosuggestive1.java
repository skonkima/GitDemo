import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class autosuggestive1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\2020\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.makemytrip.com/flights/");
		//driver.findElement(By.cssSelector("input[placeholder='From']")).click();
		WebElement source=driver.findElement(By.id("fromCity"));
		source.click();
		source.click();
		source.sendKeys("MUM");
		Thread.sleep(2000);
		source.sendKeys(Keys.ENTER); 

	}

}
