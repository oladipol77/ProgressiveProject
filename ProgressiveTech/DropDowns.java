import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDowns {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Progressive Tech\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.premierinn.com");
		driver.manage().window().maximize();

		// Static drop downs
		// ============

		Select s = new Select(driver.findElement(By.xpath("//*[@id=\'search-console-form\']/search-console-form-nights/select")));
		// Only use select class when you have select class in HTML web Element
		s.selectByValue("2");
		driver.findElement(By.xpath("//*[@id='search-console-form']/drop-down-group/button")).click();
		Select s1 = new Select(driver.findElement(By.xpath("//*[@id=\"room-picker\"]/rooms/fieldset/div[1]/select")));
		s1.selectByValue("2");
		Select s11 = new Select(driver.findElement(By.name("children")));
		s11.selectByValue("2");
		System.out.println(driver.findElement(By.xpath("//*[@id=\"room-picker\"]/rooms/fieldset/div[8]/label/checked-icon/svg")).isSelected());
		driver.findElement(By.xpath("//*[@id=\"room-picker\"]/rooms/fieldset/div[8]/label/checked-icon/svg")).click();
		System.out.println(driver.findElement(By.xpath("//*[@id=\"room-picker\"]/rooms/fieldset/div[8]/label/checked-icon/svg")).isSelected());

		Select s111 = new Select(driver.findElement(By.xpath("//*[@id=\"room-picker\"]/rooms/fieldset/div[4]/select")));
		s111.selectByVisibleText("Family");
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//*[@type='button']")).click();
		/*
		 * driver.findElement(By.xpath(
		 * "//*[@id=\'room-picker\']/rooms/fieldset/div[3]/label/checked-icon/svg")).
		 * click();
		 * driver.findElement(By.xpath("//*[@id=\'room-picker\']/button")).click();
		 */
		// System.out.println(driver.getTitle());*/
		// s.selectByIndex(7);
		// s.selectByVisibleText("5 Adults");
		// driver.close();*/

		// Dynamic drop down
		// =================
		// driver.findElement(By.xpath("//*[@id='jet2']/div[3]/div[4]/div/div[3]/div/div[2]/form/div/div[3]/div[2]/div/div/a[2]")).click();
		// driver.findElement(By.xpath("//*[@id='jet2']/div[3]/div[4]/div/div[3]/div/div[2]/div[1]/div[2]/div/div[1]/ul/li[3]/a")).click();

		// Checkbox

		// isSelected()- tells if a checkbox is selected
		// driver.findElement(By.xpath("//*[@id=\'id8\']")).click();
		// System.out.println(driver.findElement(By.xpath("//*[@id=\'id8\']")).isSelected());

	}

}
