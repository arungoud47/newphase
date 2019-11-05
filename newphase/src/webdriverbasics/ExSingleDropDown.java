package webdriverbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ExSingleDropDown {
	public static void main(String args[]) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"..\\OrangeHRM\\resources\\chromedriver.exe");

		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://127.0.0.1/orangehrm-3.0.1/symfony/web/index.php/auth/login");
		
		WebElement userName = driver.findElement(By.id("txtUsername"));
	
		userName.sendKeys("Vishnu");
		
		driver.findElement(By.name("txtPassword")).sendKeys("Vishnu");
		
		driver.findElement(By.className("button")).click();		
		
		
		Select jobTitle=new Select(driver.findElement(By.id("empsearch_job_title")));
		
		
		jobTitle.selectByVisibleText("Sr.Test Engineer");
		
		
	}
}
