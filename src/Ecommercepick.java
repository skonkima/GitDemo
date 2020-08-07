import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Ecommercepick {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		// ###Set up Steps and launch website###
		System.setProperty("webdriver.chrome.driver", "C:\\2020\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		int j=0;
		String[] vegAdd={"Brocolli","Beetroot", "Cucumber", "Tomato"};
		driver.get("https://www.rahulshettyacademy.com/seleniumPractise/");
		Thread.sleep(3000);
		
		addItems(driver,vegAdd);
		driver.findElement(By.xpath("//a[@class='cart-icon']//img[contains(@class,'')]")).click();
		driver.findElement(By.xpath("//button[contains(text(),'PROCEED TO CHECKOUT')]")).click();
		driver.findElement(By.cssSelector("input.promoCode")).sendKeys("rahulshettyacademy");
		driver.findElement(By.cssSelector("button.promoBtn")).click();
		WebDriverWait w=new WebDriverWait(driver,5);
		System.out.println(driver.findElement(By.cssSelector("span.promoInfo")).getText());
		driver.findElement(By.xpath("//button[contains(text(),'Place Order')]")).click();
	}
		
		public static void addItems(WebDriver driver, String[] vegAdd)	
		{
		int j=0;
		List<WebElement> products=driver.findElements(By.cssSelector("h4.product-name"));
		for (int i=0;i<products.size();i++)
		{
			//Broccolli - 1kg
			//Brocolli, 1kg
			String[] name=products.get(i).getText().split("-");
			String formattedname=name[0].trim();
			
			//Check whether Name extracted is present in the array or not
			//Convert into Array into Array list for easy search
			List itemsNeededList = Arrays.asList(vegAdd);
			
		if (itemsNeededList.contains(formattedname))
			{
				j++;
				//click on add to card
				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
				if (j==vegAdd.length)
				{
					break;
				}
				
			}
			
		
		
		}

	}

}
