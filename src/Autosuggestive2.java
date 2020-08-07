import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Autosuggestive2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\2020\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		//Thread.sleep(2000);
		//checkboxes - check before when it's not checked and check after it's checked
		//Use Testng for assertions
		
		//System.out.println(driver.findElement(By.cssSelector("input[name='ctl00$mainContent$chk_friendsandfamily']")).isSelected());
		Assert.assertFalse(driver.findElement(By.cssSelector("input[name='ctl00$mainContent$chk_friendsandfamily']")).isSelected());
		driver.findElement(By.cssSelector("input[name='ctl00$mainContent$chk_friendsandfamily']")).click();
		//System.out.println(driver.findElement(By.cssSelector("input[name='ctl00$mainContent$chk_friendsandfamily']")).isSelected());
		Assert.assertTrue(driver.findElement(By.cssSelector("input[name='ctl00$mainContent$chk_friendsandfamily']")).isSelected());
		
		//count the number of checkboxes on a page based on Locator elements
		System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());
		//Assert.assertEquals((driver.findElements(By.cssSelector("input[type='checkbox']")).size()), "6");
		
		
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXTaction")).click();
		driver.findElement(By.className("select_CTXT")).sendKeys("DEL");
		WebElement dest=driver.findElement(By.id("ctl00_mainContent_ddl_destinationStation1_CTXT"));
		dest.click();
		dest.sendKeys("Be");
		dest.sendKeys(Keys.ARROW_RIGHT);
		dest.sendKeys(Keys.ENTER);
		driver.findElement(By.name("ctl00$mainContent$view_date1")).click();
		driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-active")).click();
		
		//Select roundtrip option. isEnabled does not work sometimes so move to attribute in HTML div
		//System.out.println(driver.findElement(By.id("ctl00_mainContent_view_date2")).isEnabled());	
		System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));
		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
		System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));
		if (driver.findElement(By.id("Div1")).getAttribute("style").contains("1"))
		{
			System.out.println("It's enabled");
			Assert.assertTrue(true);
		}
		else
		{
			Assert.assertTrue(false);
		}
		
		
		/*
		driver.get("https://www.alaskaair.com/");
		driver.findElement(By.id("fromCity1")).clear();
		
		driver.findElement(By.id("fromCity1")).sendKeys("Las");
		Thread.sleep(2000);
		driver.findElement(By.id("fromCity1")).sendKeys(Keys.ENTER);
		//To City
		//Clear the fields after taking the repeating webelement into a variable
		WebElement dest1=driver.findElement(By.id("toCity1"));
		dest1.clear();
		dest1.sendKeys("Au");
		Thread.sleep(2000);
		dest1.sendKeys(Keys.ENTER);
			
			
		dest1.clear();
		//Choose diff target this time
		driver.findElement(By.id("fromCity1")).sendKeys("Las");
		Thread.sleep(2000);
		driver.findElement(By.id("fromCity1")).sendKeys(Keys.ENTER);
		dest1.sendKeys("ha");
		int i=0;
		while(i<5)
		{
			dest1.sendKeys(Keys.ARROW_DOWN);
			i=i+1;
		}
		dest1.sendKeys(Keys.ENTER);
		
		driver.findElement(By.cssSelector("form-control as-datepicker")).click();
		
		//Assert.assertEquals(By.id("fromCity1"), "Hattiesburg");
		
		driver.findElement(By.id("departureDate1")).click();
		driver.findElement(By.cssSelector("today selected"));
		
		
		//driver.findElement(By.id("fromCity1")).clear();
		//dest1.clear(); */
	}

}
