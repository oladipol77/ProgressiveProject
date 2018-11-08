import java.io.File;
import java.nio.file.Files;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.os.WindowsUtils;
//import org.apache.commons.io.FileUtils;

public class cOOKIES {

	/*
	 * private static final int FILE = 0; private static final int OutputType = 0;
	 * private static final String src = null;
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Progressive Tech\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().deleteCookieNamed("abcd");

		// TAKING SCREESHOTS USING SELENIUM
		// ==================================
		// FIRSTLY, CONVERT DRIVER OBJECT TO SCREENSHOT

		driver.get("http://google.com");
		/*
		 * File src= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		 * FileUtils.copyFile(src,new File("C://screenshot.png"));
		 */

		// KILLING PROCESS OR COOKIES
		// =============================

		WindowsUtils.killByName("excel.exe");

	}

}
