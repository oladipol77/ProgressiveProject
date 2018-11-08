

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class MultipleWindows {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Progressive Tech\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://accounts.google.com/signup");
		//System.out.println(driver.getTitle());
		driver.findElement(By.xpath("//*[@id=\"view_container\"]/form/div[2]/div/div[2]/div[2]/div")).click();
		
		
		//OR You can use another method
		
		Set<String>ids=driver.getWindowHandles();
		Iterator<String> it=ids.iterator();
		String parentid=it.next();
		String childid=it.next();
		driver.switchTo().window(childid);
		System.out.println(driver.getTitle());
	}

}
