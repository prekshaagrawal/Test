package demo;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConfirmAlert {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "lib/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Alerts.html");
		driver.manage().window().maximize();
		
		driver.findElement(By.linkText("Alert with OK & Cancel")).click();
		
		try {
			Thread.sleep(5000);
			driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
			Alert alert= driver.switchTo().alert();
			String expected = "Press a Button !";
			String actual = alert.getText();
			
			System.out.println(actual);
			if(expected.equals(actual))	
			{
				System.out.println("Both Matches");
			}
			//Cancel Button click
			Thread.sleep(5000);
			alert.dismiss();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
