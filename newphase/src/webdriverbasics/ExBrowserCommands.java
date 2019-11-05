package webdriverbasics;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ExBrowserCommands {
	public static void main(String args[]) {

		/*System.setProperty("webdriver.chrome.driver", "..\\OrangeHRM\\resources\\chromedriver.exe");

		ChromeDriver driver = new ChromeDriver();*/
		
		System.setProperty("webdriver.gecko.driver",
				"..\\OrangeHRM\\resources\\geckodriver.exe");

		FirefoxDriver driver=new FirefoxDriver();

		driver.get("http://127.0.0.1/orangehrm-3.0.1/symfony/web/index.php/auth/login");

		driver.manage().window().maximize();

		System.out.println("Title Is: " + driver.getTitle());

		System.out.println("URL is: " + driver.getCurrentUrl());

		System.out.println("Page source is: " + driver.getPageSource());

		// driver.close();
		driver.navigate().refresh();

		driver.navigate().back();

		driver.navigate().forward();

		driver.quit();

	}
}
