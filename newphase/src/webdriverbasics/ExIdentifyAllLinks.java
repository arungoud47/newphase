package webdriverbasics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExIdentifyAllLinks {
	public static void main(String args[]) {

		System.setProperty("webdriver.chrome.driver",
				"..\\OrangeHRM\\resources\\chromedriver.exe");

		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://127.0.0.1/orangehrm-3.0.1/symfony/web/index.php/auth/login");         
		
		List<WebElement> links = driver.findElements(By.tagName("a"));		
		
		System.out.println("Total links: " +links.size());

	}
}
