package webdriverbasics;

import org.openqa.selenium.firefox.FirefoxDriver;

public class ExLaunchBrowserFirefox {

	public static void main(String args[]) {

		System.setProperty("webdriver.gecko.driver",
				"..\\OrangeHRM\\resources\\geckodriver.exe");

		FirefoxDriver driver=new FirefoxDriver();
		
		
		driver.get("http://127.0.0.1/orangehrm-3.0.1/symfony/web/index.php/auth/login");
		
		

	}

}
