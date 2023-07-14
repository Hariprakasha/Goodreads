package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignUpPOM {
	@FindBy(xpath="//input[@type='email']")
	WebElement EmailTextField;
	@FindBy(xpath="//input[@type='password']")
	WebElement PasswordTextField;
	@FindBy(xpath="//input[@id='signInSubmit']")
	WebElement SigninButton;
	public SignUpPOM(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	public void SignUp( String Email , String Password) throws InterruptedException
	{
		EmailTextField.sendKeys(Email);
		Thread.sleep(1000);
		PasswordTextField.sendKeys(Password);
		Thread.sleep(1000);
		SigninButton.click();
	}

}
