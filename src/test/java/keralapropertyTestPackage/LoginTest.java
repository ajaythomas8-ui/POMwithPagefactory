/*-----------------Login Test page Starts Here --------------*/
package keralapropertyTestPackage;

import org.testng.annotations.Test;

import BasePackage.BaseClass;
import keralapropertyPagePackage.LoginPage;

public class LoginTest extends BaseClass {
	@Test
    public void Main() throws InterruptedException
    {
        LoginPage ob=new LoginPage(driver);
        Thread.sleep(3000);
        ob.testing();
        ob.start("registerdemos12345@gmail.com","123456");
        ob.login();
       
    }
}
/*-----------------Login Test page Ends Here --------------*/