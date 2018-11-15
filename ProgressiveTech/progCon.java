import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class progCon {

	private static final String TimeUnits = null;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Progressive Tech\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.vashi.com/");
		driver.manage().window().maximize();
		/*System.out.println(driver.findElements(By.tagName("a")).size());
		WebElement footerdriver=driver.findElement(By.xpath("/html/body/div[2]/footer"));
		System.out.println(footerdriver.findElements(By.tagName("a")).size());*/

		/*driver.findElement(By.xpath("//*[@id=\'pcp-body\']/main/section[7]"));
		WebElement footerdriver = driver.findElement(By.xpath("//*[@id='pcp-body']/main/section[7]"));
		System.out.println(footerdriver.findElements(By.tagName("a")).size());
		WebElement columndriver=driver.findElement(By.xpath("//*[@id=\"pcp-body\"]/main/section[7]/div/div/div/div[2]"));
		System.out.println(columndriver.findElements(By.tagName("a")).size());
		System.out.println(driver.getTitle());*/
		
		
		/*Select s=new Select(driver.findElement(By.xpath("//*[@id=\"region-6500cd04-202c-4596-be25-9ac3f5abdf41\"]")));
		s.selectByValue("The Americas");
		Select s1=new Select(driver.findElement(By.xpath("//*[@id=\"region-6500cd04-202c-4596-be25-9ac3f5abdf41\"]")));
		s1.selectByValue("Europe, Middle East & Africa");
	
		Thread.sleep(5000L);
		driver.findElement(By.xpath("//input[@value='Subscribe']")).click();*/
		
		
		System.out.println(driver.findElements(By.tagName("a")).size());
		WebElement footerdriver=driver.findElement(By.xpath("//*[@id=\"footer\"]/div[1]"));
		System.out.println(footerdriver.findElements(By.tagName("a")).size());
		WebElement columndriver=driver.findElement(By.xpath("//*[@id=\"footer\"]/div[1]/div/div[1]"));
		System.out.println(columndriver.findElements(By.tagName("a")).size());
		System.out.println(driver.getPageSource());
		
		
	}

}
