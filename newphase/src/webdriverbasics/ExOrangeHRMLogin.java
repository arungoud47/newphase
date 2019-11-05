package webdriverbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExOrangeHRMLogin {
	public static void main(String args[]) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"..\\OrangeHRM\\resources\\chromedriver.exe");

		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://127.0.0.1/orangehrm-3.0.1/symfony/web/index.php/auth/login");
		
		WebElement userName = driver.findElement(By.id("txtUsername"));
		
		userName.clear();
		userName.sendKeys("Rahul");
		
		driver.findElement(By.name("txtPassword")).sendKeys("Rahul");
		
		driver.findElement(By.className("button")).click();
		
		
		driver.findElement(By.partialLinkText("Welcome")).click();
		
		Thread.sleep(3000);
		
		driver.findElement(By.linkText("Logout")).click();
		
	}
}
