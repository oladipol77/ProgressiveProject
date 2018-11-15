import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\Users\\Progressive Tech\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.co.uk/");
		
		driver.manage().window().maximize();
		Actions a = new Actions(driver); // parse the argument(driver)

		 WebElement move = driver.findElement(By.xpath("//*[@id=\"nav-link-yourAccount\"]/span[2]"));

		// writing to convert lower case to upper case letters
		/*a.moveToElement(driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"))).click().keyDown(Keys.SHIFT).sendKeys("hellos").build().perform();
		a.moveToElement(driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"))).click().keyDown(Keys.SHIFT).sendKeys("hallos").contextClick().build().perform();// Right Clicking

		a.moveToElement(driver.findElement(By.xpath("//*[@id=\"nav-link-yourAccount\"]/span[2]"))).build().perform();*/
		 
		 

	}

}
