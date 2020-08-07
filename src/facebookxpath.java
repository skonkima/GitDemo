import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class facebookxpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\2020\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
	/*	driver.get("http://facebook.com/");
		driver.findElement(By.xpath("//*[@type='email']")).sendKeys("myown xpath");
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("hello");
		driver.findElement(By.xpath("//input[@value='Log In']")).click(); */
		
		//tagName[attribute='value']
		driver.findElement(By.cssSelector("input[name='email']")).sendKeys("myowncss");
		driver.findElement(By.cssSelector("input[type='password']")).sendKeys("myowncsspwd");
		driver.findElement(By.cssSelector("[value='Log In']")).click();
	}

}
