import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FormMethods {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Progressive Tech\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		// WebDriver driver=new ChromeDriver();
		// driver.get("http://esky.co.uk/flights");
		// Thread.sleep(3000L);
		// Methods for visible and invisible mode in a form
		// Is displaced is used when particular object is in code base but it is in
		// visible mode or not

		WebDriver driver = new ChromeDriver();
		driver.get("https://facebook.com");
		driver.findElement(By.id("email")).sendKeys("device.progressive@gmail.com");
		Thread.sleep(3000);
		driver.findElement(By.name("pass")).sendKeys("PurpleApple44");
		driver.findElement(By.xpath("//*[@value='Log In']")).click();
		System.out.println(driver.findElement(By.xpath("//*[@id=\"globalContainer\"]/div[3]/div/div/div")).getText());

		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		driver.quit();

		/*
		 * driver.findElement(By.linkText("Sign in")).click();
		 * driver.findElement(By.name("username")).sendKeys("Oladipol@yahoo.com");
		 * driver.findElement(By.name("signin")).click();
		 * driver.findElement(By.name("password")).sendKeys("London123");
		 * driver.findElement(By.id("login-signin")).click();
		 * driver.findElement(By.xpath("//*[@id=\'login-signin\']")).click();
		 * System.out.println(driver.getCurrentUrl());
		 * System.out.println(driver.getTitle()); driver.close();
		 */

		/*
		 * System.out.println(driver.findElement(By.id("departureDateRoundtrip1")).
		 * isDisplayed()); driver.findElement(By.name("ot")).click();
		 * System.out.println(driver.findElement(By.id("departureDateRoundtrip1")).
		 * isDisplayed()); System.out.println(driver.findElement(By.xpath(
		 * "//*[@id='multiQsf']/div[1]/div[3]/div/div[2]/a/span[2]")).getText());
		 */

		// If you want to validate object which is present in web pages or code base
		// int count=driver.findElements(By.name("ot")).size();
		// if (count==0)
		{
			// System.out.println("verified");

		}

	}
}