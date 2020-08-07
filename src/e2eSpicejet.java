import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class e2eSpicejet {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		// ###Set up Steps and launch website###
		System.setProperty("webdriver.chrome.driver", "C:\\2020\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.spicejet.com/");

		// ###Select One Way Option###
		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_0")).click();

		// ###Select checkbox option Family and Friends###
		Assert.assertFalse(driver.findElement(By.cssSelector("input[name='ctl00$mainContent$chk_friendsandfamily']"))
				.isSelected());
		driver.findElement(By.cssSelector("input[name='ctl00$mainContent$chk_friendsandfamily']")).click();
		Assert.assertTrue(driver.findElement(By.cssSelector("input[name='ctl00$mainContent$chk_friendsandfamily']"))
				.isSelected());

		// ###Select Source and Destination###
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXTaction")).click();
		driver.findElement(By.className("select_CTXT")).sendKeys("DEL");
		WebElement dest = driver.findElement(By.id("ctl00_mainContent_ddl_destinationStation1_CTXT"));
		dest.click();
		dest.sendKeys("Be");
		dest.sendKeys(Keys.ARROW_RIGHT);
		// dest.click();
		dest.sendKeys(Keys.ENTER);

		// ###Select today's date###
		driver.findElement(By.name("ctl00$mainContent$view_date1")).click();
		driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-active")).click();
		if (driver.findElement(By.id("Div1")).getAttribute("style").contains("0.5")) {
			System.out.println("It's disabled");
			Assert.assertTrue(true);
		} else {
			Assert.assertTrue(false);
		}

		// ###Select 2 Adults by clicking on the field and incrementing by 1###
		Thread.sleep(2000L);
		driver.findElement(By.id("divpaxinfo")).click();
		for (int i = 1; i < 3; i++) {
			Select a = new Select(driver.findElement(By.id("ctl00_mainContent_ddl_Adult")));
			a.selectByValue("2");
		}
		driver.findElement(By.id("divpaxinfo")).click();

		// ###Click on Search button###
		driver.findElement(By.cssSelector("input[value='Search']")).click();

		// ###Alert shows after select. Get the text and also click on OK###
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().accept();

		// ###Select 4 adults since Friends and Family checkbox is selected###
		driver.findElement(By.id("divpaxinfo")).click();
		for (int j = 1; j < 5; j++) {

			Select b = new Select(driver.findElement(By.id("ctl00_mainContent_ddl_Adult")));
			b.selectByValue("4");
		}
		driver.findElement(By.id("divpaxinfo")).click();

		// ###Click on Search button###
		driver.findElement(By.cssSelector("input[value='Search']")).click();
	}

}
