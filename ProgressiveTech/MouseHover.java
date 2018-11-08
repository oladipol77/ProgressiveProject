import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\Users\\Progressive Tech\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.ebay.co.uk/");
		
		driver.manage().window().maximize();
		Actions a=new Actions(driver);
		a.moveToElement(driver.findElement(By.xpath("//*[@id=\'mainContent\']/div[1]/ul/li[3]/a"))).click().build().perform();
		a.moveToElement(driver.findElement(By.xpath("//input[@type='text']"))).click().keyDown(Keys.SHIFT).sendKeys("sleeves").build().perform();
		a.moveToElement(driver.findElement(By.xpath("//input[@type='text']"))).click().keyDown(Keys.SHIFT).doubleClick().build().perform();
		System.out.println(a.moveToElement(driver.findElement(By.xpath("//input[@type='text']"))).click());
		System.out.println(driver.findElements(By.tagName("a")).size());
		System.out.println(driver.getTitle());
		
		WebElement Footerdriver=driver.findElement(By.xpath("//*[@id=\"glbfooter\"]"));
		System.out.println(Footerdriver.findElements(By.tagName("a")).size());
		WebElement columndriver=driver.findElement(By.xpath("//*[@id=\"gf-l\"]/li[1]/a"));
		System.out.println(columndriver.findElements(By.tagName("a")).size());
		
		
	}

}
