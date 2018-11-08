import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class sslCertification {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// SSL/HTTPS Certification

		// General chrome profile
		/*
		 * DesiredCapabilities ch=DesiredCapabilities.chrome();
		 * ch.acceptInsecureCerts();
		 * ch.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
		 * ch.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
		 * 
		 * //Belongs to your local browser ChromeOptions c=new ChromeOptions();
		 * c.merge(ch); //Desired capabilities is a class that helps you to customise
		 * your chrome browser
		 * 
		 * System.setProperty("webdriver.chrome.driver",
		 * "C:\\Users\\Progressive Tech\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe"
		 * ); WebDriver driver=new ChromeDriver(c);
		 */

		DesiredCapabilities ch = DesiredCapabilities.chrome();
		ch.acceptInsecureCerts();
		ch.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
		ch.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
		ChromeOptions c = new ChromeOptions();
		c.merge(ch);
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Progressive Tech\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(c);
		driver.get(0);

	}

}
