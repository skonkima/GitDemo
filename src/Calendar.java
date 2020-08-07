import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calendar {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\2020\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://path2usa.com/travel-companions");
		//driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		Thread.sleep(3000);
		
		//August 14
		driver.findElement(By.xpath("//input[@id='travel_date']")).click();
		List<WebElement> dates=driver.findElements(By.className("day"));
		int count=dates.size();
		for (int i=0;i<count;i++)
		{
			String text=driver.findElements(By.className("day")).get(i).getText();
			if (text.equalsIgnoreCase("14"))
			{
				driver.findElements(By.className("day")).get(i).click();
				break;
			}				
		}
			
		

	}

}
