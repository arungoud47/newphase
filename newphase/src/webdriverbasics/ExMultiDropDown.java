package webdriverbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ExMultiDropDown {
	public static void main(String args[]) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"..\\OrangeHRM\\resources\\chromedriver.exe");

		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://127.0.0.1/orangehrm-3.0.1/symfony/web/index.php/auth/login");
		
		WebElement userName = driver.findElement(By.id("txtUsername"));
	
		userName.sendKeys("Vishnu");
		
		driver.findElement(By.name("txtPassword")).sendKeys("Vishnu");
		
		driver.findElement(By.className("button")).click();		
		driver.findElement(By.id("menu_admin_viewAdminModule")).click();
		driver.findElement(By.id("menu_admin_Job")).click();
		driver.findElement(By.id("menu_admin_workShift")).click();
		
		driver.findElement(By.id("btnAdd")).click();
		
		driver.findElement(By.id("workShift_name")).sendKeys("Day");
		
		driver.findElement(By.id("workShift_hours")).sendKeys("8");
		
		
		Select availableEmps=new Select(driver.findElement(By.id("workShift_availableEmp")));
		
		availableEmps.selectByValue("57");
		availableEmps.selectByValue("55");
		availableEmps.selectByValue("56");
		
		availableEmps.deselectByValue("55");

		
		System.out.println(availableEmps.isMultiple());
		
		
		//availableEmps.deselectAll();
		
	
	}
}
