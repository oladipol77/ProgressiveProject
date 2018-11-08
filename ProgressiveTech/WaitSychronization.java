import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitSychronization {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Progressive Tech\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		// driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);- IMLICIT Wait
		driver.get("https://alaskatrips.poweredbygps.com/");
		driver.findElement(By.id("package-origin-hp-package")).sendKeys("nyc");
		driver.findElement(By.id("package-origin-hp-package")).sendKeys(Keys.ENTER);
		driver.findElement(By.xpath("//*[@id=\"package-destination-hp-package\"]")).sendKeys("l");
		driver.findElement(By.xpath("//*[@id=\"package-destination-hp-package\"]")).sendKeys(Keys.ENTER);

		driver.findElement(By.id("package-departing-hp-package")).sendKeys("06/29/2018");
		driver.findElement(By.id("package-departing-hp-package")).sendKeys(Keys.ENTER);
		driver.findElement(By.id("package-returning-hp-package")).sendKeys("06/30/2018");
		driver.findElement(By.id("package-returning-hp-package")).sendKeys(Keys.ENTER);
		driver.findElement(By.id("By.")).click();

		// EXPLICIT Wait applicable to only one script/test
		// =============

		WebDriverWait d = new WebDriverWait(driver, 20);
		// d.until(ExpectedConditions.visibilityOfElementLocated(locator))
		// Thread.sleep(arg0);

	}

}
