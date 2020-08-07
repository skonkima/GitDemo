import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class framestest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\2020\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/droppable");
		//Use index to identity frame
		//System.out.println(driver.findElements(By.tagName("iframe")).size());
		//driver.switchTo().frame(0);
		//Use webelement to get frame
		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe.demo-frame")));
		//driver.findElement(By.id("draggable")).click();
		//drag and drop
		Actions a=new Actions(driver);
		WebElement source=driver.findElement(By.id("draggable"));
		WebElement target=driver.findElement(By.id("droppable"));
		a.dragAndDrop(source, target).build().perform();
		//to switch to other window from frame
		driver.switchTo().defaultContent();
		//info@qaclickacademy.com - provide resume inputs
	}

}
