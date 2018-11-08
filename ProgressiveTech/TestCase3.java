import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class TestCase3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.ie.driver", "C:\\Users\\Progressive Tech\\Downloads\\MicrosoftWebDriver (2).exe");
		WebDriver driver = new InternetExplorerDriver();
		driver.get("http://www.progressivecontent.com");
		System.out.println("Hi Ola");
		// driver.quit();

		int a = 4;
		int b = 6;
		int sum = a + b;

		System.out.println(sum);

		// Addition is 10
		System.out.println("addition is" + sum);
		driver.getCurrentUrl();
		// System.out.println(driver.getTitle());
		// System.out.println(driver.getPageSource());
		// driver.quit();
		/*
		 * driver.get("http://boohoo.com"); driver.navigate().back();
		 * driver.navigate().forward(); driver.close();
		 */

	}

}
