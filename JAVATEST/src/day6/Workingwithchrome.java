package day6;

import org.openqa.selenium.chrome.ChromeDriver;




public class Workingwithchrome {
	
	
   
	public void invokebrowser() {
	
	    ChromeDriver driver;
		System.setProperty("webdriver.chrome.driver", "C:/Users/C58810/ECD/chromedriver_win32/chromedriver_win32/chromedriver.exe");
		
		driver = new ChromeDriver();
driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("http://intranet.nl.eu.abnamro.com");
	}
}
