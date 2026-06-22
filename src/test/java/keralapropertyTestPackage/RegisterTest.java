/*-----------------Register Test page Starts Here --------------*/

package keralapropertyTestPackage;

import org.testng.Assert;
import org.testng.annotations.Test;

import BasePackage.BaseClass;
import keralapropertyPagePackage.RegisterPage;

public class RegisterTest extends BaseClass {
	RegisterPage ob;

    @Test
    public void Main()
    {
        ob=new RegisterPage(driver);
        ob.loginclick();
        ob.registration("ajay","eric@gmail.com","123456","123456","1234567890");
      
        ob.signupclick();
        
    }

    @Test
    public void main2() {
        String pagesource=ob.textverification();
        Assert.assertTrue(pagesource.contains("Forgot"));
    }

}
/*-----------------Register Test page Ends Here --------------*/