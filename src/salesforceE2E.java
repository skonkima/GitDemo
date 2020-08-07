import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class salesforceE2E {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:\\2020\\chromedriver.exe");
		/*
		WebDriver driver=new ChromeDriver();
		driver.get("http://rediff.com/");
		driver.findElement(By.cssSelector("a[title*='Sign in']")).click();
		System.out.println(driver.findElement(By.cssSelector("span")).getText());
		driver.findElement(By.id("reload-button")).click();
		//tagName[Attribute*='value'] - Using CSS selector
		driver.findElement(By.cssSelector("button[id*='reload-button']")).click();
		System.out.println(driver.findElement(By.cssSelector("span")).getText());
		driver.findElement(By.cssSelector("button[onclick*='detailsButtonClick()']")).click();
		System.out.println(driver.findElement(By.cssSelector("div.suggestion-header")).getText());
		driver.findElement(By.cssSelector("button[onclick*='detailsButtonClick()']")).click();
		//driver.findElement(By.cssSelector("button#details-button.secondary-button.text-buttons.small-link")).click();
		System.out.println(driver.findElement(By.cssSelector("span")).getText()); */
		
		//driver.findElement(By.xpath("//input[@id='login1']")).sendKeys("hello");
		//driver.findElement(By.cssSelector("input#password")).sendKeys("goodbye");
		//driver.findElement(By.xpath("//input[contains(@name,'procee']")).click();
		
		WebDriver driver=new ChromeDriver();
		driver.get("http://google.com/");
		driver.findElement(By.xpath("//div[@class='RNNXgb']/div/div[2]/div/input")).sendKeys("Hoag");;
	}

}
