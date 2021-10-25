package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocateByIDAndName {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "lib/chromedriver.exe");
		//Create an object of ChromeBrowser- new instance of a browser
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		WebElement username = driver.findElement(By.id("login1"));
		username.sendKeys("Admin11");
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("admin@12");
		driver.findElement(By.name("proceed")).click();

	}

}
