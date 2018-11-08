import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tables {

	private static int sum;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Progressive Tech\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		/*
		 * driver.get(
		 * "https://www.cricbuzz.com/live-cricket-scorecard/20468/cwib-vs-vck-final-global-t20-canada-2018"
		 * ); WebElement table=driver.findElement(By.
		 * cssSelector("div[class='cb-col cb-col-100 cb-ltst-wgt-hdr']")); int rowcount=
		 * table.findElements(By.
		 * cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms']")).size(); int
		 * count=table.findElements(By.
		 * cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] div:nth-child(3)")).
		 * size();
		 * 
		 * //for(int i=0;i<count;i++) for(int i=0;i<count-2;i++)
		 * 
		 * { //System.out.println(table.findElements(By.
		 * cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] div:nth-child(3)")).
		 * get(i).getText()); String value=table.findElements(By.
		 * cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] div:nth-child(3)")).
		 * get(i).getText(); int valueinteger= Integer.parseInt(value);
		 * sum=sum+valueinteger;
		 * 
		 * } //System.out.println(sum); String Extras=driver.findElement(By.xpath(
		 * "//div[text()='Extras']/following-sibling::div")).getText(); // Getting a
		 * value using text xpath int extrasValue=Integer.parseInt(Extras); int
		 * TotalSumValue=sum+extrasValue; System.out.println(TotalSumValue);
		 * 
		 * String ActualTotal=driver.findElement(By.xpath(
		 * "//div[text()='Total']/following-sibling::div")).getText(); int
		 * ActualTotalValue=Integer.parseInt(ActualTotal);
		 * if(ActualTotalValue==TotalSumValue) { System.out.println("Count Matches"); }
		 * else {
		 * 
		 * System.out.println("count fails"); }
		 * 
		 * //System.out.println(driver.findElement(By.xpath(
		 * "//div[text()='Extras']/following-sibling::div")).getText()); //siblings to
		 * siblings in Selenium //System.out.println(driver.findElement(By.xpath(
		 * "//div[text()='Total']/following-sibling::div")).getText()); } }
		 * 
		 * 
		 * 
		 * 
		 * 
		 * // PRACTICAL TEST
		 */

		driver.get("https://citypantry.com/");
		driver.findElement(By.xpath("/html/body/app-root/app-home/app-home-hero/div/div[2]/div[1]/a")).click();
		driver.navigate().back();
		driver.findElement(By.className("header-navigation__link")).click();
		driver.findElement(By.className("feature-button__text")).click();
		driver.findElement(
				By.xpath("/html/body/app-root/app-product/app-product-panel-meal-plan/div/div[1]/div/button")).click();
		Thread.sleep(5000L);

		driver.findElement(By.name("firstname")).sendKeys("Gboyega");
		driver.findElement(By.name("lastname")).sendKeys("David");
		driver.findElement(By.xpath("//input[@value='Submit']")).click();
		driver.findElement(By.className("dialog__close")).click();
		driver.findElement(
				By.xpath("/html/body/app-root/app-product/app-product-panel-office-food/div/div[2]/div/button"))
				.click();
		driver.findElement(By.xpath(
				"/html/body/app-root/app-search/app-search-parameters-popup/app-search-parameters-popup-content/app-logo-popup/app-modal/div/div/div/form/div[1]/app-parameters-form/div/div[1]/label/span[2]/input"))
				.sendKeys("se10 8df");
		Thread.sleep(5000L);
		driver.findElement(By.xpath(
				"/html/body/app-root/app-search/app-search-parameters-popup/app-search-parameters-popup-content/app-logo-popup/app-modal/div/div/div/form/div[2]/button"))
				.click();
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());

		// driver.findElement(By.className("search-card__image")).click();

		System.out.println(driver.findElement(By.className("header-navigation__link")).getText());
		driver.navigate().forward();
		driver.get("https://www.wokit.com");
		driver.findElement(By.id("u1875-2")).click();
		driver.findElement(By.className("input-branded")).sendKeys("se6 2rp");

		driver.findElement(By.xpath("/html/body/div[9]/div/div/div/form/div[3]/div/button[2]/span")).click();

		{

		}

	}
}