import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButtons {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Progressive Tech\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("http://www.echoecho.com/htmlforms10.htm");
		driver.findElement(By.xpath("//input[@value='Milk']")).click();
		driver.findElement(By.xpath("//input[@value='Butter']")).click();
		driver.findElement(By.cssSelector("input[value='Cheese']")).click();

		// for group buttons
		// ===================
		 System.out.println(driver.findElements(By.xpath("//input[@name='group1']")).size()); 

		// Use int count method to select all Radio buttons

		/*
		 * int count=driver.findElements(By.xpath("//input[@name='group1']")).size();
		 * 
		 * for(int i=0;i<count;i++)
		 */
		{

			// driver.findElements(By.xpath("//input[@name='group1']")).get(i).click();
			// System.out.println(driver.findElements(By.xpath("//input[@name='group1']")).get(i).getAttribute("value"));

			// String
			// text=(driver.findElements(By.xpath("//input[@name='group1']")).get(i).getAttribute("value"));

			// if (text.equals("Cheese"));
			// if (text==("Cheese"));
			{

				// driver.findElements(By.xpath("//input[@name='group1']")).get(i).click();
			}
		}

	}
}