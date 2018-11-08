import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Calender2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Progressive Tech\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.path2usa.com/travel-companions");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(2,TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@id=\'travel_from\']")).sendKeys("Bethel Airport  (BET) Bethel");
		driver.findElement(By.xpath("//*[@id=\'travel_to\']")).sendKeys("John F. Kennedy International Airport  (JFK) New York");
		driver.findElement(By.xpath("//*[@name='travel_date']")).click();
		driver.findElement(By.cssSelector("td.active.day")).click();
		
		Select s=new Select(driver.findElement(By.id("datebetween")));
		s.selectByValue("2W");	
		Thread.sleep(5000L);
		Select s1=new Select(driver.findElement(By.xpath("//*[@id=\"travel_airline\"]")));
		s1.selectByVisibleText("China Airlines");
		Select s11=new Select(driver.findElement(By.id("travel_language")));
		s11.selectByVisibleText("Assamese");
		driver.findElement(By.xpath("//*[@id=\"searchform\"]/div[3]/div[2]/div/button")).click();
		System.out.println("No listing found");
		driver.navigate().forward();
		driver.get("https://en-gb.facebook.com/");
		driver.navigate().back();
	}

}
