import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;



public class DONOTUSEchromebrowser {
	static WebDriver driver = new ChromeDriver();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//chromedriver.exe
		
		System.setProperty("webdriver.chrome.driver", "C:\\2020\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://facebook.com");
		//driver.findElement(By.id("email")).sendKeys("This is my first code");

}

}
