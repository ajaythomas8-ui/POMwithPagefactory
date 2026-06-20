
/*-----------------Base class Starts Here --------------*/
package BasePackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

public class BaseClass {
	public WebDriver driver;
    public String url="https://keralaproperty.in/member/login/";
    @BeforeMethod
    public void Start() throws InterruptedException
    {
        driver=new ChromeDriver();
        driver.get(url);
        Thread.sleep(5000);
        
    }
}
/*-----------------Base class ends Here --------------*/