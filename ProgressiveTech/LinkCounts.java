import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkCounts {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		// Counting all links on a web page

		System.setProperty("webdriver.chrome.driver","C:\\Users\\Progressive Tech\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("http://www.qaclickacademy.com/practice.php");
		System.out.println(driver.findElements(By.tagName("a")).size());

		// Finding just all the links in the footer page of web page //a

		driver.findElement(By.id("gf-BIG"));

		WebElement footerdriver = driver.findElement(By.id("gf-BIG")); // Limiting webdriver scope
		// footerdriver.findElements(By.tagName("a")).size());
		System.out.println(footerdriver.findElements(By.tagName("a")).size());
		System.out.println(driver.getTitle());

		// 3. Checking the link count of only the 1st column in footer page

		WebElement columndriver = footerdriver.findElement(By.xpath("//*[@id=\"gf-BIG\"]/table/tbody/tr/td[1]/ul"));
		System.out.println(columndriver.findElements(By.tagName("a")).size());

		// Clicking on each link in the column and check if pages are opening
		for (int i = 1; i < (columndriver.findElements(By.tagName("a")).size()); i++) {

			String clickonlinkTab = Keys.chord(Keys.CONTROL, Keys.ENTER);
			columndriver.findElements(By.tagName("a")).get(i).sendKeys(clickonlinkTab);

			Thread.sleep(5000L);

			// steps opens all the tabs
			Set<String> abc = driver.getWindowHandles();
			Iterator<String> it = abc.iterator();

			while (it.hasNext()) {

				driver.switchTo().window(it.next());
				System.out.println(driver.getTitle());
			}

		}

	}
}
