import org.openqa.selenium.WebDriver;
 import org.openqa.selenium.chrome.ChromeDriver;
 import org.testng.annotations.Test;


public class chrome {

@Test public void test(){

    System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32(2)\\chromedriver");
    ChromeDriver driver = new ChromeDriver();
    driver.get("http:\\yahoo.com");
}

}