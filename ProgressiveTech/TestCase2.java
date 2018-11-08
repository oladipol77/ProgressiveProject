import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestCase2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.gecko.driver",
				"C:\\Users\\Progressive Tech\\Downloads\\geckodriver-v0.20.1-win64 (1)\\geckodriver.exe");

		WebDriver driver = new FirefoxDriver();

		driver.get("http://progressivecon.wpengine.com/");
		driver.findElement(By.xpath("//*[@id=\"pcp-body\"]/main/section[1]/div/div[1]/div/div/div[2]/a")).click();
		Thread.sleep(2000L);
		driver.findElement(By.linkText("See more")).click();
		driver.findElement(By.className("scroll-top")).click();
		// driver.findElement(By.xpath("//*[@id=\"pcp-body\"]/main/section[2]/div[2]/div[1]/article/div[2]/a")).click();

		// System.out.println(driver.findElement(By.xpath("//*[@id=\'pcp-body\']/main/section[2]/div[2]/div[1]/article/div[2]/p")).getText());
		// System.out.println(driver.getTitle());
		// System.out.println("Hi yohantha");
		// driver.quit();

	}
}
