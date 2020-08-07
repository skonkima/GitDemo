import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdownstatic {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\2020\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://spicejet.com/");
		//Selecting the Departure - Gives error commenting out
		driver.findElement(By.cssSelector("[id='ctl00_mainContent_ddl_originStation1_CTXT']")).click();
		driver.findElement(By.cssSelector("a[value='HYD']")).click();
		Thread.sleep(2000);
		//driver.findElement(By.xpath("(//a[@value='PNY'])[2]")).click();
		//Find 'PNY' without Index but using Parent/Child relationship
		driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR']//a[@value='PNY']")).click();		
		
		/*
		//Selecting the Currency
		Select s=new Select(driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency")));
		s.selectByValue("USD");
		
		//Selecting number of Adults (10)
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
		driver.findElement(By.id("divpaxinfo")).click();
		Select a = new Select(driver.findElement(By.id("ctl00_mainContent_ddl_Adult")));
		a.selectByValue("9");
		driver.findElement(By.id("divpaxinfo")).click();
		driver.findElement(By.id("ctl00_mainContent_btn_FindFlights")).click();
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
		*/
	}

}
