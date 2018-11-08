import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class progCon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Progressive Tech\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.progressivecontent.com/");
		System.out.println(driver.findElements(By.tagName("a")).size());

		driver.findElement(By.xpath("//*[@id=\'pcp-body\']/main/section[7]"));
		WebElement footerdriver = driver.findElement(By.xpath("//*[@id='pcp-body']/main/section[7]"));
		System.out.println(footerdriver.findElements(By.tagName("a")).size());
		System.out.println(driver.getTitle());
	}

}
