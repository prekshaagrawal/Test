package demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebBrowser {

	public static WebDriver openBrowser(String url) {
		System.setProperty("webdriver.chrome.driver", "lib/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		return driver;
	}
	
	public static void verifyTitle(WebDriver driver,String exptitle)
	{
		String acttitle= driver.getTitle();
		if(acttitle.equals(exptitle)) {
			System.out.println("Title Matched");
		}
		else
			System.out.println("Title not Matched");
	}
}
