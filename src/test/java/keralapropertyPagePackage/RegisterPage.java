
/*-----------------Register Page Starts Here --------------*/
package keralapropertyPagePackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage {
WebDriver driver;
  @FindBy(xpath="/html/body/header/div[1]/div/a[1]")
   WebElement Link;
  
  @FindBy(xpath="/html/body/div[3]/div/div/div/div[2]/div[2]/a")
  WebElement Newuser;
  
  
    @FindBy(id="utitle")
    WebElement name;
    
    @FindBy(id="umail")
    WebElement email;
    
    @FindBy(id="memberpass")
    WebElement password;
    
    @FindBy(id="repass")
    WebElement cnfpassword;
    
    @FindBy(id="umobile")
    WebElement mobile;
    
    
    @FindBy(id="sub_regbutton")
    WebElement Registerbutton;
    
    
//    public Registerpage(WebDriver driver) 
//    {
//        this.driver=driver;
//        PageFactory.initElements(driver,this);
//    }

    public RegisterPage(WebDriver driver) {
    	this.driver=driver;
    	 PageFactory.initElements(driver, this);
		// TODO Auto-generated constructor stub
	}
    

	public void registration(String username,String usermail,String userpass,String usercnfpass,String usermobile)
    {
    	name.sendKeys(username);
    	email.sendKeys(usermail);
    	password.sendKeys(userpass);
    	cnfpassword.sendKeys(usercnfpass);
    	mobile.sendKeys(usermobile);
    	
    }
	
	public void loginclick()
	{
		Link.click();
		Newuser.click();
		
	}
    
    public String textverification()
    {
        String src=driver.getPageSource();
        return src;
    }
    public void signupclick()
    {
    	Registerbutton.click();
    }
}
/*-----------------Register Page Ends Here --------------*/
