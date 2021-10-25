package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocateLinks {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "lib/chromedriver.exe");
		//Create an object of ChromeBrowser- new instance of a browser
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in/");
		driver.findElement(By.linkText("Gmail")).click();
		String title= driver.getTitle();
		if(title.equals("Gmail - Email from Google"))
		{
			System.out.println("Gmail - Pass");
		}
		driver.navigate().back();
		driver.findElement(By.linkText("Images")).click();
		title =driver.getTitle();
		if(title.equals("Google Images")) {
			System.out.println("Images -Pass");
			
		}
		driver.navigate().back();
		driver.findElement(By.partialLinkText("Advertising"));
		title= driver.getTitle();
		if(title.equals("Get More Customers With Easy Online Advertising | Google Ads")) {
			System.out.println(" Advertising - Pass");
		}
		driver.navigate().back();
		driver.findElement(By.partialLinkText("  How Search works ")).click();
		driver.close();
	}
	
}
