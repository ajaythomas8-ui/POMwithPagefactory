
/*-----------------Login Page Starts Here --------------*/

package keralapropertyPagePackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
WebDriver driver;
    
    @FindBy(id="ulogin")//webelement email=driver.findelement(By.id("email")); 
    WebElement username;
    
    @FindBy(id="upass") 
    WebElement password;
    
    @FindBy(id="sub_logbtn")
    WebElement Loginbutton;
    
    @FindBy(xpath="/html/body/header/div[1]/div/a[1]")
    WebElement Link;
    
//    public Fbloginpage(WebDriver driver)
//    {
//        this.driver=driver;
//        PageFactory.initElements(driver, this);
//    }
    
    public void testing()
    {
    	Link.click();
    }
    

    public LoginPage(WebDriver driver) {
	this.driver=driver;
    PageFactory.initElements(driver, this);//to start webelements
	}

	public void start(String eemail,String ppass)
    {
        username.sendKeys(eemail);
        password.sendKeys(ppass);
    }
    
    public void login()
    {
        Loginbutton.click();
    }
}
/*-----------------Login Page Ends Here --------------*/