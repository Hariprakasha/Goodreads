package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPagePOM {
	@FindBy(xpath="//a[.='Sign In']")
	 WebElement signinlink;
//	@FindBy(xpath="//a[@id='fb-auth-button']/..//a[4]")
//	WebElement SignUpWithEmailBtn;
	@FindBy(xpath="//a[@id='fb-auth-button']/..//a[4]")
	WebElement SignUpWithEmailBtn;
	public LoginPagePOM(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}

	public void setlogin()
	{
		signinlink.click();
		SignUpWithEmailBtn.click();
		
	}
}
