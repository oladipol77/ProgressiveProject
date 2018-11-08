import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FrameTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Progressive Tech\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://jqueryui.com/droppable/");
		System.out.println(driver.findElements(By.tagName("iframe")).size());
		
		//driver.switchTo().frame(0); // - by index where first frame reads(0)
		//System.out.println(driver.findElements(By.tagName("iframe")).size()); // - use to find how many iframe you have
																				// in the application

		 driver.switchTo().frame(driver.findElement(By.className("demo-frame")));

		Actions a = new Actions(driver); // 1ST STEP
		
		WebElement source = driver.findElement(By.id("draggable"));
		WebElement target = driver.findElement(By.id("droppable"));

		a.dragAndDrop(source, target).build().perform(); //2ND STEP 
		
		// Once you are done with all frame actions and want to get back to normal web
		// pages invoke to continue locating elements

		driver.switchTo().defaultContent();

	}

}
