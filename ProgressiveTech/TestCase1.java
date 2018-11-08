import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Progressive Tech\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		// NOTE
		// =============
		//// tagName[@attribute='value'] or //*[@attribute='value']- xpath

		// tagName[attribute='value']- CSS
		// Regular expression in Xpath
		// ==============================
		//// tagName[contains(@attribute, 'value']- xpath

		// tagName[attribute*='value']- CSS

		// driver.get("http://www.facebook.com");
		// System.out.println("Hi yohantha");
		// driver.quit();

		/*
		 * driver.findElement(By.id("email")).sendKeys("Tuanana@ymail.com");
		 * driver.findElement(By.id("pass")).sendKeys("Goldgoat999");
		 * driver.findElement(By.id("loginbutton")).click(); driver.close();
		 */

		driver.get("http://www.facebook.com");
		driver.findElement(By.id("email")).sendKeys("tuanana@ymail.com");
		driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("Goldgoat999");
		// driver.findElement(By.xpath("//*[@name='pass']")).sendKeys("Goldgoat999");
		// driver.findElement(By.cssSelector("input[value='Log In']")).click();
		driver.findElement(By.cssSelector("[value='Log In']")).click();
		System.out.println(driver.getTitle());
		driver.close();

	}

}
